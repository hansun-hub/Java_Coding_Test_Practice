package com.example.java_coding_test_practice.DynamicProgramming;


import java.io.*;

public class 칸토어집합_4779 {
    static int N;
    static char c[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while((str = br.readLine()) != null){ //입력이 없을 때 까지 ㄱㄱ
            N = Integer.parseInt(str); //N

            int cnt = (int) Math.pow(3,N); //3의 N 제곱 구하기
            c = new char[cnt]; //char 배열 생성

            for(int i=0;i<cnt;i++) c[i] = '-'; //char배열에 - 로 채워주기

            dfs(0,cnt);

            for(int i=0;i<cnt;i++) bw.write(c[i]);
            bw.write("\n");
            bw.flush();
        }
    }

    static void dfs(int start,int length){
        if(length < 3) {
            return;
        }

        //중간꺼 공백으로 바꾸고
        for(int i=start+length/3;i<start+length/3*2;i++) c[i] = ' ';


        //첫번째거 세번째꺼 확인
        dfs(start,length/3);

        dfs(start+length/3*2,length/3);
    }
}
