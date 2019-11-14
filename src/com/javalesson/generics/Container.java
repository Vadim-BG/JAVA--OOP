package com.javalesson.generics;

public class Container<T> {

    public Container(T object1) {
        this.object1 = object1;
    }

    private T object1;

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }
}
