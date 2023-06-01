package com.example.java_coding_test_practice.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {
    static int[][] map;
    static int N;
    static boolean[][] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    resultList.add(count);
                }
            }
        }

        Collections.sort(resultList);

        System.out.println(resultList.size());
        for (int result : resultList) {
            System.out.println(result);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        if (x - 1 >= 0 && map[x - 1][y] == 1 && !visited[x - 1][y]) {
            dfs(x - 1, y);
        }
        if (x + 1 < N && map[x + 1][y] == 1 && !visited[x + 1][y]) {
            dfs(x + 1, y);
        }
        if (y - 1 >= 0 && map[x][y - 1] == 1 && !visited[x][y - 1]) {
            dfs(x, y - 1);
        }
        if (y + 1 < N && map[x][y + 1] == 1 && !visited[x][y + 1]) {
            dfs(x, y + 1);
        }
    }
}
