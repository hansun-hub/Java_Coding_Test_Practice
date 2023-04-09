package com.example.java_coding_test_practice.bruteforce;

import java.io.*;
import java.util.*;


public class 수학은비대면강의입니다{
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for(int i=-999;i<1000;i++){ //-999부터 999까지
            for(int j=-999;j<1000;j++){
                if(a*i+b*j==c && d*i+e*j==f){
                    System.out.println(i+" "+j); //사이에 있는 공백은 " " 로 표현
                    System.exit(0); //중간에 끝낼 때는 다음과 같은 문장
                }
            }
        }
    }
}
