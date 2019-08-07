package by.peleng.java.lesson1;

import java.math.BigInteger;
/*4. Составить программу нахождения произведения квадратов первых двухсот чисел.*/
public class Cycles4 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {

            result = result.multiply(BigInteger.valueOf(i*i));

        }

        System.out.print("Произведение квадратов первых 200 чисел равна:  " + result);





    }
}
