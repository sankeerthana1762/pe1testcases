package com.stackroute.junit;

//guess the number within the limit


public class Guess {
    public  String guessnumber(int n)
    {
        int target=25;
        if(n<target)
        {
            return "Number guessed is less than the original number";
        }
        else if(n>target){
            return "Number guessed is more than the target";
        }
        else{
            return "Number gussed matches the original number";
        }
    }
}
