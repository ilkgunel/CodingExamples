package com.ilkaygunel.coding.test;

import com.ilkaygunel.coding.ProductOfTwoConsecutiveIntegerSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ilkay.gunel
 */
public class ProductOfTwoConsecutiveIntegerSolutionTest {
    private ProductOfTwoConsecutiveIntegerSolution productOfTwoConsecutiveIntegerSolution;

    @BeforeEach
    public void setUp() {
        productOfTwoConsecutiveIntegerSolution = new ProductOfTwoConsecutiveIntegerSolution();
    }

    @Test
    public void testFindProductOfConsecutiveIntegers() {
        int start = 6;
        int end = 20;
        int counter = productOfTwoConsecutiveIntegerSolution.findProductOfConsecutiveIntegers(start, end);
        assertEquals(3, counter);

        start = 21;
        end = 29;
        counter = productOfTwoConsecutiveIntegerSolution.findProductOfConsecutiveIntegers(start, end);
        assertEquals(0, counter);
    }
}
