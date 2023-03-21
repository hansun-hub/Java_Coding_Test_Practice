package com.example.java_coding_test_practice.AccumulatedSum;

import java.io.*;
import java.util.*;

public class 수열{

    public static int[] arr;
    public static int max;

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //전체 날짜 개수
        int k = Integer.parseInt(st.nextToken()); //연속적인 날짜 개수

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        for(int i=0;i<n-k;i++){ //규칙을 찾아서 for문을 생각해보자
            int sum=0;
            for(int j=i;j < i+k;j++){
                sum+=arr[j];
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

}
