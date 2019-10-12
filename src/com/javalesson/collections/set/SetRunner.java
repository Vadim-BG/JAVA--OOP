package com.javalesson.collections.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {

        String[] cars = {"Mini", "Mercedes-Benz","Audi", "VW", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};

        Set<String> carSet = new TreeSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new TreeSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCars = new TreeSet<>(carSet);
        uniqueCars.addAll(otherCarSet);

        print(uniqueCars);

    }

    private static void print(Set<String> cars){
        System.out.println(cars);
    }
}
