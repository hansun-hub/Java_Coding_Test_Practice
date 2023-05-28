package com.example.java_coding_test_practice.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 바이러스 {
    static int answer = 0;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int M = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];

        // 그래프 정보 입력 받기
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(graph, 1); // 1번 컴퓨터부터 시작하여 바이러스가 퍼지는 컴퓨터 수 계산

        System.out.println(answer);
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int node) {
        visited[node] = true;
        for (int nextNode : graph.get(node)) {
            if (!visited[nextNode]) {
                answer++; // 바이러스가 퍼지는 컴퓨터 수 증가
                dfs(graph, nextNode);
            }
        }
    }
}
