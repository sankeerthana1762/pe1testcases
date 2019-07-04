package com.stackroute.junit;

//checking each character in the word whether constant or vowel
public class VowelConsonent {


    public String checkVowelorConsonant(String letter) {
        int i;

        String str = "";
        if (letter == null) {
            return null;
        } else {
            for (i = 0; i < letter.length(); i++) {
                char c = letter.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'O' || c == 'U') {
                    str = str + "vowel" + " ";

                } else {
                    str = str + "consonant" + " ";

                }


            }
            return str.trim();
        }


    }
}




