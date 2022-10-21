package ru.geekbrains.example;

public class SomeClass {

    private static SomeClass instance;

    public static SomeClass getInstance() {
        if (instance == null) {
            instance = new SomeClass();
        }
        return instance;
    }

    private SomeClass() {
    }
}
