package com.train.order

import java.io.BufferedReader
import java.io.FileReader

class OrderKotlin {

    fun printMenu(map: HashMap<String, ItemKotlin>){
        for (key in map.keys){
            println("id: " + map[key]?.id + ", name: " + map[key]?.name + ", calorie: " + map[key]?.calorie + ", price: " + map[key]?.price)
        }
    }
}

fun main(args: Array<String>){
    var menuItem: HashMap<String, ItemKotlin> = HashMap<String, ItemKotlin>()
    try {
        val bufferedReader = BufferedReader(FileReader("/Users/yayarhisao/Desktop/menu.txt"))
        var menuItemString = bufferedReader.readLine()
        while (menuItemString != null){
            val item = ItemKotlin(menuItemString.split(",")[0],menuItemString.split(",")[1], menuItemString.split(",")[2], menuItemString.split(",")[3])
            menuItem[item.id] = item
            menuItemString = bufferedReader.readLine()
        }
    }catch (e: Exception){
        e.printStackTrace()
    }
    val orderKotlin = OrderKotlin()
    orderKotlin.printMenu(menuItem)
}