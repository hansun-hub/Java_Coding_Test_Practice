package com.example.java_coding_test_practice.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 회의실배정2{
    static int[] schedule;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        schedule = new int[N + 1];
        dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int reward = Integer.parseInt(st.nextToken());
            schedule[i] = reward;
        }

        dp[1] = schedule[1];

        if (N >= 2) {
            dp[2] = Math.max(schedule[1], schedule[2]);
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2] + schedule[i], dp[i - 1]);
        }

        System.out.println(dp[N]);
    }
}
