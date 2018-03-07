package com.haysarodrigues.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static ArrayList generateFizzBuzz(int limit) {


        int count;

        List numbersList = new ArrayList();

        for (count = 1; count <= limit; count++) {


            boolean isDivisibleByThree = count % 3 == 0;
            boolean isDivisibleByFive = count % 5 == 0;


            if (isDivisibleByThree && isDivisibleByFive) {
                numbersList.add("FizzBuzz");

            } else if (isDivisibleByFive) {
                numbersList.add("Buzz");

            } else if (isDivisibleByThree) {
                numbersList.add("Fizz");

            } else {

                numbersList.add(Integer.parseInt(String.valueOf(count)));

            }

        }

        return (ArrayList) numbersList;

    }

}
