package com.haysarodrigues.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generatePrimeFactorsNumbers(int inputNumber) {


        List<Integer> numberList = new ArrayList<>();


        for (int count = 2; count <= inputNumber; count++) {

            boolean isDivisibleByCount = inputNumber % count == 0;

            if (isDivisibleByCount) {

                numberList.add(count);
                inputNumber = inputNumber / count;
                count = 1;

            }

        }

        return numberList;
    }


}
