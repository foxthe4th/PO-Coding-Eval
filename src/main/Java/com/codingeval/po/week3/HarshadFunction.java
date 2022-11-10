package com.codingeval.po.week3;

//A number is said to be Harshad if it is exactly divisible (no remainder) by the sum of its digits
//EX: 171 -> 1 + 7 + 1 = 9 -> 171/9 = 19 -> No remainder, meaning 171 is Harshad
public class HarshadFunction {

    //Without recursion
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

    //With recursion
    public static int sumA(int a){

        if(a/10 > 0){

            return a % 10 + sumA(a / 10);

        } else {
            return a % 10;
        }
    }

    public static boolean isHarshadWithRecursion(int a){
        return a % sumA(a) == 0;
    }

    public static void main(String[] args) {

        System.out.println(isHarshad(171));
        System.out.println(isHarshadWithRecursion(171));

        }
    }

