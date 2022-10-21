package ru.geekbrains;

import ru.geekbrains.example.Provider;
import ru.geekbrains.example.SomeInterface;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<String> arrList = new CopyOnWriteArrayList<>();

        Map<Integer, Map<String, List<String>>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        Map<String, List<String>> map1 = new HashMap<>();
        map1.put("bbb", list);
        map.put(1, map1);

        map.get(1).get("bbb").add("uuu");

        System.out.println(map);

        // ArrayList, LinkedList, CopyOnWriteArrayList

        SomeInterface provide = Provider.provide();
        provide.someMethod();
    }


}
