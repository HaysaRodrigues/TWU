package com.haysarodrigues.headfirstjava.chapter1;

public class FixCompileIssues {


    public static void main(String[] args) {

        int x = 1;

        while (x < 10) {

            if (x > 3) { // se x for menor que 3, então o compilador vai ficar printando isso "big x" para sempre, até o valor de x mudar

                System.out.println("big x" );

            }

        }

    }

}
