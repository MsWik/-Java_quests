package by.peleng.jav.lesson2_03;
/*3 Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.*/
public class District {
    City[] city;
    long square;

    public City[] getCity() {
        return city;
    }

    public void setCity(City[] city) {
        this.city = city;
    }

    public long getSquare() {
        return square;
    }

    public void setSquare(long square) {
        this.square = square;
    }

    public District(City[] city, long square) {
        this.city = city;
        this.square = square;
    }
    public District() {
        this.city = city;
        this.square = square;
    }
}
