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

        Size s = Size.SMALL;
        Size s1 = Size.valueOf("BIG");
        //System.out.println(s1);

        Size[] values = Size.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);

        }


    }
}
