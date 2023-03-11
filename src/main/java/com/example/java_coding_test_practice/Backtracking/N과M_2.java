package com.example.java_coding_test_practice.Backtracking;

import java.util.*;
import java.io.*;

public class N과M_2{

    public static int[] arr;
    public static int n,m; //n과 m을 전역변수로 선언
    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1,0);//at=1
        System.out.println(sb);
    }

    public static void dfs(int at, int depth){
        if(depth==m){
            for(int val:arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i= at; i<=n;i++){//n과 같을 때까지
            arr[depth]=i;
            dfs(i+1,depth+1);

        }
    }
}