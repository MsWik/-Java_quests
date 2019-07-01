package by.peleng.java.lesson1;
/*3. Найти сумму квадратов первых ста чисел.*/
public class Cycles3 {
    public static void main(String[] args) {
        long result = 0;
        for (int i = 0; i <= 100; i++) {
            result+=Math.pow(i,2);

        }

        System.out.print("Сумма квадратов первых 100 чисел равна:  " + result);


    }


}
