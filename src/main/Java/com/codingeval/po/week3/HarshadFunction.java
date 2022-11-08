package com.codingeval.po.week3;

//A number is said to be Harshad if it is exactly divisible (no remainder) by the sum of its digits
//EX: 171 -> 1 + 7 + 1 = 9 -> 171/9 = 19 -> No remainder, meaning 171 is Harshad
public class HarshadFunction {

    public static boolean isHarshad(int a){
        
        String testA = Integer.toString(a);
        int sumOfA = 0;
        
        for (int i = 0; i < testA.length(); i++) {
            int x = testA.charAt(i);
            int numericX = Character.getNumericValue(x);
            sumOfA += numericX;
        }

        if(a % sumOfA == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int a = 50;

        boolean harshadTest = isHarshad(a);
        System.out.println(harshadTest);

        }
    }

