package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog();//Лабрадор
        lab.setPaws(5);//количество лап
        lab.setTail(2);//количество хвостов
        lab.setName("Charley");//имя
        lab.setBreed("Lab");//порода


        Dog sheppard = new Dog();//Овчарка
        sheppard.setPaws(4);//количество лап
        sheppard.setTail(1);//количество хвостов
        sheppard.setName("Mike");//имя
        sheppard.setBreed("Sheppard");//порода

        System.out.println("Lab's name is "+lab.getName());
        System.out.println("Sheppard's name is "+sheppard.getName());
        System.out.println("Lab has "+lab.getPaws()+" paws");



    }
}
