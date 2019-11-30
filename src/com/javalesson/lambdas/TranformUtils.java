package com.javalesson.lambdas;

public class TranformUtils<T> {
    T transform(T t, Transformable<T> function){
        return function.transform(t);
    }

    static String exclaim(String s){
        return s.toUpperCase()+"!!!!";
    }
}
