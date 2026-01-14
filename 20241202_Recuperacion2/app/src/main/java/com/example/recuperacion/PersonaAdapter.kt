package com.example.recuperacion

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recuperacion.databinding.ElementoPersonaBinding
import com.google.android.material.snackbar.Snackbar

class PersonaAdapter(val listaDatos: MutableList<Persona>): RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonaViewHolder {
        val binding= ElementoPersonaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PersonaViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: PersonaViewHolder,
        position: Int
    ) {
        val persona= listaDatos[position]
        holder.binding.personaItem=persona
        holder.binding.tvNombreCV.setOnClickListener {
            Snackbar.make(holder.binding.tvNombreCV,persona.nombre, Snackbar.LENGTH_LONG).show()
        }
        holder.binding.ivBorrar.setOnClickListener {
            listaDatos.remove(persona)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int = listaDatos.size


    class PersonaViewHolder(val binding: ElementoPersonaBinding): RecyclerView.ViewHolder(binding.root){
            }
}