package by.peleng.java.lesson1;
/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
*/
import java.util.Scanner;

public class Branching4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Введите размер отверстия А: ");
        int A = s.nextInt();
        System.out.print("Введите размер отверстия В: ");
        int B = s.nextInt();
        System.out.println("Введите размер кирпича");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        s.close();

        if ((A >= y && B >= x) || (A >= x && B >= y)) {
            System.out.println("Пролезет");
        } else if ((A >= x && B >= z) || (A >= z && B >= x)) {
            System.out.println("Пролезет");
        } else if ((A >= y && B >= z) || (A >= z && B >= y)) {
            System.out.println("Пролезет");
        } else {
            System.out.println("НЕ Пролезет");
        }

    }
}
