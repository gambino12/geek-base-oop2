package ru.geekbrains.car;

public class Transmission {
    private int grNumber;

    public void switchGear (int number) {
        this.grNumber = number;
        System.out.printf("Переключение скорости на %d%n", number);
    }

    public int getGrNumber() {
        return grNumber;
    }
}
