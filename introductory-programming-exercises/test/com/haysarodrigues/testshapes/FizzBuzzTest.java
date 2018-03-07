package com.haysarodrigues.testshapes;

import com.haysarodrigues.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    @Test
    public void validateThat_generateFizzBuzz_willReplaceNumberThreeForFizz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        List expectedList = new ArrayList();
        List actualList;

        expectedList.add(1);
        expectedList.add(2);
        expectedList.add("Fizz");
        expectedList.add(4);
        expectedList.add("Buzz");

        actualList = fizzBuzz.generateFizzBuzz(5);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void validateThat_generateFizzBuzz_willReplaceNumberFiveForBuzz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        List expectedList = new ArrayList();
        List actualList;

        expectedList.add(1);
        expectedList.add(2);
        expectedList.add("Fizz");
        expectedList.add(4);
        expectedList.add("Buzz");

        actualList = fizzBuzz.generateFizzBuzz(5);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void validateThat_generateFizzBuzz_willReplaceNumberFiveAndThreeForBuzz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        List expectedList = new ArrayList();
        List actualList;

        expectedList.add(1);
        expectedList.add(2);
        expectedList.add("Fizz");
        expectedList.add(4);
        expectedList.add("Buzz");
        expectedList.add("Fizz");
        expectedList.add(7);
        expectedList.add(8);
        expectedList.add("Fizz");
        expectedList.add("Buzz");
        expectedList.add(11);
        expectedList.add("Fizz");
        expectedList.add(13);
        expectedList.add(14);
        expectedList.add("FizzBuzz");

        actualList = fizzBuzz.generateFizzBuzz(15);

        Assert.assertEquals(expectedList, actualList);
    }
}