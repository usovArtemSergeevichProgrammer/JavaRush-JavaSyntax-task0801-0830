package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        String firstName = "First Name";
        String lastName = "Last Name";
        for (int i = 0; map.size() < 10; i++){
            int numFN = (int)(1 + Math.random() * 3);
            int numLN = (int)(1 + Math.random() * 10);
            map.put(lastName + numLN, firstName + numFN);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
            if(name == pair.getValue()){
                count++;
            }
        }
        return count;


    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
            if(lastName == pair.getKey()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
