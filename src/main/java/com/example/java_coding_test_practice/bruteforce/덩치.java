package com.example.java_coding_test_practice.bruteforce;

import java.io.*;
import java.util.*;

public class 덩치{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        String[] sp;
        for(int i=0;i<n;i++){
            sp=br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(sp[0]);
            arr[i][1] = Integer.parseInt(sp[1]);
        }

        for(int i=0;i<n;i++){
            int rank=1;

            for(int j=0;j<n;j++){
                if(i == j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }

    }
}
