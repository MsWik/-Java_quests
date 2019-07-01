package by.peleng.java.lesson1;
/*. Найти max{min(a, b), min(c, d)}.*/
import java.util.Scanner;

public class Branching2 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double min1;
        double min2;
        double max;
        min1 = (a <= b) ? a : b;
        min2 = (c <= d) ? c : d;
        max = (min1 >= min2) ? min1 : min2;
        System.out.println(max);
    }


}
