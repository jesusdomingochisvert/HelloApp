package com.example.practicakotlin_1

//CONSTANTE GLOBAL

const val x = 1

fun main() {

    //BUCLES

    newTopic("BUCLES")

    showPeople("Jesus", "Antonia", "Andrew")

    showPeople2("Jesus", "Antonia", "Andrew")

}

fun showPeople(p1: String, p2: String, p3: String) {

    println(p1)
    println(p2)
    println(p3)

}

fun showPeople2(vararg people: String) {

    var i = 0

    newTopic("MANUAL")

    println(people[0])
    println(people[1])

    newTopic("FOR")

    for (person in people) {

        println(person)

    }

    newTopic("WHILE")

    while (i < people.size) {

        println(people[i])

        i++

    }

    newTopic("SIN WHEN")

    while (i < people.size) {

        if (people[i] == "Jesus") {

            println("Es Jesus!")

        }

        println(people[i])

        i++

    }

    newTopic("CON WHEN")

    i = (0..people.size - 1).random()

    when (people[i]) {

        "Jesus" -> println("Es Jesus!")

        "Antonia" -> {

            println("Es Antonia!")
            println("Ir otra pantalla")

        }

        else -> println(people[i])

    }

}