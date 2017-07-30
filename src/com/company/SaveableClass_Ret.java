package com.company;

import java.util.ArrayList;

/**
 * Created by expo on 30.07.17.
 */
public class SaveableClass_Ret implements ISaveable {

    private ArrayList<Integer> IntArrayList;

    public SaveableClass_Ret(ArrayList<Integer> intArrayList) {
        IntArrayList = intArrayList;
    }

    @Override
    public ArrayList<Integer> returnValuesToBeSaved() {
        return IntArrayList;
    }

    @Override
    public void populateFields(ArrayList<Integer> arrayList) {
        System.out.println("Values in data structure: "+IntArrayList.toString());

    }

    @Override
    public String toString() {
        return "SaveableClass_Ret{" +
                "IntArrayList=" + IntArrayList +
                '}';
    }
}
