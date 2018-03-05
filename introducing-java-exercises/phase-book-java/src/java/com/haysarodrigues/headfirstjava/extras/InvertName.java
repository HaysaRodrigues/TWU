package com.haysarodrigues.headfirstjava.extras;

public class InvertName {

    public static void main(String[] args) {

        String name = "haysa";

        for (int count = name.length() - 1; count >= 0; count--) {

            System.out.print(name.charAt(count));
        }


    }
}
