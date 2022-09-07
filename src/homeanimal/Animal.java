package homeanimal;

import java.util.Scanner;

public abstract class Animal {
    protected String  name;
    protected int age;
    protected int weight;
    protected String color;



    // ниже указаны 4 метода и вывод по каждому на консоль
    public void say(){ //методы с маленькой буквы
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Animal(){

    }


    //метод по выводу год года лет
    public String checkAges(){//разобраться с параметром, а лучше спросить совет как правильнее и откуда его передавать в метод
        int ageConsole = age % 10;
        boolean isExclusionAge = (age % 100 >= 11) && (age % 100 <= 14);
        String result = "" ;
        //1 год 2 года 5 лет
        if (ageConsole == 1 & !isExclusionAge){
            result = "год";
            //System.out.println("год");
        }
        else if (ageConsole == 0 || ageConsole >= 5){
            result = "лет";
            //System.out.println("лет");
        }
        else if (ageConsole >= 2){
            result = "года";
            //System.out.println("года");
        }
        if (isExclusionAge) {
            result = "лет";
            //System.out.println("лет");
        }
        return result;
        // надо вернуть что-то, наверное
    }


    // по каждому методу созданы геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // метод на проверку возраста

    @Override
    public String toString() {
        return
                "Привет! меня зовут " + name +
                ", мне " + age + " " + checkAges() +
                ", я вешу " + weight + " кг " +
                ", мой цвет - " + color;
    }





}

