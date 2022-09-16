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
        for (Integer integer : firstList) {
            if (secondList.contains(integer)) {
                resultList.add(integer);
            }
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> resultSet = new LinkedHashSet<>(array);
        return List.copyOf(resultSet);
    }
}
