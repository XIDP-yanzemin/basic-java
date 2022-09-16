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
        //正常的逻辑是不是应该这样？
        //1 遍历这个范围 min - max
        //2 判断每个元素是不是偶数
        //3 添加偶数集合
        LinkedList<Integer> resultList = new LinkedList<>();

        if (left < right) {
            left = left % 2 == 0 ? left : left + 1;
            right = right % 2 == 0 ? right : right - 1;
            for (int i = left; i <= right; i += 2) {
                resultList.add(i);
            }
        } else {
            left = left % 2 == 0 ? left : left - 1;
            right = right % 2 == 0 ? right : right + 1;
            for (int i = right; i <= left; i += 2) {
                resultList.addFirst(i);
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElements(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i : array) {
            if(i % 2 == 0){
                resultList.add(i);
            }
        }
        return resultList;
    }

    public int popLastElement(int[] array) {
        var lastIndex = array.length - 1;
        return array[lastIndex];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<>();
        HashSet<Integer> integers = new HashSet<>();
        for(int i : firstArray){
            integers.add(i);
        }
        for(int i : secondArray){
            if(integers.contains(i)){
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        HashSet<Integer> integers = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        constructSetAndEditResultList(firstArray, integers, resultList);
        constructSetAndEditResultList(secondArray, integers, resultList);
        return resultList;

    }

//    List<Integer> initialList = new ArrayList<>(firstArray.length + secondArray.length);
//    List<Integer> resultList = new ArrayList<>();
//        Collections.addAll(initialList, firstArray);
//        Collections.addAll(initialList, secondArray);
//        for (int i : initialList) {
//        if (!resultList.contains(i)) {
//            resultList.add(i);
//        }
//    }
//        return resultList;
    private static void constructSetAndEditResultList(Integer[] firstArray, HashSet<Integer> integers, List<Integer> resultList) {
        for (Integer integer : firstArray) {
            if (!integers.contains(integer)) {
                integers.add(integer);
                resultList.add(integer);
            }
        }
    }

}


