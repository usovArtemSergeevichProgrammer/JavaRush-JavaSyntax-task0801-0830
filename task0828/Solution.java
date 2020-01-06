package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        System.out.println(month + " is the " + numMonth(month) + " month");

    }

    public static int numMonth(String month){
        List<String> listMonth = new ArrayList<>();
        listMonth.add(0,"JANUARY");
        listMonth.add(1,"FEBRUARY");
        listMonth.add(2,"MARCH");
        listMonth.add(3,"APRIL");
        listMonth.add(4,"MAY");
        listMonth.add(5,"JUNE");
        listMonth.add(6,"JULY");
        listMonth.add(7,"AUGUST");
        listMonth.add(8,"SEPTEMBER");
        listMonth.add(9,"OCTOBER");
        listMonth.add(10,"NOVEMBER");
        listMonth.add(11,"DECEMBER");

        int num = 0;
        for(int i = 0; i < listMonth.size(); i++){
            if(month.toUpperCase().equals(listMonth.get(i))){
                num = i + 1;
            }
        }
        return num;
    }
}
