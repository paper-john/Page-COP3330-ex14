package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class TaxCalc
{
    public static void main( String[] args )
    {
        //Define variable
        Scanner input = new Scanner(System.in);

        double orderAmt, total, tax;
        String state;

        //Get input for order amount and State
        System.out.print("What is the order amount? ");
        orderAmt = Double.parseDouble(input.nextLine());

        System.out.print("What is the state? ");
        state = input.nextLine();

        //Round
        orderAmt = Math.round(orderAmt * 100.0) / 100.0;
        total = orderAmt;

        //calculate result
        if (state.toLowerCase().equals("wi"))
        {
            System.out.println("The subtotal is $" +orderAmt+".");

            //Calculate tax
            tax = orderAmt * 0.055;
            total = orderAmt + tax;
            System.out.println("The tax is $" +tax+ ".");
            total = orderAmt + tax;
        }
        System.out.println("The total is $" +total+".");
    }
}
