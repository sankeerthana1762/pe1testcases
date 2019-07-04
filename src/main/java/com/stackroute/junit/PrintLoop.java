package com.stackroute.junit;

import java.util.Scanner;
//printing the loop based on the condition

public class PrintLoop {
    String series="";

    public String loop(int n)
    {
        for(int i=1;i<n+1;i++)
        {
            for(int r=1;r<i+1;r++)
            {
                series=series+i;
            }


        }
        return series;
    }

}

