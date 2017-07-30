package com.company;

import java.util.ArrayList;

/**
 * Created by expo on 30.07.17.
 */

public interface ISaveable {
    public ArrayList<Integer> returnValuesToBeSaved();
    public void populateFields(ArrayList<Integer> arrayList);
}
