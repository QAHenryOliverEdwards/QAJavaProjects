package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        MyIntArrayList myIntArray10 = new MyIntArrayList();
        myIntArray10.createNumberList(10);

        int[] intsToAdd = {15, 33, 25};
        for (int i: intsToAdd) {
            myIntArray10.myArrayList.add(i);
        }

        System.out.println(myIntArray10.myArrayList);

        System.out.println("Regular For Loop");

        for (int i = 0; i < myIntArray10.myArrayList.size() - 1; i++) {
            System.out.println(myIntArray10.myArrayList.get(i));
        }

        System.out.println("Enhanced For Loop");

        for (int i: myIntArray10.myArrayList) {
            System.out.println(i);
        }

        System.out.println("Get Test");
        int getTest = myIntArray10.myArrayList.get(0);
        System.out.println(getTest);

        System.out.println("Setting element 0 to 99");
        myIntArray10.myArrayList.set(0, 99);
        System.out.println(myIntArray10.myArrayList.get(0));

        System.out.println("Removing the last element");
        myIntArray10.myArrayList.remove(myIntArray10.myArrayList.size() - 1);

        System.out.println("Testing the sorting function for integers");
        System.out.println(myIntArray10.myArrayList);
        Collections.sort(myIntArray10.myArrayList);
        System.out.println(myIntArray10.myArrayList);

        MyStrArrayList myStrArray3 = new MyStrArrayList();
        myStrArray3.myArrayList.add("Hello");
        myStrArray3.myArrayList.add("World");
        myStrArray3.myArrayList.add("I");
        myStrArray3.myArrayList.add("Exist");

        System.out.println("Testing the sorting function for Strings");
        System.out.println(myStrArray3.myArrayList);
        Collections.sort(myStrArray3.myArrayList);
        System.out.println(myStrArray3.myArrayList);

        MyBoolArrayList myBoolArray5 = new MyBoolArrayList();
        myBoolArray5.myArrayList.add(true);
        myBoolArray5.myArrayList.add(true);
        myBoolArray5.myArrayList.add(false);
        myBoolArray5.myArrayList.add(true);
        myBoolArray5.myArrayList.add(false);

        System.out.println("Testing the sorting function for bools");
        System.out.println(myBoolArray5.myArrayList);
        Collections.sort(myBoolArray5.myArrayList);
        System.out.println(myBoolArray5.myArrayList);

        System.out.println("Testing the reverse function");
        System.out.println(myIntArray10.myArrayList);
        Collections.reverse(myIntArray10.myArrayList);
        System.out.println(myIntArray10.myArrayList);

        System.out.println("Testing the swap function");
        System.out.println(myIntArray10.myArrayList);
        Collections.swap(myIntArray10.myArrayList, 0, myIntArray10.myArrayList.size() - 1);
        System.out.println(myIntArray10.myArrayList);

        System.out.println("Testing the clone function");
        List<Boolean> myBoolArray5_2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myBoolArray5_2.add(true);
        }
        System.out.println("Original Bool List 1 = " + myBoolArray5_2);
        Collections.copy(myBoolArray5_2, myBoolArray5.myArrayList);
        System.out.println("Bool List 1 = " + myBoolArray5.myArrayList);
        System.out.println("Bool List 2 = " + myBoolArray5_2);

    }

}
