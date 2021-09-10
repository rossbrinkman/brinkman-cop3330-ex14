package org.example;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat f = new DecimalFormat("#0.00");
        Scanner scanner = new Scanner(System.in);
        float orderAmount, tax, total;
        final float taxRate = .055f;

        System.out.println( "What is the order amount? " );
        orderAmount = scanner.nextFloat();
        total = orderAmount;

        System.out.println( "What is the state? " );
        String state = scanner.next();

        if(Objects.equals(state, "WI"))
        {
            tax = orderAmount * taxRate;
            total = orderAmount + tax;

            System.out.println( "The subtotal is $" + f.format(orderAmount) + "\n" +
                    "The tax is $" + f.format(tax));
        }

        System.out.println("The total is $" + f.format(total));

        scanner.close();
    }
}
