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
        //对于变量的声明，一般会选用更加抽象的类型，初始化的时候会初始化成具体了的类型； List<Integer> result = new ArrayList();
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
            //Arrays.asList(secondArray) 用法有问题；这个没办法直接将 array 转换成 list
            if(Arrays.asList(secondArray).contains(i)){
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        //没有实现
        throw new UnsupportedOperationException();
    }
}

