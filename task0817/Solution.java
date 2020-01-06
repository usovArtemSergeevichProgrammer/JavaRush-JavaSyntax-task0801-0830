package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        String name[] = {"Artem", "Tatiana", "Alex", "Dimon"};
        String lastName = "Last Name";
        for (int i = 0; i < 10; i++){
            map.put(lastName + i,name[(int)(Math.random() * 4)]);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String,String> pair:copy.entrySet()) {
            String value = pair.getValue();  //Переменная, которая приобретает каждое значение из HashMap.
            int k = 0;
            for (Map.Entry<String, String> tPair : copy.entrySet()) {
                if (value == tPair.getValue()) k++; //Сравниваем ее с другими значениями, и если эквивалентны -- прибавляем счетчик.
            }
            if (k>1) removeItemFromMapByValue(map, value); // >1, потому что 1 точно будет -- сравнение с самим собой.

        }
        /* Кому интересно, что на выходе -- разкомментируйте этот цикл
        for (Map.Entry<String,String> pair:map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }*/

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map = createMap();
//        System.out.println(map);
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
