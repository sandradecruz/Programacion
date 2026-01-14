package com.example.recuperacion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UltimoNombre: ViewModel() {
    var nombre= MutableLiveData<String>("")
}