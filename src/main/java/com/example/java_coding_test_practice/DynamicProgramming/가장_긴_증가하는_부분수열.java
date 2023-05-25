package com.example.java_coding_test_practice.DynamicProgramming;

import java.io.*;
import java.util.*;

public class 가장_긴_증가하는_부분수열 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];//숫자 저장
        int dp[] = new int[n];//최댓값 저장

        //st사용해야 하는거 까먹음
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            //j는 i보다 작을 때 까지
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int max=dp[0];
        for(int i=1;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        System.out.println(max);

    }
}
