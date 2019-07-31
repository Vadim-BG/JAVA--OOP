package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count "+Dog.getDogsCount());

        Dog lab = new Dog();//Лабрадор
        lab.setName("Charley");//имя
        lab.setBreed("Lab");//порода
        lab.setSize(Size.AVERAGE);//размер
        //lab.bark();
        lab.bite();


        Dog sheppard = new Dog();//Овчарка
        sheppard.setName("Mike");//имя
        sheppard.setBreed("Sheppard");//порода
        sheppard.setSize(Size.BIG);//размер
        //sheppard.bark();
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Jack");//имя
        doberman.setBreed("Doberman");//порода
        doberman.setSize(Size.BIG);//размер
        //doberman.bark();
        doberman.bite();


        /*System.out.println("Lab's name is "+lab.getName());
        System.out.println("Sheppard's name is "+sheppard.getName());
        System.out.println("Lab has "+lab.getPaws()+" paws");*/
    }
}
