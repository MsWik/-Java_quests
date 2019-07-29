package by.peleng.java.lesson5.lesson4;
/*Задача 4
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.*/

public class Treasure {
    private String nameTreasure;
    private long costTreasure;

    public String getNameTreasure() {
        return nameTreasure;
    }

    public void setNameTreasure(String nameTreasure) {
        this.nameTreasure = nameTreasure;
    }

    public long getCostTreasure() {
        return costTreasure;
    }

    public void setCostTreasure(long costTreasure) {
        this.costTreasure = costTreasure;
    }

    public Treasure(String nameTreasure, long costTreasure) {
        this.nameTreasure = nameTreasure;
        this.costTreasure = costTreasure;
    }

    @Override
    public String toString() {
        return "  Название сокровища:  " + nameTreasure + "   Цена сокровища:  " + costTreasure +"  ";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Treasure treasure = (Treasure) o;

        if (costTreasure != treasure.costTreasure) return false;
        return nameTreasure != null ? nameTreasure.equals(treasure.nameTreasure) : treasure.nameTreasure == null;
    }

    @Override
    public int hashCode() {
        int result = nameTreasure != null ? nameTreasure.hashCode() : 0;
        result = 31 * result + (int) (costTreasure ^ (costTreasure >>> 32));
        return result;
    }
}
