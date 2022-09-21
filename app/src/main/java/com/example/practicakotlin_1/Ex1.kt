package com.example.practicakotlin_1

import java.lang.Math.abs

fun main() {

    //Imprimir por pantalla

    println("Hola Kotlin")

    //Constantes(VAL)

    //val a = 2 --->
    //val a = "Hola"
    //val a = "Hola"
    val a = true
    val b = 3

    println(a)
    println("a = $a")
    println("b = $b")

    //Variables(VAR)

    var c : Int

    var objNull : String
    //var objNull : Any?

    c = 5

    println("c = $c")

    //objNull = null

    objNull = "Hola"

    if (objNull != null) {

        println(objNull)

    }

    println(objNull)

    //Metodos

    newTopic("Hola Kotlin")

    val n1 = 1
    val n2 = 2

    println(sum(n1, n2))
    println(sub(n1, n2))
    println(sub2(n1, n2))

    sayHello()

    newTopic("INFIX")

    var d = 3

    println(d.enableAbs(true))

    println("$b - $c = ${sum(b, d)}")
    println("$b - $c = ${sum(b, d)}")
    println("$b - $c = ${sum(b, d)}")

    newTopic("SOBRECARGA")

    showProduct("Coca-Cola")
    showProduct("Coca-Cola", "10%")
    showProduct("Cafe")
    showProduct("Caramelos", "15%")
    showProduct("Coca-Cola", validez = "15 de marzo")

}

fun newTopic(topic : String) {

    println()
    print("========== ~$topic ==========")
    println()

}

fun sayHello() : Unit {

    println("Hola Kotlin")

}

fun sum(a: Int, b: Int): Int {

    /*var res = a + b

    return res*/

    return a + b

}

fun sub(a: Int, b: Int): Int {

    /*var res = a - b

    return res*/

    return a - b

}

fun sub2(a: Int, b: Int) = a - b

//INFIX

infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

fun showProduct(nombre: String, promo: String = "Sin promocion", validez: String = "Hasta agotar Existencias") {

    println("$nombre => $promo")

}



