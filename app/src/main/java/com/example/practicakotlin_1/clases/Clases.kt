package com.example.practicakotlin_1.clases

import androidx.lifecycle.ViewModelProvider
import com.example.practicakotlin_1.newTopic

fun main() {

    var n = 123456789

    newTopic("CLASES")

    val phone: Phone = Phone(n)
    //val phone: Phone?// = Phone() -> Esto es para que sea nula.

    phone.call()

    phone.showNumber()
    println(phone.number)

    newTopic("HERENCIA")

    val smartPhone: SmartPhone = SmartPhone(123456789, false)

    smartPhone.call()

    smartPhone.showNumber()

    //println("Privado? ${smartPhone.isPrivate}") -> El Atributo 'isPrivate' es protected por eso no
                                                    //se puede utilizar fuera de la clase.

    newTopic("DATA CLASSES")

    val myUser = User(0, "Jesus", "Domingo", 0)

    println(myUser)

    val friend = myUser.copy()
    val friend2 = myUser.component1()

    friend.group = 3

    println(friend)
    println(friend2)

    newTopic("ENUM CLASSES")

    val myUser2 = User(1, "Antonia", "David", Group.FAMILY.ordinal)

    println(myUser2)

    val bro = myUser2.copy(2, "Andrew")

    println(bro)

    val friend3 = bro.copy(3, lastName = "Domingo", group = Group.FRIEND.ordinal)

    println(friend3)

    newTopic("FUNCIONES DE ALCANCE")

    with(smartPhone) {

        println("Privado? $isPrivate")

        call()

    }

    newTopic("APPLY")

    friend.group = Group.WORK.ordinal
    friend.name = "Fran"
    friend.lastName = "Alfonso"

    friend.apply {

        group = Group.WORK.ordinal
        name = "Fran"
        lastName = "Alfonso"

    }

    println(friend)

}