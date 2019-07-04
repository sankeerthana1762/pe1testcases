package com.stackroute.junit;

//adding the unspecified number of integer arguments
public class TotalOfInput {



        public int calculateInputSum(int array[]) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }


            return sum;
        }
    }
