package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> map = new HashMap<>();
        String key = "Family";

        for(int i = 0; i < 10; i++){
            Integer salary = (int)(400 + Math.random() * 300);
            map.put(key + i,salary);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> pair =(Map.Entry<String, Integer>) it.next();
            if(pair.getValue() < 500){
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map = createMap();
//        System.out.println(map);
//        removeItemFromMap(map);
//        System.out.println(map);
    }
}