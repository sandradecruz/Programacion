package com.example.recuperacion

import android.icu.lang.UCharacterEnums
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recuperacion.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var person :Persona = Persona("Juan")
        binding.persona=person

        binding.bAnadir.setOnClickListener {
            var persona:Persona= Persona(binding.etNombre.text.toString())
            if (binding.rbHombre.isChecked)
                persona.sexo="Hombre"
            else if (binding.rbMujer.isChecked)
                persona.sexo="Mujer"

            intent.putExtra("persona_insertada",persona)
            setResult(RESULT_OK,intent)
            finish()
        }


    }
}