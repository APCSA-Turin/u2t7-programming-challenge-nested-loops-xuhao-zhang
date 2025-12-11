package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String toBeReturnedString = "";
    for (int j = 1; j <= height; j++) {
        for (int i = 1; i <= height; i++) {
            if (i <= j) {
               toBeReturnedString += "*";
            }
        }
    if (j != height){
        toBeReturnedString += "\n";
    }
    }
    return toBeReturnedString;
}


public static String starStaircaseReverse(int height){
    String toBeReturnedString = "";
    for (int j = 1; j <= height; j++) {
        for (int i = 1; i <= height; i++) {
            if (i >= j) {
               toBeReturnedString += "*";
            }
        }
    if (j != height) {
    toBeReturnedString += "\n";
    }
    }
    return toBeReturnedString;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
    String toBeReturned = "";
    width--;
    height--;
    if (height + 1 == 1 | width + 1 == 1) {
        return "";
    }
    for (int i = 0; i <= height; i++) //everything repeat as many times as height (5)
    {
        for (int o = 0; o <= width; o++) {
            if ((o == 0 | o == width) && (i != 0 && i != height)) {
                toBeReturned += "*";
            }
            if (i == height | i == 0) {
                toBeReturned += "*";
            } else if (i < height && i > 0 && o > 0 && o < width) {
                toBeReturned += " ";
            }
        }
        if (i != height)
        toBeReturned += "\n";
    }
    return toBeReturned;
}
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String wordChanged = word;
        String returnValue = "";
        for (int i = 1; i <= rows; i++) 
        {
            returnValue += wordChanged;
            if (i != rows) {
                returnValue += "\n";
            }
            wordChanged = wordChanged.substring(1, wordChanged.length()) + wordChanged.substring(0, 1);
        }

        return returnValue;
    }

}