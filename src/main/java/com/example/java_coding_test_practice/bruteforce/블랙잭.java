package com.example.java_coding_test_practice.bruteforce;

import java.util.*;
import java.io.*;

public class 블랙잭{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int result = search(arr, n, m);
        System.out.println(result);

    }

    static int search(int[] arr, int n, int m) {
        int tmp = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];

                    if(sum == m){
                        return sum;
                    }
                    if(sum> tmp && sum<m){
                        tmp=sum;
                    }
                }
            }
        }
        return tmp;
    }
}