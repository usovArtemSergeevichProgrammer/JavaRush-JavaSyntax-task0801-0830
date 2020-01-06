package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        String lastName = "Last Name - ";
        //map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        for(int i = 0; i < 10; i++){
            int countMonth = (int)(1 + Math.random() * 11);
            int countDay = (int)(1 + Math.random() * 29);
            map.put(lastName + i,dateFormat.parse(month(countMonth) + " " + countDay + " 2012"));
        }
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);
//        Iterator it = map.entrySet().iterator();
//        SimpleDateFormat format = new SimpleDateFormat("MMMMM",Locale.ENGLISH);
//        while (it.hasNext()){
//            Map.Entry<String, Date> pair = (Map.Entry<String, Date>) it.next();
//            String res = format.format(pair.getValue());
//            if(res == "June" || res == "July" || res == "August"){
//                it.remove();
//            }
//        }

    }

    public static void main(String[] args) throws ParseException{
//        Map<String, Date> map = new HashMap<>();
//        map = createMap();
//        for (Map.Entry<String,Date> pair:map.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
//        removeAllSummerPeople(map);
//        System.out.println(map);
    }

    public static String month(int numMonth){
        switch (numMonth){
            case 1:return "JANUARY";
            case 2:return "FEBRUARY";
            case 3:return "MARCH";
            case 4:return "APRIL";
            case 5:return "MAY";
            case 6:return "JUNE";
            case 7:return "JULY";
            case 8:return "AUGUST";
            case 9:return "SEPTEMBER";
            case 10:return "OCTOBER";
            case 11:return "NOVEMBER";
            case 12:return "DECEMBER";
            default:return "NONE";
        }
    }
}
