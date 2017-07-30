package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> i1 = new ArrayList<Integer>();
        i1.add(5);
        i1.add(7);
        i1.add(9);
        i1.add(11);
        i1.add(13);

        SaveableClass_Ret s1 = new SaveableClass_Ret(i1);

        System.out.println(s1.returnValuesToBeSaved().toString());



    }
}
