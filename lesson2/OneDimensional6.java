package by.peleng.java.lesson2;

import java.math.BigInteger;
/*6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
*/
public class OneDimensional6 {
    static boolean pr(float fl) {
        if (Math.abs(fl) < 2) {
            return false;
        }
        if (Math.abs(fl) == 2) {
            return true;
        }

        double runner = fl/2+1;
        for (int i = 2; i <=runner; i++) {
            if (fl % i == 0) {
                return false;
            }

        }
        return true;

    }


    public static void main(String args[]) {
        float[] array = {2, 5, 7, 8, 3, 5, -5, 0};
        /*  Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите  Z:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число Z ");
            in.next();
        }
        int first = in.nextInt();
      	 float Z=2;*/


        float byf = 0;
        for (int i = 0; i < array.length; i++) {

			/*BigInteger bigInteger = BigInteger.valueOf(i);
			boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));*/

            if (pr(array[i])) {
                byf += array[i];

            }


        }
        System.out.println(byf);


    }


}
