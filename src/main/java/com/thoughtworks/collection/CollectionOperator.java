package com.thoughtworks.collection;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if(left < right) {
            while(left <= right){
                resultList.add(left);
                left += 1;
            }
        } else {
            while(left >= right) {
                resultList.add(left);
                left -= 1;
            }
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if(left < right && left % 2 == 0){
            while(left <= right) {
                resultList.add(left);
                left += 2;
            }
        }
        else if(left < right && left % 2 != 0){
            left += 1;
            while(left <= right) {
                resultList.add(left);
                left += 2;
            }
        }
        else if (left > right && left % 2 == 0){
            while(left >= right) {
                resultList.add(left);
                left -= 2;
            }
        }
        else{
            left -= 1;
            while(left >= right) {
                resultList.add(left);
                left -= 2;
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i : array) {
            if(i % 2 == 0){
                resultList.add(i);
            }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
        var lastIndex = array.length - 1;
        return array[lastIndex];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i : firstArray) {
            if(Arrays.asList(secondArray).contains(i)){
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new UnsupportedOperationException();
    }
}

