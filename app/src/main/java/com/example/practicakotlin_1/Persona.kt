package com.example.practicakotlin_1

data class Persona(val nombre: String, val apellido: String, val edad: Int, val altura: Double,
                   val peso: Double, val estado: Boolean) {

    fun hablar() {

        if (estado) {

            println("Hola, me llamo Jesus.")

        } else {

            println("...")

        }

    }

}