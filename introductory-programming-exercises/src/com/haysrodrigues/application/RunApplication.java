package com.haysrodrigues.application;


import com.haysarodrigues.asterisk.PrintDiamondAsterisk;
import com.haysarodrigues.asterisk.PrintSimpleAsterisk;


public class RunApplication {

    public static void main(String[] args) {


        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();
        String myName = "Haysa";


        System.out.println(printDiamondAsterisk.joinTwoPyramidsToFormDiamond(printSimpleAsterisk.convertListToString(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(10)),
                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(10))));


        System.out.println(printDiamondAsterisk.joinThePyramidToGenerateDiamondWithMiddleName(
                printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3),
                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3)),
                myName));


//        FizzBuzz fizzBuzz = new FizzBuzz();
//
//        System.out.println(fizzBuzz.generateFizzBuzz(100));
    }


}
