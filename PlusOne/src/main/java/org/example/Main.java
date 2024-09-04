package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] digits = {9,9,9,9};

        int[] ints = plusOne(digits);
        Arrays.stream(ints).forEach(System.out::println);
    }
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){

            if(digits[i]<9){
               digits[i]= digits[i]+1;
                return digits;
            }
            if(digits[i]>=9){
                digits[i]=0;
                if(i==0){
                    int d [] = new int[digits.length+1];
                    d[0] =1;
                    for (int j=0;j<=digits.length-1;j++){
                        d[j+1]= digits[j];
                    }
                    return d;
                }
            }
        }
    return digits;
    }
}