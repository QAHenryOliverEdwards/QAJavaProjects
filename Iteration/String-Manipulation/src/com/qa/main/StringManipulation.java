package com.qa.main;

import java.util.ArrayList;

public class StringManipulation {

    String word;

    public StringManipulation (String myWord) {
        this.word = myWord;
    }

    public double wordCounter() {
        double spaceCounter = 1;
        for (int i = 0; i < this.word.length() - 1; i++) {
            if (this.word.charAt(i) == ' ') {
                spaceCounter++;
            }
        }
        if (this.word.length() == 0) {
            spaceCounter = 0;
        }
        return spaceCounter;
    }

    public void wordVertical() {
        String myString = "";
        for (int i = 0; i <= this.word.length(); i++) {

            if (i == this.word.length()) {
                System.out.println(myString);
                break;
            }
            if (this.word.charAt(i) == ' ') {
                System.out.println(myString);
                myString = "";
            }
            else {
                myString += this.word.charAt(i);
            }

        }
    }
    public void reverseWordVertical() {
        ArrayList<String> wordList = new ArrayList<>();
        String word = "";
        for (int i = 0; i <= this.word.length(); i++) {

            if (i == this.word.length()) {
                wordList.add(word);
                break;
            }

            if (this.word.charAt(i) == ' ') {
                wordList.add(word);
                word = "";
            }
            else {
                word += this.word.charAt(i);
            }

        }

        for (int i = wordList.size() - 1; i >= 0; i--) {
            System.out.println(wordList.get(i));
        }
    }

    public boolean searchString(String message, String find) {
        boolean isInString = false;
        for (int i = 0; i < message.length() - find.length() ; i++){
            if (message.substring(i, i+find.length()).equals(find)) {
                isInString = true;
            }
        }
        return isInString;
    }
}
