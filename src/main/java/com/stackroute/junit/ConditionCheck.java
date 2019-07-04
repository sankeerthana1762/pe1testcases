package com.stackroute.junit;
//checking the condition for an integer number

public class ConditionCheck{

   public String even(int n){

       String result;
        if(n%2==0){
            if(n>20&&n<30)
            {
                return "jerry";
            }
            else {
                  return "error";
            }
        }
        else
        {
            if(n>20&&n<30)
            {
                return "Tom";
            }
            else{
               return "error";

            }
        }
    }
}
