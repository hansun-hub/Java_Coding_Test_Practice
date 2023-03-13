package com.example.java_coding_test_practice.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수업_피보나치수1{
    static int cnt = 0;
    static int dpCnt = 0;
    static int[] memo; //dp에서 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int[n];
        fib(n);
        fibonacci(n);
        System.out.println(cnt);
        System.out.println(dpCnt);
    }

    public static int fib(int n) {

        if(n == 1 || n == 2){
            cnt++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static int fibonacci(int n) { //n을 입력받으면
        memo[0] = 1; //fib(1) ==1
        memo[1] = 1; //fib(2) ==1

        for (int i = 2; i < n; i++) { //동적계획법, 작은 문제들로 큰 문제를 해결 n보다 1 작은 수까지
            //i=2인 이유 i-2를 하기 때문에 // i<n인 이유 memo배열은 0부터 시작하기 때문에 입력받은 n보다 1작은 것을 구함
            dpCnt++;
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n-1]; //원래는 memo[n]하면 좋지만 배열은 0부터 시작하니
    }
}
