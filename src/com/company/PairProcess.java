package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PairProcess {


    public static void main(String[] args) {
        double num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        double sum, average, product;
        sum = num1 + num2;
        average = sum / 2;
        product = num1 * num2;

        if (sum > 200) {
            System.out.println("The sum is " + sum + "*");
        } else {
            System.out.println("The sum is " + sum);

            if (product < 1000) {
                System.out.println("The product is ~" + product);
            } else {
                System.out.println("The product is" + product);
            }
            System.out.println("The average is " + average);

        }
    }
}

