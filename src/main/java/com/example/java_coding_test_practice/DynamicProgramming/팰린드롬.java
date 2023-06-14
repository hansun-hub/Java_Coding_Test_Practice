package com.example.java_coding_test_practice.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수열의 크기 입력받기
        //실제 수열 입력받기
        int[] sequence = new int[n + 1]; // 수열을 담을 배열
        String[] input = br.readLine().split(" ");

        for (int i = 1; i <= n; i++) {
            sequence[i] = Integer.parseInt(input[i - 1]);
        }

        //회문여부 확인 위해 DP사용
        //dp 배열을 만들어서 dp[i][j]가 true이면 i부터 j까지의 구간이 회문임을 의미
        boolean[][] dp = new boolean[n + 1][n + 1];

        // 길이가 1인 회문 처리 위해
        for (int i = 1; i <= n; i++) {
            //모든 dp[i][i]를 true로 초기화
            dp[i][i] = true;
        }

        // 길이가 2인 회문 처리 위해
        for (int i = 1; i <= n - 1; i++) {
            //인접한 두 수가 같으면 dp[i][i+1]을 true로 설정
            if (sequence[i] == sequence[i + 1]) {
                dp[i][i + 1] = true;
            }
        }

        // 길이가 3 이상인 회문
        for (int len = 3; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int end = start + len - 1;

                if (sequence[start] == sequence[end] && dp[start + 1][end - 1]) {
                    dp[start][end] = true;
                }
            }
        }

        int m = Integer.parseInt(br.readLine()); // 질문의 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);

            if (dp[start][end]) {
                sb.append(1);
            } else {
                sb.append(0);
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}