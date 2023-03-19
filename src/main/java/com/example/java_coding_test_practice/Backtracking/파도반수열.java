package com.example.java_coding_test_practice.Backtracking;

import java.io.*;
import java.util.*;

public class 파도반수열{

    public static Long[] seq = new Long[101];//Long타입 사용

    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        seq[0]=0L;
        seq[1]=1L;//뒤에 L붙여준다
        seq[2]=1L;
        seq[3]=1L;

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');

        }

        System.out.println(sb);
    }

    public static Long padovan(int n){
        if(seq[n] == null){
            seq[n] = padovan(n-2)+padovan(n-3);
        }
        return seq[n];
    }
}