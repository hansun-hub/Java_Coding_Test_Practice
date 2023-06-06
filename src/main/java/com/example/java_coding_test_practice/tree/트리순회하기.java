package com.example.java_coding_test_practice.tree;

import java.io.*;
import java.util.*;

public class 트리순회하기{
    static int[][] tree;
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //노드의 개수
        int n = Integer.parseInt(br.readLine());
        //알파벳 모든 경우의 수가 26을 넘지 않으므로
        tree = new int[26][2];

        for(int i=0;i<n;i++){
            String[] temp = br.readLine().split(" ");
            //index로 변환하기 위해 A문자 빼기
            int node = temp[0].charAt(0)-'A';
            char left = temp[1].charAt(0);
            char right = temp[2].charAt(0);
            //String을 char로 변환

            //자식 노드가 없을 때 -1을 저장하기
            if(left=='.'){
                tree[node][0] = -1;
            }else{
                tree[node][0] = left-'A';
            }
            if(right == '.'){
                tree[node][1]=-1;
            }else{
                tree[node][1]=right-'A';
            }
        }

        //현재노드부터 시작
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();

    }
    public static void preOrder(int now){
        //현재 왼쪽 오른쪽
        if(now == -1)
            return;
        System.out.print((char)(now + 'A'));
        //문자로 출력하기 위해
        //재귀
        preOrder(tree[now][0]);
        preOrder(tree[now][1]);
    }
    public static void inOrder(int now){
        //중위 순회 : 왼쪽 현재 오른쪽
        if(now == -1)
            return;
        inOrder(tree[now][0]);
        System.out.print((char)(now + 'A'));
        inOrder(tree[now][1]);
    }
    public static void postOrder(int now){
        //후위순회 : 왼쪽 오른쪽 현재
        if(now == -1)
            return;

        postOrder(tree[now][0]);
        postOrder(tree[now][1]);
        System.out.print((char)(now + 'A'));
    }

}