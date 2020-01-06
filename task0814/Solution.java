package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for(int i = 0; set.size() < 20; i++){
            set.add((int)(Math.random() * 20));
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            if(iterator.next() > 10 ){
                iterator.remove();
            }
        }
        return set;

    }

    public static void main(String[] args) {

//        Set<Integer> resultSet = new HashSet<>();
//        resultSet = createSet();
//        System.out.println(resultSet);
//        Set<Integer> newResultSet = new HashSet<>();
//        newResultSet = removeAllNumbersGreaterThan10(createSet());
//        System.out.println(newResultSet);
    }
}
