package com.example.java_coding_test_practice.Backtracking;

import java.util.*;
import java.io.*;

public class N과_M_1{

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb= new StringBuilder();


    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];
        dfs(n,m,0);
        System.out.println(sb);

    }

    public static void dfs(int n,int m,int depth){
        //재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
        if(depth == m){
            for(int val:arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=0;i<n;i++){
            //만약 해당 노드를 방문하지 않았더라면?
            if(!visit[i]){
                visit[i]=true;      //해당 노드를 방문상태로 변경
                arr[depth]=i+1;     //해당 깊이를 index로 하여 i+1 값 저장
                dfs(n,m,depth+1);//다음 자식 노드 방문을 위해 depth 1 증가 시키면서 재귀호출

                //자식 노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
                visit[i]=false;
            }
        }
    }
}
