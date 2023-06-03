package com.example.java_coding_test_practice;

import java.io.*;
import java.util.*;


public class 패션왕신해빈 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스
        int t = Integer.parseInt(br.readLine());
        //for 아니라 while문
        while(t--> 0){
            //옷의 수
            int clothesNum = Integer.parseInt(br.readLine());
            //char배열을 만들어야할까?
            //String배열??
            //->정답은 hashMap
            //char[] clothes = new char[clothesNum];
            //String[] clothes = new String[clothes];
            HashMap<String, Integer> hashMap = new HashMap<>();

            //"hat header" 이 줄을 한번에 받아들여서 뒤에있는 단어로 구분해서 배열에 저장
            //옷 종류별로 개수를 세어서 hashMap에 저장
            for(int i=0;i<clothesNum;i++){
                //String input = br.readLine();
                //String words = input.split(" ");
                //String lastwords = words[words.length-1];
                //clothes[j] = lastwords;
                //위의 4줄을 2줄로 줄일 수 있다.
                String[] inputs = br.readLine().split(" ");
                //String[] 배열로 입력받으면 되는군
                String type = inputs[1];

                //HashMap에 이미 해당 종류의 옷이 존재하는 지 확인
                //containKey가 아니라 containsKey
                if(hashMap.containsKey(type)){
                    hashMap.put(type, hashMap.get(type)+1);
                }else{
                    hashMap.put(type,1);
                }
            }

            int result = 1;

            //각 옷 종류별로 입을 지 안입을지 경우의 수를 곱함
            for(int value : hashMap.values()){
                result *= (value+1);
            }

            //아무것도 입지 않는 경우는 제외
            result -=1;

            System.out.println(result);

        }
        br.close();
    }


}
