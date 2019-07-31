package com.javalesson.oop;

public class Dog {

    private static int dogsCount;

    public static final int PAWS = 4;//кол-во лап
    public static final int TAIL = 1;//кол-во хвостов
    private String name;//Имя
    private String breed;//Порода
    private Size size;//Размер собаки

    public Dog() {//конструктор
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);//общее количество собак
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {  //Лает
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof-Wof");//Если большая
                break;
            case AVERAGE:
                System.out.println("Raf-Raf");//Если средняя
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf-tiaf");//Если маленькая
                break;
        }


    }

    public void bite() { //Кусает
        if (dogsCount > 2) {//Если собак больше двух
            System.out.println("Dog's are biting you");// Собаки кусают вас
        } else {
            bark();//в противном случае, лают
        }
    }
}
