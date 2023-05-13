package com.example.java_coding_test_practice.DivideAndConquer;


import java.io.*;

import java.io.*;

//Main따로 있고
public class 칸토어집합_4779{
    //Main에 들어갑니다.
    //char입니다.
    static char c[];
    static int N;

    //main따로 있고
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        //null이 아닌 동안에
        while((str=br.readLine())!=null){
            N=Integer.parseInt(str);
            int cnt = (int)Math.pow(3,N); //27
            //char 크기 지정해줍니다.
            c=new char[cnt];
            for(int i=0;i<cnt;i++) c[i]='-';

            dfs(0,cnt);
            for(int i=0;i<cnt;i++) bw.write(c[i]);
            //" "쓰십시오
            bw.write("\n");
            bw.flush();
        }
    }

    //반환형 적어줘야함, 접근 가능하게 static 붙여줘야함 length임
    static void dfs(int start, int length){
        //재귀 탈출 if문 넣어줘야지
        if(length<3){
            return;
        }

        //가운데에 빈칸 넣어주기
        for(int i=start+length/3;i<start+length/3*2;i++) c[i]=' ';

        //첫번째, 세번째 확인하기
        //전체 길이는 3분의 1이 된다 둘다
        dfs(start, length/3);
        dfs(start+length/3*2, length/3);
    }

}