package com.example.java_coding_test_practice.DivideAndConquer;

import java.io.*;
import java.util.*;

public class 풀링222{
    //행렬의 값 저장 - 2차원 정수 배열
    static int[][] matrix;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //정수 N -> 정사각형 행렬의 크기
        int N = Integer.parseInt(br.readLine());

        //배열은 NxN으로 초기화
        matrix = new int[N][N];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(recur(0,0,N));
    }
    public static int recur(int i, int j,int size){
        if(size == 2){
            int arr[] = new int[4];
            int idx = 0;
            for(int r=i;r<i+2;r++){
                for(int c=j;c<j+2;c++){
                    arr[idx++] = matrix[r][c];
                }
            }
            Arrays.sort(arr);
            return arr[2];
        }
        else{
            int arr[] = new int[4];
            //매개변수 다시 넣어주려고 -> 쪼개서
            size = size/2;

            arr[0]=recur(i,j,size);
            arr[1]=recur(i,j+size,size);
            arr[2]=recur(i+size,j,size);
            arr[3]=recur(i+size,j+size,size);

            Arrays.sort(arr);
            return arr[2];

        }
    }

}