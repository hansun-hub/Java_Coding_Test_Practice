package com.example.java_coding_test_practice.recursion;

import java.util.*;
import java.io.*;

public class 재귀의_귀재{

    static int result;
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static int recursion(String s, int l, int r){
        result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s,l+1,r-1);
    }

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            result=0;
            System.out.println(isPalindrome(br.readLine()) + " "+ result);
        }
    }

}