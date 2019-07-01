package com.stackroute.junit;



public class CheckingCharacter {


        public String eachDigit(char c){
            String result;
            if(c>=65&&c<=90){
                return "CAPITAL LETTER";
            }
            else if(c>=97&&c<=122){
                return "SMALL LETTER";
            }
            else if(c>=48&&c<=57){
                return "DIGIT";
            }
            else{
                return "SPECIAL CHARACTER";
            }

        }

    }

