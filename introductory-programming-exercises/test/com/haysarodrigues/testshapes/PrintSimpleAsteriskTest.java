package com.haysarodrigues.testshapes;

import com.haysarodrigues.asterisk.PrintSimpleAsterisk;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class PrintSimpleAsteriskTest {

    @Test
    public void validateThat_getAsteriskLine_willReturnOneAsterisk() {

        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        String expectedResult = "*";
        String actualResult = printSimpleAsterisk.getAsteriskLine(1);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void validateThat_getAsteriskLine_willReturnEightAsterisk() {

        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        String expectedResult = "********";
        String actualResult = printSimpleAsterisk.getAsteriskLine(8);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void validateThat_printVerticalAsteriskLine_willPrintVerticalLine() {

    }

    @Test
    public void validateThat_increaseAsterisk_willIncrementOneMoreAsteriskInNextLine() {

        String expectedResult = "*\n" + "**" + "\n***";
        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();

        List<String> asteriskArray = new ArrayList<>();
        asteriskArray = printSimpleAsterisk.increaseAsterisk(3);

        String actualResult = printSimpleAsterisk.convertListToString(asteriskArray);

        Assert.assertEquals(expectedResult, actualResult);

    }


}
