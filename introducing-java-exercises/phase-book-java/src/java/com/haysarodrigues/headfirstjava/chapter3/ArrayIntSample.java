package com.haysarodrigues.headfirstjava.chapter3;

public class ArrayIntSample {

    public static void main(String [] args){

        int [] numbers;

        numbers = new int[7];

        numbers[0] = 6;
        numbers[1] = 19;
        numbers[2] = 56;
        numbers[3] = 9;
        numbers[4] = 90;
        numbers[5] = 33;
        numbers[6] = 5;

        System.out.println(numbers.length);
        System.out.println(numbers.clone().toString());

    }
}
