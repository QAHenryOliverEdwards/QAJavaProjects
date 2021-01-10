package com.qa.main;

import javax.print.attribute.standard.JobKOctets;
import java.util.List;
import java.util.ArrayList;

public class MyIntArrayList {

    List<Integer> myArrayList;

    public void createNumberList(int length) {
        List<Integer> myNumberList = new ArrayList<>();

        for (int i = 0; i <= length; i++) {
            myNumberList.add(i);
        }

        this.myArrayList = myNumberList;
    }

}
