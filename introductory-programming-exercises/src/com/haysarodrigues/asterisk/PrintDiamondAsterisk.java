package com.haysarodrigues.asterisk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDiamondAsterisk {


    public static List<String> increaseTwoMoreAsteriskToCreatePyramid(int howMuchLineHasThePyramid) {

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

    public static List<String> generateReversePyramidList(List<String> listPyramidToInvert) {

        List<String> pyramidReversed = new ArrayList<>();

        Collections.reverse(listPyramidToInvert);


        for (String pyramidLine : listPyramidToInvert) {

            pyramidReversed.add(pyramidLine);

        }

        return pyramidReversed;

    }

    public static String joinTwoPyramidsToFormDiamond(String firstPart, List<String> listPyramidToInvert) {


        String diamond;
        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        listPyramidToInvert.remove(0);

        List<String> finalList = listPyramidToInvert;

        String secondPart = printSimpleAsterisk.convertListToString(finalList);

        diamond = new StringBuilder().append(firstPart).append("\n").append(secondPart).toString();

        return diamond;

    }


    public String joinThePyramidToGenerateDiamondWithMiddleName(List<String> normalPyramid, List<String> listPyramidToInvert, String nameInTheMiddle) {

        String diamondWithName;
        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();

        normalPyramid.remove(normalPyramid.remove(normalPyramid.size() - 1));
        listPyramidToInvert.remove(0);

        List<String> finalList = listPyramidToInvert;

        String firstPart = printSimpleAsterisk.convertListToString(normalPyramid);
        String secondPart = printSimpleAsterisk.convertListToString(finalList);

        diamondWithName = new StringBuilder().append(firstPart).append("\n" + nameInTheMiddle + "\n").append(secondPart).toString();

        return diamondWithName;
    }

}
