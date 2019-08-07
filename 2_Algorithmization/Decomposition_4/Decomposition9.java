package by.peleng.java.lesson2;

/*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Decomposition9 {
    //Считаем площадь 2х треугольников и гипотенузы.
    static double square (float sideХ, float sideY, float sideZ, float sideT){
        double hypotenuse=Math.sqrt(Math.pow(sideХ,2) + Math.pow(sideY,2));
        double firstSquare = 1/2*sideХ*sideY;
        double perimeter = (hypotenuse+sideZ+sideT)/2;
        double ssecondSquare = Math.sqrt(perimeter*(perimeter-sideZ)*(perimeter-sideT)*(perimeter-hypotenuse));

        double Square = firstSquare+ssecondSquare;



        return Square*2;
    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону  Х:");


        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        float sideХ = in.nextFloat();
        System.out.println("Введите сторону  Y:");


        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        float sideY = in.nextFloat();

        System.out.println("Введите сторону  Z:");


        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        float sideZ = in.nextFloat();
        System.out.println("Введите сторону  T:");


        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        float sideT = in.nextFloat();
        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println("Площадь прямоугольника  " + dec.format(square(sideХ,sideY,sideZ,sideT)));


    }
}
