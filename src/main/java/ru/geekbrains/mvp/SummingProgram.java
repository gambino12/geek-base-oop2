package ru.geekbrains.mvp;

import java.util.Scanner;

public class SummingProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SumModel sumModel = new SumModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(sumModel, view);
        presenter.execute();
    }
}
