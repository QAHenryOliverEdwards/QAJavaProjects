package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        UniqueSum mySum = new UniqueSum();
        UniqueSum mySum2 = new UniqueSum();
        UniqueSum mySum3 = new UniqueSum();
        System.out.println(mySum.evalSum(1, 2, 3));
        System.out.println(mySum2.evalSum(3, 3, 3));
        System.out.println(mySum3.evalSum(1, 1, 2));

    }

}
