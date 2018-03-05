package com.haysarodrigues.asterisk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintSimpleAsterisk {


    public String getAsteriskLine(int charactersNumbers) {

        String character = "*";

        String asteriskLine = String.join("", Collections.nCopies(charactersNumbers, character));

        return asteriskLine;

    }

    public static List<String> printVerticalAsteriskLine(int charactersNumbers) {

        List<String> asteriskList = new ArrayList<>();
        String asterisk = "*";

        for (int count = 0; count < charactersNumbers; count++) {

            asteriskList.add(asterisk);

        }

        return asteriskList;

    }

    public static List<String> increaseAsterisk(int lineNumbers) {

        String character = "*";
        String asteriskLine;
        List<String> asteriskArray = new ArrayList<>();

        for (int count = 1; count <= lineNumbers; count++) {

            asteriskLine = String.join("", Collections.nCopies(count, character));

            asteriskArray.add(asteriskLine);


        }
        return asteriskArray;

    }


    public String convertListToString(List<String> asteriskList) {

        String asterisk;

        asterisk = String.join("\n", asteriskList);

        return asterisk;
    }

    public static void main(String[] args) {



    }

}
