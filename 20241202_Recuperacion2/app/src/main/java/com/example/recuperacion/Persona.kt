package com.example.recuperacion

import android.os.Parcel
import android.os.Parcelable


class Persona (var nombre:String) : Parcelable {
    var sexo: String="Hombre"

    constructor(nombre: String, sexo: String) : this(nombre){
        this.sexo=sexo
    }

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(sexo)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "$nombre"
    }

    companion object CREATOR : Parcelable.Creator<Persona> {
        override fun createFromParcel(parcel: Parcel): Persona {
            return Persona(parcel)
        }

        override fun newArray(size: Int): Array<Persona?> {
            return arrayOfNulls(size)
        }
    }
}