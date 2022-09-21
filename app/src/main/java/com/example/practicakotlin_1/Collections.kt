package com.example.practicakotlin_1

import com.example.practicakotlin_1.clases.Group
import com.example.practicakotlin_1.clases.User

fun main() {

    newTopic("Collections")
    newTopic("Solo Lectura")

    val fruits = listOf<String>("Manzana", "Banana", "Uva", "Lima")

    val myUser = User(0, "Jesus", "Domingo", Group.FAMILY.ordinal)

    val userList = mutableListOf<User>()
    val userListSelected = mutableListOf<User>()

    println(userListSelected)

    var bro = myUser.copy(1, "Antonia")
    var friend = myUser.copy(2, lastName = "Ñaupari", group = Group.FRIEND.ordinal)

    userList.add(myUser)
    userList.add(friend)
    userList.remove(myUser)

    userListSelected.add(myUser)

    println(userListSelected)

    userListSelected.set(0, bro)

    println(userListSelected)

    println(fruits.get((0..fruits.size - 1).random()))

    println(userList)

    userListSelected.add(myUser)
    userListSelected.add(myUser)

    println(userListSelected)

    newTopic("Map")

    val userMap = mutableMapOf<Int, User>()

    println(userMap)

    userMap.put(myUser.id, myUser)
    userMap.put(myUser.id, myUser)

    println(userMap)

    userMap.put(friend.id, friend)

    println(userMap)

    userMap.remove(2)

    println(userMap)

    println(userMap.isEmpty())

    println(userMap.containsKey(1))
    println(userMap.containsKey(0))

    userMap.put(bro.id, bro)
    userMap.put(friend.id, friend)

    println(userMap.keys)

    println(userMap.values)

}