package com.train.ticket.kotlin

class TicketKotlin {
    private var count: Int = 0
    private var round: Int = 0

    constructor(count: Int, round: Int){
        this.count = count
        this.round = round
    }

    fun getPrice(): Int{
        return 1000 * (count - round) + (2000*0.9 * round).toInt()
    }
} 