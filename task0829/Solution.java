package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        String city = reader.readLine();
        String findCity = null;
        if (!city.isEmpty()) {
            for(int i = 0; i < list.size(); i++){
                String fromList = list.get(i);
                if(fromList.equals(city)){
                    findCity = list.get(i+1);
                }
            }
        }
        System.out.println(findCity);
    }
}
