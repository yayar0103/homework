package com.train.ticket.java;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int count = scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int round = scanner.nextInt();
        Ticket ticket = new Ticket(count, round);
        int price = ticket.getPrice();
        System.out.printf("Total tickets: %d Round-trip: %d Total: %d", count, round, price);
    }
}
