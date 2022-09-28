package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[]a = {1,2,3,4};


        int x=0;
        int[] y = {1,2,3};



        reverseArray(a);
        System.out.println(Arrays.toString(a));

    }



    public static void reverseArray(int[]a){
        reverseArray(a,0);
    }

    private static void reverseArray(int[]a,int index){
        if (index==a.length/2){
            return;
        }
        else {
        int temp = a[index];//swap
            a[index]= a[a.length-1-index];
            a[a.length-1-index] = temp;
        }


    }


}
