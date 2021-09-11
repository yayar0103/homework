package com.train.ticket.kotlin

import java.util.*

class TesterKotlin {

}

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var count: Int = scanner.nextInt()
    print("How many round-trip tickets: ")
    var round: Int = scanner.nextInt()
    val ticket = TicketKotlin(count, round)
    var price = ticket.getPrice()
    print("Total tickets: $count Round-trip: $round Total: $price")
}