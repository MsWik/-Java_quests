package by.peleng.java.lesson1;

import java.util.Scanner;

public class Branching3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите координаты точки 1 (x y) ");
        int x_1 = s.nextInt();
        int y_1 = s.nextInt();

        System.out.print("Введите координаты точки 2 (x y) ");
        int x_2 = s.nextInt();
        int y_2 = s.nextInt();

        System.out.print("Введите координаты точки 3 (x y) ");
        int x_3 = s.nextInt();
        int y_3 = s.nextInt();
        s.close();

        if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) {//_ для улучшения читабельности
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на 1 прямой");
        }
    }
}
