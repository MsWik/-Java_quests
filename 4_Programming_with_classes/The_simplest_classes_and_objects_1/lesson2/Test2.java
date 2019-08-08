package by.peleng.jav.lesson2;
/*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.*/

public class Test2 {
    private int x;
    private int j;

    Test2() {
        x = 25;
        j = 50;

    }

    Test2(int x, int j) {
        this.x = x;
        this.j = j;

    }

    int getX() {
        return x;
    }

    int getJ() {
        return j;
    }

    void setX(int x) {
        this.x = x;
    }

    void setJ(int j) {
        this.j = j;
    }


}
