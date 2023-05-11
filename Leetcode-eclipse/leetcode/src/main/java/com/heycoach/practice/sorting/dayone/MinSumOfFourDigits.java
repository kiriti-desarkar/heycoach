package com.heycoach.practice.sorting.dayone;

import java.util.Arrays;

public class MinSumOfFourDigits {

    public static void main(String[] args){        
        System.out.println(minimumSum(2932));
    }

    public static int minimumSum(int num) {
        int[] array = new int[4];
        int i = 1;
        //store each digit in array
        while(num>0){
            int rem = num%10;
            num=num/10;
            array[4-i] = rem;
            i++;
        }
        bubbleSort1(array);
        
        int min1 = (array[0]*10)+array[2];
        int min2 = (array[1]*10)+array[3];
        
        return min1+min2;
        
    }

    public static void bubbleSort1(int[] array) {
        int i,j;
    	for(i=0;i<array.length-1;i++){
            boolean isSwap=false;
            for(j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap) {
                return;
            }
        }
    }

}

