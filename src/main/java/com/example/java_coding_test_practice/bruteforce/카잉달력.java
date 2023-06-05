package com.example.java_coding_test_practice.bruteforce;

import java.io.*;
import java.util.*;

public class 카잉달력{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            String[] string = br.readLine().split(" ");
            int M = Integer.parseInt(string[0]);
            int N = Integer.parseInt(string[1]);
            int x = Integer.parseInt(string[2]);
            int y = Integer.parseInt(string[3]);
            int MAXxy = M*N;
            if(y==N) y=0;
            int result =-1;
            int index = 0;

            while(true){
                if((M*index+x)%N==y){
                    result = M*index+x;
                    break;
                }
                if((M*index+x)>MAXxy){
                    break;
                }
                index++;
            }
            System.out.println(result);
        }
    }
}
