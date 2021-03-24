package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer integerToReturn = 0;
        for (Integer actualNumber : numbers) {
            if (actualNumber % 2 == 1 || actualNumber % 2 == -1) {
                integerToReturn += actualNumber;
            }
        }
        return integerToReturn;
    }

}