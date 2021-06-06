/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String orderString = myApp.orderInput();
        String state = myApp.stateInput();

        float subtotal = Float.parseFloat(orderString);

        float taxRate = myApp.taxRateCalc(state);
        float tax = myApp.taxCalc(subtotal, taxRate);
        float total = myApp.totalCalc(subtotal, tax);

        String output = myApp.buildOutput(subtotal, tax, total);
        myApp.printOutput(output);
    }

    public String orderInput() {
        System.out.print("What is the order amount? ");
        return input.nextLine();
    }

    public String stateInput() {
        System.out.print("What is the state? ");
        return input.nextLine();
    }

    public float taxRateCalc(String state) {
        if (state.equals("WI")) {
            return 0.055f;
        }

        return 0f;
    }

    public float taxCalc(float subtotal, float taxRate) {
        return subtotal * taxRate;
    }

    public float totalCalc(float subtotal, float tax) {
        return subtotal + tax;
    }

    public String buildOutput(float subtotal, float tax, float total) {
        String subtotalString = String.format("$%.2f", subtotal);
        String taxString = String.format("$%.2f", tax);
        String totalString = String.format("$%.2f", total);
        return "The subtotal is " + subtotalString + ".\nThe tax is " + taxString + ".\nThe total is " + totalString + ".";
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}