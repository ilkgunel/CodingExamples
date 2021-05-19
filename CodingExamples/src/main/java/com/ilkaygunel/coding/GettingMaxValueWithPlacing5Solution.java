package com.ilkaygunel.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ilkay.gunel
 */
public class GettingMaxValueWithPlacing5Solution {
    public static void main(String[] args) {
        int number = 268;
        GettingMaxValueWithPlacing5Solution gettingMaxValueWithPlacing5Solution = new GettingMaxValueWithPlacing5Solution();
        int newNumber = gettingMaxValueWithPlacing5Solution.getMaximumValueWithPlacing5(number);
        System.out.println(newNumber);
    }

    public int getMaximumValueWithPlacing5(int number) {
        String numberAsString = String.valueOf(number);
        char prefix = ' ';
        if (numberAsString.startsWith("-")) {
            prefix = '-';
            numberAsString = numberAsString.substring(1);
        }
        List<Character> chars = new ArrayList<>();
        for (char ch : numberAsString.toCharArray()) {
            chars.add(ch);
        }

        for (int i = 0; i < chars.size(); i++) {
            if ((prefix == ' ' && 5 > Character.getNumericValue(chars.get(i))) || (prefix == '-' && 5 < Character.getNumericValue(chars.get(i)))) {
                chars.add(i, '5');
                break;
            }
        }

        String newNumberAsString = chars.stream().map(String::valueOf).collect(Collectors.joining());
        if (prefix != ' ') {
            newNumberAsString = prefix + newNumberAsString;
        }
        return Integer.parseInt(newNumberAsString);
    }
}
