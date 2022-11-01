package com.codingeval.po.week1;

import org.w3c.dom.NodeList;

import java.util.LinkedList;

public class IntersectingPoint {

    public static int findIntersect(LinkedList listA, LinkedList listB){
        int evaluateA;
        int evaluateB;
        int result = 0;
        int shorterList;
        if(listA.size() < listB.size()){
            shorterList = listA.size();
        } else {
            shorterList = listB.size();
        }

        for(int i = 0; i < shorterList; i++){
            evaluateA = (int) listA.get(i);
            evaluateB = (int) listB.get(i);

            if(evaluateA == evaluateB){
                result = listA.indexOf(evaluateA);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();

        listA.add(0, 12);
        listA.add(1, 55);
        listA.add(2, 43);
        listA.add(3, 67);
        listA.add(4, 74);
        listA.add(5, 270);
        listA.add(6, 91);
        listA.add(7, 34);
        listA.add(8, 2);

        listB.add(0, 38);
        listB.add(1, 81);
        listB.add(2, 33);
        listB.add(3, 66);
        listB.add(4, 12);
        listB.add(5, 270);

        int result = findIntersect(listA,listB);
        System.out.println(result);
    }
}
