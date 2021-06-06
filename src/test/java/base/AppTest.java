/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void tax_rate_calc_output_tax_if_in_wisconsin() {
        App myApp = new App();

        String state = "WI";

        float expectedOutput = 0.055f;
        float actualOutput = myApp.taxRateCalc(state);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void tax_rate_calc_output_if_not_in_wisconsin() {
        App myApp = new App();

        String state = "MN";

        float expectedOutput = 0f;
        float actualOutput = myApp.taxRateCalc(state);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void tax_is_calculated_correctly() {
        App myApp = new App();

        int subtotal = 10;
        float taxRate = 0.055f;

        float expectedOutput = 0.55f;
        float actualOutput = myApp.taxCalc(subtotal, taxRate);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void tax_is_added_correctly() {
        App myApp = new App();

        int subtotal = 10;
        float tax = 0.55f;

        float expectedOutput = 10.55f;
        float actualOutput = myApp.totalCalc(subtotal, tax);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
