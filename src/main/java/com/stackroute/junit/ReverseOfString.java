package com.stackroute.junit;

import java.util.Scanner;
//reverse of a string without using String Buffer

public class ReverseOfString {
    public String reverseOfAString(String str) {
        int i;
        String reverse = "";
        if (str == "") {
            reverse = "empty string is not accepted";
        } else if (str == null) {
            reverse = "null not accepted";
        } else {

            int length = str.length();
            for (i = length - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);


            }

        }
        return reverse;
    }
}
