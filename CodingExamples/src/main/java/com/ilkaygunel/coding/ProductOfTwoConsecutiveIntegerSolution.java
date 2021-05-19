package com.ilkaygunel.coding;

import java.util.Scanner;

/**
 * @author ilkay.gunel
 */
public class ProductOfTwoConsecutiveIntegerSolution {
    public static void main(String args[]) {
        ProductOfTwoConsecutiveIntegerSolution productOfTwoConsecutiveIntegerSolution = new ProductOfTwoConsecutiveIntegerSolution();
        int counter = productOfTwoConsecutiveIntegerSolution.findProductOfConsecutiveIntegers(6, 20);
        System.out.println(counter);
    }

    public int findProductOfConsecutiveIntegers(int startNumber, int endNumber) {
        int counterOfProductOfConsecutiveIntegers = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            int primeFactor = i;
            while (primeFactor % 2 == 0) {
                primeFactor = primeFactor / 2;
            }
            int primeTimesPrimePlusOne = primeFactor * (primeFactor + 1);
            int primeTimesPrimeMinusOne = (primeFactor - 1) * primeFactor;
            if (primeTimesPrimeMinusOne == i || primeTimesPrimePlusOne == i) {
                counterOfProductOfConsecutiveIntegers = counterOfProductOfConsecutiveIntegers + 1;
            }
        }
        return counterOfProductOfConsecutiveIntegers;
    }
}
