package com.ilkaygunel.coding;

/**
 * @author ilkay.gunel
 */

import java.util.*;

public class FairIndexSolution {
    public static void main(String[] args) {
        int[] firstArray = {4, -1, 0, 3};
        int[] secondArray = {-2, 6, 0, 4};

        FairIndexSolution fairIndexSolution = new FairIndexSolution();
        int fairIndexCount = fairIndexSolution.getFairIndexCount(firstArray, secondArray);
        System.out.println("Output:" + fairIndexCount);

    }

    public int getFairIndexCount(int[] firstArray, int[] secondArray) {
        Map<Integer, Integer> sumForFairIndexesForFirstArray = new HashMap<>();
        Map<Integer, Integer> sumForFairIndexesForSecondArray = new HashMap<>();

        findFairIndexAndSum(firstArray, sumForFairIndexesForFirstArray);
        findFairIndexAndSum(secondArray, sumForFairIndexesForSecondArray);

        sumForFairIndexesForFirstArray.entrySet().forEach(entry -> {
            sumForFairIndexesForSecondArray.entrySet().removeIf(item ->
                    (entry.getKey() == item.getKey() && entry.getValue() != item.getValue()) ||
                            !sumForFairIndexesForFirstArray.containsKey(item.getKey()) ||
                            !sumForFairIndexesForSecondArray.containsKey(entry.getKey())
            );
        });

        System.out.println("Fair Indexes:");
        sumForFairIndexesForSecondArray.entrySet().forEach(item -> {
            System.out.println((item.getKey() + 1) + ":" + item.getValue());
        });
        return sumForFairIndexesForSecondArray.size();

    }

    private void findFairIndexAndSum(int[] arrayForProcessing, Map<Integer, Integer> mapForResult) {
        for (int i = 0; i < arrayForProcessing.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            int[] subArray1 = Arrays.copyOfRange(arrayForProcessing, 0, i + 1);
            for (int k = 0; k < subArray1.length; k++) {
                sum1 = sum1 + subArray1[k];
            }
            int[] subArray2 = Arrays.copyOfRange(arrayForProcessing, i + 1, arrayForProcessing.length);
            for (int j = 0; j < subArray2.length; j++) {
                sum2 = sum2 + subArray2[j];
            }
            if ((sum1 == sum2) && subArray1.length > 0 && subArray2.length > 0) {
                mapForResult.put(i, sum1);
            }
        }
    }
}
