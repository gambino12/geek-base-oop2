package ru.geekbrains.generics;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Main {

    public static abstract class Fruit {

        public abstract int weight();
    }

    public static abstract class CitrusFruit extends Fruit {

    };

    public static class Apple extends Fruit {

        @Override
        public int weight() {
            return 1;
        }
    }

    public static class Orange extends CitrusFruit {
        @Override
        public int weight() {
            return 3;
        }
    }

    public static class Mandarin extends CitrusFruit {
        @Override
        public int weight() {
            return 3;
        }
    }

    public static void main(String[] args) {
        List<CitrusFruit> citrusFruits = new ArrayList<>();
        citrusFruits.add(new Mandarin());
        citrusFruits.add(new Orange());
        overallWeight(citrusFruits);
        List<Fruit> fruits = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();
        moveSomeFruits(oranges, citrusFruits, 20);
    }

    // PECS
    public static int overallWeight(List<? extends Fruit> fruits) {
        int sum = 0;
        for (Fruit fr : fruits) {
            sum += fr.weight();
        }
        return sum;
    }

    public static <T extends Fruit> void moveSomeFruits(List<? extends T> source, List<? super T> dest, int maxWeight) {
        int w = 0;
        for (T fr : source) {
            w += fr.weight();
            if (w <= maxWeight) {
                dest.add(fr);
            }
        }
    }

    public static void putRandomFruits(List<? super Fruit> dest) {
        Random rnd = new Random();
        for (int i=0; i<10; i++) {
            if (rnd.nextBoolean()) {
                dest.add(new Apple());
            } else {
                dest.add(new Orange());
            }
        }
    }
}
