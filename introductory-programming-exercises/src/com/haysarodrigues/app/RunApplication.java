package com.haysarodrigues.app;

import com.haysarodrigues.asterisk.PrintDiamondAsterisk;
import com.haysarodrigues.asterisk.PrintSimpleAsterisk;
import com.haysarodrigues.fizzbuzz.FizzBuzz;
import com.haysarodrigues.primefactors.PrimeFactors;


public class RunApplication {

    public static void main(String[] args) {


        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();
        PrimeFactors primeFactors = new PrimeFactors();
        FizzBuzz fizzBuzz = new FizzBuzz();

        String myName = "Haysa";


        System.out.println(printDiamondAsterisk.joinTwoPyramidsToFormDiamond(printSimpleAsterisk.convertListToString(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(10)),
                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(10))));


        System.out.println(printDiamondAsterisk.joinThePyramidToGenerateDiamondWithMiddleName(
                printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3),
                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3)),
                myName));


        System.out.println(fizzBuzz.generateFizzBuzz(30));

        System.out.println(primeFactors.generatePrimeFactorsNumbers(30));


    }


}
