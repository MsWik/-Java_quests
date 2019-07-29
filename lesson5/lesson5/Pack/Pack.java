package by.peleng.java.lesson5.lesson5.Pack;

import by.peleng.java.lesson5.lesson5.impl.Command;

public class Pack implements Command {
    public final String namePack="УПАКОВКА";
    private int price;
    private String name;
    private String color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pack(int price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "Упакова "+
                "Цена: " + price +
                ", название " + name + '\'' +
                ", цвет " + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pack pack = (Pack) o;

        if (price != pack.price) return false;
        if (!name.equals(pack.name)) return false;
        return color.equals(pack.color);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + name.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String esecute(String[] params) {
        return namePack;
    }
}
