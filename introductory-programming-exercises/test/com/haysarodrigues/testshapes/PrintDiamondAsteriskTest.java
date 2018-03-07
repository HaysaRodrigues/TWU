package com.haysarodrigues.testshapes;

import com.haysarodrigues.asterisk.PrintDiamondAsterisk;
import com.haysarodrigues.asterisk.PrintSimpleAsterisk;
import org.junit.Assert;
import org.junit.Test;

public class PrintDiamondAsteriskTest {


    @Test
    public void validateThat_joinTwoPyramidsToFormDiamond_willJoinTheTwoTrianglesToFormDiamond() {

        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();

        String expectedResult = "  *  \n" +
                " *** \n" +
                "*****\n" +
                " *** \n" +
                "  *  ";
        String actualResult;

        actualResult = printDiamondAsterisk.joinTwoPyramidsToFormDiamond(
                printSimpleAsterisk.convertListToString(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3)),
                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3)));

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void validateThat_joinThePyramidToGenerateDiamondWithMiddleName_willJoinTheTwoTrianglesToFormDiamondWithMiddleName() {

        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();
        String theName = "Haysa";

        String expectedResult = "  *  \n" +
                " *** \n" +
                "Haysa\n" +
                " *** \n" +
                "  *  ";
        String actualResult;

        actualResult = printDiamondAsterisk.joinThePyramidToGenerateDiamondWithMiddleName(
                printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3),
                printDiamondAsterisk.generateReversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3)),
                theName);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void validateThat_increaseTwoMoreAsteriskToCreatePyramid_willPrintACenteredPyramid() {

        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();

        String expectedResult = "  *  \n" +
                " *** \n" +
                "*****";

        String actualResult;

        actualResult = printSimpleAsterisk.convertListToString(printDiamondAsterisk.increaseTwoMoreAsteriskToCreatePyramid(3));

        Assert.assertEquals(expectedResult, actualResult);

    }

}
