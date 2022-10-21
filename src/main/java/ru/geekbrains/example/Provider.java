package ru.geekbrains.example;

public class Provider {

    public static SomeInterface provide() {
        return new Implementation();
    }
}
