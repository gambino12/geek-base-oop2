package ru.geekbrains.mvp;

public class SumModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSum() {
        return first + second;
    }

    public static void main(String[] args) {
        SumModel sumModel = new SumModel();

        sumModel.setFirst(1);
        sumModel.setSecond(1);
        if (sumModel.getSum() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(1);
        sumModel.setSecond(2);
        if (sumModel.getSum() != 3) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(2);
        sumModel.setSecond(3);
        if (sumModel.getSum() != 5) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
