package com.example.recuperacion

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recuperacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*var listaDatos : MutableList<Persona> = mutableListOf()
        listaDatos.add(Persona("Ana","Mujer"))
        listaDatos.add(Persona("Marcos","Hombre"))*/
        val listaViewModel :ListaPersona by viewModels()
        val ultimoNombreViewModel: UltimoNombre by viewModels()
        //binding.tvUltimoNombre.text=ultimoNombreViewModel.nombre.value.toString()

        //binding.rvPersonas.adapter=PersonaAdapter(listaDatos)
        binding.rvPersonas.adapter=PersonaAdapter(listaViewModel.lista.value?: mutableListOf())
        //binding.rvPersonas.adapter=PersonaAdapter(listaViewModel.lista.value!!)
         val listaDatos= listaViewModel.lista.value!!
        binding.rvPersonas.layoutManager= LinearLayoutManager(this)


        var launcher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){ resultado ->
                if(resultado.resultCode== Activity.RESULT_OK){
                    val personaRecibida:Persona= resultado.data?.getParcelableExtra<Persona>("persona_insertada",Persona::class.java)!!
                    Log.d("depurando","Persona recibida: ${personaRecibida.nombre} - ${personaRecibida.sexo}")
                    listaDatos.add(personaRecibida)
                    ultimoNombreViewModel.nombre.value=personaRecibida.nombre
                    binding.tvUltimoNombre.text=ultimoNombreViewModel.nombre.value.toString()
                    binding.rvPersonas.adapter?.notifyDataSetChanged()
                //binding.tvDatoRecibido.text= it.data?.getStringExtra("dato").toString()
                }
            }



        binding.bAvanzar.setOnClickListener {
            var intent= Intent(this, MainActivity2::class.java)
            launcher.launch(intent)
        }
    }
}