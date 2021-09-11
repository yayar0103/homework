package com.train.ticket.kotlin

data class TicketKotlin(
    val count: Int,
    val round: Int
) {
    fun getPrice(): Int {
        return 1000 * (count - round) + (2000 * 0.9 * round).toInt()
    }
}