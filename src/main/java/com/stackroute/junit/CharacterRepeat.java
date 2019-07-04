package com.stackroute.junit;

import java.util.Scanner;

//repeating the characters from the given position

public class CharacterRepeat {

    public String charrepeat(String inputString, int repeatnumber) {
        if (inputString != null) {
            int i;

            String repeat = inputString.substring(inputString.length() - repeatnumber);

            for (i = 0; i < repeatnumber; i++) {
                inputString += repeat;
            }
            return inputString;

        }
        return null;
    }
}