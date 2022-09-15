package com.thoughtworks.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            if(secondList.contains(firstList.get(i))){
                resultList.add(firstList.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> resultSet = new LinkedHashSet<>();
        resultSet.addAll(array);
        return List.copyOf(resultSet);
    }
}
