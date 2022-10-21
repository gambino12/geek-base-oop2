package ru.geekbrains.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        copyAll(integers, numbers);
    }

    public static <T> void copyAll(Collection<? extends T> source, Collection<? super T> dest) {
        dest.addAll(source);
    }
}
