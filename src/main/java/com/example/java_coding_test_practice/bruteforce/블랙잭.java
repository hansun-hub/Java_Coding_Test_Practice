package com.example.java_coding_test_practice.bruteforce;

import java.util.*;
import java.io.*;

public class 블랙잭{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); //StringTokenizer은 nextToken사용합나다.
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");//재사용할 때 new하고 다시 재선언합니다.
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int result = search(arr, n, m);  //search라는 함수 생성합니다.
        System.out.println(result);

    }

    static int search(int[] arr, int n, int m) { //search의 반환값은 int입니다.
        int tmp = 0;
        for(int i=0;i<n-2;i++){ //n-2
            for(int j=i+1;j<n-1;j++){ //n-1
                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];

                    if(sum == m){
                        return sum;
                    }
                    if(sum> tmp && sum<m){ //비교합니다.
                        tmp=sum;
                    }
                }
            }
        }
        return tmp;
    }
}