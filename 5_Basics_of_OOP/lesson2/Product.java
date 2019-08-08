package by.peleng.java.lesson5.lesson2;

/*Задача 2
Создать класс Payment , с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/

public class Product {
    private String name;
    private String description;
    private long price;

    @Override
    public String toString() {
        return    "Название='" + name + '\'' +
                ", Описание='" + description + '\'' +
                ", Цена=" + price + "р" + "\n";
    }

    public Product(String name, String description, long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
