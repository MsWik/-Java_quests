package by.peleng.jav.Lesson2_02;
/*2 Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/
public class Wheel {



    public void move(int i) {
        int j=i+1;
        System.out.println("Колесо номер " + j + " начинает движение");
    }

    public void stop(int i) {
        int j=i+1;
        System.out.println("Колесо номер " + j + " остановилось");
    }

    public Wheel() {
    }

    public void change(int i) {
        int j=i+1;
        System.out.println("Колесо номер " + j + " успешно сменено");
    }


}
