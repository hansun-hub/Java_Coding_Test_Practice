package com.example.java_coding_test_practice.Greedy;

import java.io.*;
import java.util.*;

public class ATM{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());



        int[] arr = new int[1001];


        while (n-- > 0) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0;
        int sum=0;

        for(int i=0;i<1001;i++){
            while(arr[i]-->0){
                sum+=(i+prev);
                prev+=i;
            }
        }
        System.out.println(sum);

    }
}
