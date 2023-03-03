package com.example.java_coding_test_practice.Sort;
import java.util.*;
import java.io.*;


public class 수정렬하기3 {

        public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int n =Integer.parseInt(br.readLine());
            int[] arr = new int[n];


            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);

            for(int i=0;i<n;i++){
                sb.append(arr[i]).append('\n');
            }
            System.out.println(sb);
        }

}
