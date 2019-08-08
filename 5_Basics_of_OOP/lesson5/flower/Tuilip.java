package by.peleng.java.lesson5.lesson5.flower;

import by.peleng.java.lesson5.lesson5.impl.Command;

public class Tuilip extends Flover implements Command {
    public final static String nameFlow="ТЮЛЬПАН";
    private String color;

    @Override
    public String toString() {
        return super.toString()+"   " + "Тюльпан " +
                 color;
    }

    @Override
    public String esecute(String[] params) {
        return nameFlow;
    }

    public Tuilip(int price, String freshness, long lenght, String name) {
        super(price, freshness, lenght, name);
    }
}
