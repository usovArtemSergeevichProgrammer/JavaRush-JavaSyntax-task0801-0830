package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<>();
        Human chield1 = new Human("chield1",true,3,family);
        Human chield2 = new Human("chield2",false,6,family);
        Human chield3 = new Human("chield3",true,9,family);
        ArrayList<Human> family1 = new ArrayList<>();
        family1.add(chield1);
        family1.add(chield2);
        family1.add(chield3);
        Human dad = new Human("dad",true,30,family1);
        Human mom = new Human("mom",false,29,family1);
        ArrayList<Human> family2 = new ArrayList();
        family2.add(dad);
        ArrayList<Human> family3 = new ArrayList<>();
        family3.add(mom);
        Human grandFather1 = new Human("grandFather1",true,70,family3);
        Human grandFather2 = new Human("grandFather2",true,80,family2);
        Human grandMother1 = new Human("grandMother1",false,69,family3);
        Human grandMother2 = new Human("grandMother2",false,79,family2);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(chield1);
        System.out.println(chield2);
        System.out.println(chield3);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
