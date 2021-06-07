/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = currency.nextInt();

        System.out.print("What is the exchange rate? ");
        double exchgRate = currency.nextDouble();

        double conversion = euros * exchgRate;
        double roundUp = Math.round(conversion * 100.0) / 100.0;

        System.out.printf("%.0f euros at an exchange rate of %f is %.2f U.S. dollars.\n", euros, exchgRate, roundUp);

    }
}
