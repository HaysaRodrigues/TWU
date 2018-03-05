package com.haysarodrigues.headfirstjava.chapter1;

public class PhraseOMatlc {

    public static void main(String[] args) {

        String[] wordListOne = {"Fido", "Zeus", "Bin"};
        String[] wordListTwo = {"Big", "Bang", "Boung"};
        String[] wordListThree = {"Cool", "Kids", "Nice"};

        // find out how many numbers are in each array
        int listOne = wordListOne.length;
        int listTwo = wordListTwo.length;
        int listThree = wordListThree.length;

        // generate a random words
        int randomOne = (int) (Math.random() * listOne);
        int randomTwo = (int) (Math.random() * listTwo);
        int randomThree = (int) (Math.random() * listThree);

        // build a phrase
        String phrase = wordListOne[randomOne] + " " + wordListTwo[randomTwo] + " " + wordListThree[randomThree];

        System.out.println("I need a " + phrase);

    }


}
