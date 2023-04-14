package com.example.java_coding_test_practice.Sort;

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];//commands의 길이만큼 answer생성
        for(int i=0;i<commands.length;i++){
            int[] temp = new int[commands[i][1]-(commands[i][0]-1)];//j-(i-1)
            //전체적으로 필요한 temp, commands가 공통적으로 사용
            //따라서 commands 수 만큼 그 commands가 필요한 개수만큼 자른 배열로 temp[] 선언

            for(int j= 0; j < temp.length; j++){ //temp 배열의 개수만큼 반복
                temp[j] = array[j+(commands[i][0]-1)]; //
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];

        }
        return answer;
    }
}

//list 는 size
//배열은 length