package com.haysrodrigues.application;

import com.haysarodrigues.asterisk.PrintDiamondAsterisk;
import com.haysarodrigues.asterisk.PrintSimpleAsterisk;
import javafx.application.Application;
import javafx.stage.Stage;

public class RunApplication {

    public static void main(String[] args) {


        PrintSimpleAsterisk printSimpleAsterisk = new PrintSimpleAsterisk();
        PrintDiamondAsterisk printDiamondAsterisk = new PrintDiamondAsterisk();


        System.out.println(printSimpleAsterisk.convertListToString(printDiamondAsterisk.increaseTwoMoreAsteriskToCreateDiamond(10)));


        System.out.println("================================================================================================================================================");


        System.out.println(printSimpleAsterisk.convertListToString(printDiamondAsterisk.reversePyramidList(printDiamondAsterisk.increaseTwoMoreAsteriskToCreateDiamond(10))));



    }


}
