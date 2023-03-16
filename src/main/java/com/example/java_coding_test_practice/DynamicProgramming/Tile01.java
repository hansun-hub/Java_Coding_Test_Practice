package com.example.java_coding_test_practice.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tile01{

    public static int[] dp = new int[1000001];//입력값의 범위 참고
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2; //2를 입력했을 때 답은 2개

        // -1 로 초기화
        for(int i = 3; i < dp.length; i++) { //2까지는 했으니까 그 후의 수는 -1로 초기화
            dp[i] = -1;
        }

        System.out.println(Tile(N)); //함수에 값넣은 거 출력

    }

    public static int Tile(int N) {

        if(dp[N] == -1) {//방문하지 않았던 값이라면
            dp[N] = (Tile(N - 1) + Tile((N - 2))) % 15746; //15746으로 나눈 나머지를 dp[N]에
        }
        return dp[N]; //이미 방문한 경험이 있다면 -1이 아니겠죠 그대로 dp[N] 리턴
    }

}
