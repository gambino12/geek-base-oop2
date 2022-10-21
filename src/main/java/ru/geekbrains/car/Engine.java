package ru.geekbrains.car;

import java.util.ArrayList;

public class Engine {

    private boolean state;

    public void start() {
        System.out.println("Start engine");
    }

    public void stop() {
        System.out.println("Stop engine");
    }

    public void throttleUp(int level) {
        System.out.println("ThrottleUp " + level);
    }

    public boolean getWork() {
        return state;
    }
}
