package com.example.java_coding_test_practice.Greedy;

import java.io.*;
import java.util.*;

public class 동전0{
    public static int[] arr;
    public static int count;

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        count=0;
        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=n-1;i>=0;i--){ //큰 수부터 하기 위해 N-1부터 시작
            if(arr[i] <= k ){
                count+=(k/arr[i]);
                k = k % arr[i];
            }
        }

        System.out.println(count);
    }

}
