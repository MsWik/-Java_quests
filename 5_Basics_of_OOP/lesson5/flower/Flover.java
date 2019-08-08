package by.peleng.java.lesson5.lesson5.flower;

import by.peleng.java.lesson5.lesson5.impl.Command;

public class Flover implements Command {
    public final static String nameFlow="ЦВЕТОК";
    private int price;
    private String freshness;
   private long lenght;
    private String name;

    public Flover(int price, String freshness, long lenght, String name) {
        this.price = price;
        this.freshness = freshness;
        this.lenght = lenght;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFreshness() {
        return freshness;
    }

    public void setFreshness(String freshness) {
        this.freshness = freshness;
    }

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return
                "Цена " + price +
                ", свежеть " + freshness +
                ", длина " + lenght +
                ", название " + name ;
    }


    @Override
    public String esecute(String[] params) {
        return nameFlow;
    }
}
