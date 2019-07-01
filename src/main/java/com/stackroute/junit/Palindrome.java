package com.stackroute.junit;

public class Palindrome {


    public String palindromenumber (int number)
    {
        int   r, sum = 0, sum1 = 0, temp, temp1, n;
        String result;
        temp1 = number;
        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum) {

                while (temp1 > 0) {
                    n = temp1 % 10;
                    if (n % 2 == 0) {
                        sum1 = sum1 + n;
                    }
                    temp1 = temp1 / 10;
                }
                if (sum1 < 25) {
                    return "sum of the even digits is less than 25";
                } else {
                    return "sum of the even digits is greater than 25";
                }


            }

        else
            {
            return "not palindrome";
        }

    }

}
