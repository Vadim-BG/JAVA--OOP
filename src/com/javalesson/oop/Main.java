package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count "+Dog.getDogsCount());

        Dog lab = new Dog();//Лабрадор
        lab.setPaws(4);//количество лап
        lab.setTail(1);//количество хвостов
        lab.setName("Charley");//имя
        lab.setBreed("Lab");//порода
        lab.setSize("Average");//размер
        //lab.bark();
        lab.bite();


        Dog sheppard = new Dog();//Овчарка
        sheppard.setPaws(4);//количество лап
        sheppard.setTail(1);//количество хвостов
        sheppard.setName("Mike");//имя
        sheppard.setBreed("Sheppard");//порода
        sheppard.setSize("Big");//размер
        //sheppard.bark();
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setPaws(4);//количество лап
        doberman.setTail(1);//количество хвостов
        doberman.setName("Jack");//имя
        doberman.setBreed("Doberman");//порода
        doberman.setSize("Small");//размер
        //doberman.bark();
        doberman.bite();


        /*System.out.println("Lab's name is "+lab.getName());
        System.out.println("Sheppard's name is "+sheppard.getName());
        System.out.println("Lab has "+lab.getPaws()+" paws");*/



    }
}
