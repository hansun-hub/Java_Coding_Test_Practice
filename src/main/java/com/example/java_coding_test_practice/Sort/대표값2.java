package com.example.java_coding_test_practice.Sort;



import java.util.*;
import java.io.*;


public class 대표값2 {
    public void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        int mid=0;
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        Arrays.sort(arr);
        int avg = sum/5;
        mid=arr[2];

        System.out.println(avg+"\n"+mid);
    }


}
