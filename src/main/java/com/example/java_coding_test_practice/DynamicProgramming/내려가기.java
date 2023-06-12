package com.example.java_coding_test_practice.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 내려가기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] maxDP = new int[2][3];
        int[][] minDP = new int[2][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            maxDP[1][0] = Math.max(maxDP[0][0], maxDP[0][1]) + arr[0];
            maxDP[1][1] = Math.max(Math.max(maxDP[0][0], maxDP[0][1]), maxDP[0][2]) + arr[1];
            maxDP[1][2] = Math.max(maxDP[0][1], maxDP[0][2]) + arr[2];

            minDP[1][0] = Math.min(minDP[0][0], minDP[0][1]) + arr[0];
            minDP[1][1] = Math.min(Math.min(minDP[0][0], minDP[0][1]), minDP[0][2]) + arr[1];
            minDP[1][2] = Math.min(minDP[0][1], minDP[0][2]) + arr[2];

            System.arraycopy(maxDP[1], 0, maxDP[0], 0, 3);
            System.arraycopy(minDP[1], 0, minDP[0], 0, 3);
        }

        int maxResult = Math.max(Math.max(maxDP[0][0], maxDP[0][1]), maxDP[0][2]);
        int minResult = Math.min(Math.min(minDP[0][0], minDP[0][1]), minDP[0][2]);

        System.out.println(maxResult + " " + minResult);

        br.close();
    }
}
