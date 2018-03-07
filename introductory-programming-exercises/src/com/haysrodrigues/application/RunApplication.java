package com.haysrodrigues.application;


import com.haysarodrigues.asterisk.PrintSimpleAsterisk;
import com.haysarodrigues.fizzbuzz.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class RunApplication {

    public static void main(String[] args) {


        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
//        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();
//        String myName = "Haysa";
//
//
//        System.out.println(printDiamondAsterisk.joinTwoPyramidsToFormDiamond(printSimpleAsterisk.convertListToString(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(10)),
//                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(10))));
//
//
//        System.out.println(printDiamondAsterisk.joinThePyramidToGenerateDiamondWithMiddleName(
//                printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3),
//                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3)),
//                myName));


//        int limit = 100;
//        int count;
//        List numbersList = new ArrayList();
//
//        for (count = 1; count <= limit; count++) {
//
//
//            boolean isDivisibleByThree = count % 3 == 0;
//            boolean isDivisibleByFive = count % 5 == 0;
//
//
//            if (isDivisibleByThree && isDivisibleByFive) {
//                numbersList.add("FizzBuzz");
//
//            } else if (isDivisibleByFive) {
//                numbersList.add("Buzz");
//
//            } else if (isDivisibleByThree) {
//                numbersList.add("Fizz");
//
//            } else {
//
//                numbersList.add(Integer.parseInt(String.valueOf(count)));
//
//            }
//
//        }
//
//        System.out.println(numbersList);


        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.generateFizzBuzz(100));
    }


}
