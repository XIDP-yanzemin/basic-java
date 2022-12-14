package com.thoughtworks.collection;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private final String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (Integer i : array) {
            resultList.add(i * 3);
        }
        return resultList;
    }

    public List<String> mapLetter() {
        ArrayList<String> resultList = new ArrayList<>();
        for (Integer i : array) {
           resultList.add(letterList.get(i-1));
        }
        return resultList;
    }

    public List<String> mapLetters() {
        ArrayList<String> resultList = new ArrayList<>();
        for (Integer i : array) {
            if(i <= 26){
                resultList.add(letterList.get(i-1));
            }
            else {
                if (i % 26 == 0) {
                    resultList.add(letterList.get(i / 26 - 2) + "z");
                } else {
                    resultList.add(letterList.get(i / 26 - 1) + letterList.get(i % 26 - 1));
                }
            }
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        array.sort(Collections.reverseOrder());
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
