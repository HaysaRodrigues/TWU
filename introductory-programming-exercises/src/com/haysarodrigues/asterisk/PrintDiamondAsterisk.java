package com.haysarodrigues.asterisk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDiamondAsterisk {

    public static List<String> increaseTwoMoreAsteriskToCreateDiamond(int howMuchLineHasThePyramid) {

        String character = "*";
        String asteriskLine;
        String space = " ";
        String nothing = "";
        int increase = 1;
        List<String> asteriskArray = new ArrayList<>();

        int lastLineOfPyramid = howMuchLineHasThePyramid + howMuchLineHasThePyramid - 1;
        int numberOfSpacesFirstLineOfPyramid = 0;

        for (int count = 1; count <= howMuchLineHasThePyramid; count++) {


            if (count == 1) {
                asteriskLine = String.join(nothing, Collections.nCopies(increase, character));
                numberOfSpacesFirstLineOfPyramid = (lastLineOfPyramid - 1) / 2;
                asteriskArray.add(String.join(nothing, Collections.nCopies(numberOfSpacesFirstLineOfPyramid, space)) + asteriskLine + String.join(nothing, Collections.nCopies(numberOfSpacesFirstLineOfPyramid, space)));


            } else {

                numberOfSpacesFirstLineOfPyramid = numberOfSpacesFirstLineOfPyramid - 1;
                asteriskLine = String.join(nothing, Collections.nCopies(increase, character));
                asteriskArray.add(String.join(nothing, Collections.nCopies(numberOfSpacesFirstLineOfPyramid, space)) + asteriskLine + String.join(nothing, Collections.nCopies(numberOfSpacesFirstLineOfPyramid, space)));

            }


            increase = increase + 2;

        }
        return asteriskArray;

    }

    public static List<String> reversePyramidList(List<String> listPyramidToInvert) {

        List<String> pyramidReversed = new ArrayList<>();

        Collections.reverse(listPyramidToInvert);


        for (String pyramidLine : listPyramidToInvert) {

            pyramidReversed.add(pyramidLine);

        }

        return pyramidReversed;

    }
    
}
