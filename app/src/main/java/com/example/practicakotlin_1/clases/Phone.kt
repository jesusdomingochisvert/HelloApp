package com.example.practicakotlin_1.clases

open class Phone(val number: Int) { //Declaracion de ATRIBUTOS

    fun call() {

        println("Llamando...")
        //println(number)

    }

    open fun showNumber() {

        println(number)

    }

}