package com.codingeval.po.week1;

import java.util.Vector;

public class Stack<E> extends Vector {

    public Stack() {

    }

    public E push(E item) {
        add(item);
        return item;
    }

    public E pop() {

        if (isEmpty()) {
            throw new Error("com.codingeval.po.week1.Stack does not have any elements");
        } else {
            Object a = get(0);
            remove(0);

            return (E) a;
        }
    }

    public int max() {
        int maxValue;
        if (isEmpty()) {
            throw new Error("com.codingeval.po.week1.Stack does not have any elements");
        } else {
            maxValue = 0;
            for (int i = 0; i < size(); i++) {
                if ((int) get(i) > maxValue) {
                    maxValue = (int) get(i);
                }
            }
        }
        return maxValue;
    }

        public static void main (String[]args){

            Stack stack = new Stack();
            java.util.Stack test = new java.util.Stack<>();
            stack.add(0, 1);
            stack.add(1, 2);
            stack.add(2, 3);
            stack.add(3, 4);
            stack.add(4, 5);

            stack.push(10);
            System.out.println(stack);

            System.out.println("----------------------");

            stack.pop();
            System.out.println(stack);

            System.out.println("----------------------");

            int maxValue = stack.max();
            System.out.println(maxValue);
        }
}
