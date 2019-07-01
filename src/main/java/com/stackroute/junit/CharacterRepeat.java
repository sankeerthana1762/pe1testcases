package com.stackroute.junit;

import java.util.Scanner;

public class CharacterRepeat {
     public String charrepeat(String str,int n)
    {
        int i;

        String str1=str.substring(str.length()-n);

        for(i=0;i<n;i++)
        {
            str += str1;
        }
        return str;

    }
}
