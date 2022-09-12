package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        ArrayList<Integer> resultList = new ArrayList<>();
        var maxNum = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if(arrayList.get(i) <= arrayList.get(i + 1)){
                maxNum = arrayList.get(i + 1);
            }
        }
        return maxNum;
    }

    public double getMinimum() {
        ArrayList<Integer> resultList = new ArrayList<>();
        var minNum = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if(arrayList.get(i) >= arrayList.get(i + 1)){
                minNum = arrayList.get(i + 1);
            }
        }
        return minNum ;
    }

    public double getAverage() {
        var sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }
        return sum / (double) arrayList.size();
    }

    public double getMedian() {
        int arraySize = arrayList.size();
        if(arraySize % 2 != 0){
            return arrayList.get((arraySize - 1) / 2);
        } else {
            return(double) (arrayList.get(arraySize /2) + arrayList.get(arraySize /2 - 1 )) / 2;
        }
    }

    public double getOrderedMedian() {
        return getMedian();
    }

    public int getFirstEven() {
        Integer firstEven = 0;
        for (Integer i : arrayList) {
            if(i % 2 == 0){
                firstEven = i;
                break;
            }
        }
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        Integer firstEvenIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0){
                firstEvenIndex = i;
                break;
            }
        }
        return firstEvenIndex;
    }

    public boolean isEqual(List<Integer> arrayList) {
        boolean result = true;
        if(arrayList.size() != this.arrayList.size()){
            result = false;
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if(this.arrayList.get(i) != arrayList.get(i)){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }



    public int getLastOdd() {
        int lastOdd = 0;
        for (Integer i : arrayList) {
            if(i % 2 != 0) {
                lastOdd = i;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        Integer lastOddIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 != 0){
                lastOddIndex = i;
            }
        }
        return lastOddIndex;
    }
}
