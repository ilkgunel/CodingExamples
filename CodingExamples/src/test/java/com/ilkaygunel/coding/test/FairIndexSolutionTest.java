package com.ilkaygunel.coding.test;

import com.ilkaygunel.coding.FairIndexSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ilkay.gunel
 */
public class FairIndexSolutionTest {
    private FairIndexSolution fairIndexSolution;

    @BeforeEach
    public void setUp() {
        fairIndexSolution = new FairIndexSolution();
    }

    @Test
    public void testGetFairIndexCount() {
        int[] firstArray = {4, -1, 0, 3};
        int[] secondArray = {-2, 6, 0, 4};
        assertEquals(0, fairIndexSolution.getFairIndexCount(firstArray, secondArray));

        firstArray = new int[]{4, -1, 0, 3};
        secondArray = new int[]{-2, 5, 0, 3};
        assertEquals(2, fairIndexSolution.getFairIndexCount(firstArray, secondArray));

        firstArray = new int[]{2, -2, -3, 3};
        secondArray = new int[]{0, 0, 4, -4};
        assertEquals(1, fairIndexSolution.getFairIndexCount(firstArray, secondArray));

        firstArray = new int[]{1, 4, 2, -2, 5};
        secondArray = new int[]{7, -2, -2, 2, 5};
        assertEquals(2, fairIndexSolution.getFairIndexCount(firstArray, secondArray));
    }
}
