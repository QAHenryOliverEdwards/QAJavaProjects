package com.qa.main;

import com.qa.main.other.Coins;

public class Runner {

    public static void main(String[] args) {

        StringManipulation str1 = new StringManipulation("Test");
        StringManipulation str2 = new StringManipulation("Two Words");
        StringManipulation str3 = new StringManipulation("This is so many words");
        StringManipulation str4 = new StringManipulation("");

        System.out.println(str1.wordCounter());
        System.out.println(str2.wordCounter());
        System.out.println(str3.wordCounter());
        System.out.println(str4.wordCounter());

        str1.wordVertical();
        str2.wordVertical();
        str3.wordVertical();
        str4.wordVertical();

        str1.reverseWordVertical();
        str2.reverseWordVertical();
        str3.reverseWordVertical();
        str4.reverseWordVertical();

        System.out.println(str1.searchString("Hello World!", "Hello"));
        System.out.println(str1.searchString("Hello World!", "NotIn"));
        System.out.println(str1.searchString("Multiple words in here", "words"));



    }

}
