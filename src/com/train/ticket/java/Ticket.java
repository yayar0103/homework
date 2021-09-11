package com.train.ticket.java;

public class Ticket {
    private int count;
    private int round;

    public Ticket(int count, int round){
        this.count = count;
        this.round = round;
    }

    public int getPrice(){
        double roundPrice = 2000*0.9;
        return 1000*(count-round) + (int) roundPrice*round;
    }
}
