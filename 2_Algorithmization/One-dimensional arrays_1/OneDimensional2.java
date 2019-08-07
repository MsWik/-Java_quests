package by.peleng.java.lesson2;
/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
*/
import java.util.Scanner;

public class OneDimensional2 {

    public static void main(String args[]) {
        float [] array= {2, 5, 7, 8, 3, 5};
        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите  Z:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число Z ");
            in.next();
        }
        int first = in.nextInt();

        int key=0;
        for (int i=0; i<array.length; i++){

            if (array[i]>first){
                array[i]=first;
                key++;
                System.out.println(i +"   " + array[i]);
            }

        }

        System.out.println("Число замен :" + key );
    }
}

