package com.example.java_coding_test_practice.recursion;

import java.util.*;
import java.io.*;

public class 피보나치수5{
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fib(n));
    }

    public static int fib(int n){

        if(n==0) return 0;
        if(n==1) return 1;

        else{
            int ans =fib(n-1)+fib(n-2);
            return ans;
        }
    }

}
