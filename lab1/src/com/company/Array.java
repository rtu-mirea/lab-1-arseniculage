package com.company;

import java.util.Scanner;
import java.util.Arrays;


public class Array{

        int [] arr;

        Array(){
        arr = new int [0] ;
        }
        Array(int length){
        arr = new int [length];
        }

        void input(int size, Scanner in)
        {
        arr = new int [size];
        for (int i =0;i< arr.length; i++)
        arr[i]=in.nextInt();




        }
        void append(int input)
        {
        int [] temparr = new int [arr.length];
        for (int i =0;i< arr.length; i++)
        temparr[i]=arr[i];
        arr = new int [arr.length+1];
        for (int i =0;i< arr.length-1; i++)
        arr[i]=temparr[i];
        arr[arr.length-1]=input;

        }
        void pop(int index)
        {
        int [] temparr = new int [arr.length];
        for (int i =0;i< arr.length; i++)
        temparr[i]=arr[i];
        arr = new int [arr.length-1];
        for (int i =0;i< index-1; i++)
        arr[i]=temparr[i];
        for (int i=index-1; i<arr.length; i++)
        arr[i] = temparr[i+1];

        }
        void check_maxBiggerInput(Scanner in)

        {
        int max = arr[0];
        for (int i =0; i<arr.length; i++)
        {
        if (arr[i]> max)
        max = arr[i];
        }
        if (in.nextInt()<max)
        System.out.print("Lesser");
        else System.out.print("Greater");

        }
        void orderByLastDigit() {
            int[] temparr = new int[arr.length];
            for (int i = 0; i < arr.length; i++)
                temparr[i] = arr[i];
            int indx = 0;
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (temparr[i] % 10 == j) {
                        arr[indx] = temparr[i];
                        indx++;
                    }
                }
            }
        }

        void print_string()
        {
            System.out.print(Arrays.toString(arr));
        }

}
