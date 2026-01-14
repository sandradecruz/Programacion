package com.example.recuperacion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListaPersona:ViewModel() {

    var lista = MutableLiveData<MutableList<Persona>>(mutableListOf(
        Persona("Luis", "Hombre"),
        Persona("Marta", "Mujer")
    ))
}