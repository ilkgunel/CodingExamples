package com.ilkaygunel.coding.test;

import com.ilkaygunel.coding.GettingMaxValueWithPlacing5Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ilkay.gunel
 */
public class GettingMaxValueWithPlacing5SolutionTest {
    private GettingMaxValueWithPlacing5Solution gettingMaxValueWithPlacing5Solution;

    @BeforeEach
    public void setUp() {
        gettingMaxValueWithPlacing5Solution = new GettingMaxValueWithPlacing5Solution();
    }

    @Test
    public void getMaximumValueWithPlacing5Test() {
        int number = 268;
        int maxValueWithPlacing5 = gettingMaxValueWithPlacing5Solution.getMaximumValueWithPlacing5(number);
        assertEquals(5268, maxValueWithPlacing5);

        number = 670;
        maxValueWithPlacing5 = gettingMaxValueWithPlacing5Solution.getMaximumValueWithPlacing5(number);
        assertEquals(6750, maxValueWithPlacing5);

        number = 0;
        maxValueWithPlacing5 = gettingMaxValueWithPlacing5Solution.getMaximumValueWithPlacing5(number);
        assertEquals(50, maxValueWithPlacing5);

        number = -999;
        maxValueWithPlacing5 = gettingMaxValueWithPlacing5Solution.getMaximumValueWithPlacing5(number);
        assertEquals(-5999, maxValueWithPlacing5);
    }
}
