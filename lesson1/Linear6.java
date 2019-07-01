package by.peleng.java.lesson1;

import java.util.Scanner;

/*Считаем пренадлежит ли точка графику*/
public class Linear6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число X   ");
        while (!in.hasNextInt()) {
            System.out.print("ВВвеедите число X  ");
            in.next();
        }
        int x = in.nextInt();
        System.out.print("Ввеедите число Y   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите число Y   ");
            in.next();
        }
        int y = in.nextInt();

        boolean top = false;
        boolean bottom = false;
        if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) bottom = true;
        if ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) top = true;


        if (top || bottom) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
