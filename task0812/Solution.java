package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        int replay = 1;
        int maxReplay = 0;
        int num;
        int oldNum = list.get(0);

        for (int i = 1; i < 10; i++){
            num = list.get(i);
            if(num == oldNum){
                replay++;
            }else {

                replay = 1;
            }
            if(replay > maxReplay){
                maxReplay = replay;}
            oldNum = num;
        }

        System.out.println(maxReplay);
    }
}