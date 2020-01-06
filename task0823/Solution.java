package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        char [] charArray = string.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            Character ch = charArray[i];
            charArray[0] = Character.toUpperCase(charArray[0]);
            if(ch.equals(' ')){
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        System.out.println(charArray);
    }
}
