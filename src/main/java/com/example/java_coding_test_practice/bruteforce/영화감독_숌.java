package com.example.java_coding_test_practice.bruteforce;

import java.io.*;
import java.util.*;

public class 영화감독_숌{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num=666;
        int count = 1;

        while(count != n){ //count와 n이 같아질 때까지 반복
            num++; //아주 무식하게 1씩 더한다.이때는 int형
            if(String.valueOf(num).contains("666")){ //string으로 본다.
                count++;
            }
        }
        System.out.println(num);
    }
}
