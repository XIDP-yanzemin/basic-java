package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            return getSumOfEvens(rightBorder, leftBorder);
        }
        var sum = 0;
        while (leftBorder <= rightBorder) {
            if (leftBorder % 2 == 0) {
                sum += leftBorder;
            }
            leftBorder += 1;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            return getSumOfOdds(rightBorder, leftBorder);
        }
        int totalSum = (leftBorder + rightBorder) * (rightBorder - leftBorder + 1) / 2;
        return totalSum - getSumOfEvens(leftBorder, rightBorder);
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        var sum = 0;
        for (Integer i : arrayList) {
            sum += i * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int processedNum;
        for (Integer i : arrayList) {
            if (i % 2 != 0) {
                processedNum = i * 3 + 2;
                resultList.add(processedNum);
            } else {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        var sum = 0;
        for (Integer i : arrayList) {
            if (i % 2 != 0) {
                i = i * 3 + 5;
                sum += i;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        int length = evenList.size();
        if (length % 2 != 0) {
            return evenList.get(length >> 1 + 1);
        }
        float medianSum = evenList.get(length >> 1) + evenList.get(length >> 1 + 1);
        return medianSum / 2;

    }

    public double getAverageOfEven(List<Integer> arrayList) {
        float sum = 0;
        var num = 0; // num ??????????????? for ??????++
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
                num += 1;
            }
        }
        return sum / num;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElement) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer i : arrayList) {
            //????????? ????????????????????????????????? specialElement ???????????????
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        return evenList.contains(specialElement);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0 && !evenList.contains(i)) {
                evenList.add(i);
            }
        }
        return evenList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        Collections.sort(evenList);
        //??????
        oddList.sort(Collections.reverseOrder());
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            Integer integer1 = arrayList.get(i) * 3;
            Integer integer2 = arrayList.get(i + 1) * 3;
            resultList.add(integer1 + integer2);
        }
        return resultList;
    }
}
