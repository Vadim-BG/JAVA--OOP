package com.javalesson.oop;

public class Dog {

    private static int dogsCount;

    private int paws;//кол-во лап
    private int tail;//кол-во хвостов
    private String name;//Имя
    private String breed;//Порода
    private String size;//Размер собаки

    public Dog() {//конструктор
        dogsCount++;
        System.out.println("Dog's count is "+dogsCount);//общее количество собак
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");//Размер должен быть одним из трех
        }
    }

    public String getName() {
        return name;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws for a dog");
            System.out.println("Correct number is 4");
        }
    }

    public int getPaws() {
        return paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign " + tail + " tail for a dog");
            System.out.println("Correct number is 1");
        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {  //Лает
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Wof-Wof");//Если большая
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raf-Raf");//Если средняя
        } else {
            System.out.println("Tiaf-tiaf");//Если маленькая
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
