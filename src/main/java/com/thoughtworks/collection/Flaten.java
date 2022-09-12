package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (Integer[] i : array) {
            Collections.addAll(resultList, i);
        }
        return resultList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> newList = transformToOneDimesional();
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : newList) {
            if (!set.contains(i)) {
                set.add(i);
                res.add(i);
            }
        }
        return res;
    }
}
