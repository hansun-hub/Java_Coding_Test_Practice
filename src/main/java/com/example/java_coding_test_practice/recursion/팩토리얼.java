package com.example.java_coding_test_practice.recursion;

import java.io.*;
import java.util.*;

public class 팩토리얼{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fib(n));
    }

    public static int fib(int num){
        if(num<=1){
            return 1;
        }
        else{
            return fib(num-1)*num;
        }
    }
}
