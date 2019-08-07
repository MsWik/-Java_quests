package by.peleng.java.lesson2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  /*   6 1 8
       7 5 3
       2 9 4
   */

public class ArrayTwo16_1 {

    public static int[] copy;
    public static int[] master;

    public static int sum;

    public static int value;
    public static int itr;

    public static int n;

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.print("Введите n: ");
        n = Integer.parseInt(reader.readLine());
        master = new int[n * n];
        copy = new int[n * n];

        sum = n * (n * n + 1) / 2;

        createArray(copy);
        createMagic();
    }

    public static void createMagic() {

        itr = 0;

        for (int i = 0; i < copy.length; i++) {
            master[itr] = copy[i];
            copy[i] = 0;
            value = master[itr];
            recursion();
        }
    }

    public static void recursion() {

        int saveValue = value;
        int saveItr = itr;

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != 0) {

                if (itr == master.length - n - 1) {
                    int sumOfD1 = copy[i];
                    for (int j = itr - n + 2; j >= n - 1; j -= (n - 1)) {
                        sumOfD1 += master[j];
                    }
                    if (sumOfD1 != sum) {
                        continue;
                    }
                }

                if (itr >= (master.length - n - 1) && itr < master.length) {

                    int sumOfCol = copy[i];
                    for (int j = itr - n + 1; j >= 0; j -= n) {
                        sumOfCol += master[j];
                    }

                    if (sumOfCol != sum) {
                        continue;
                    }
                }

                if ((itr + 2) % n == 0) {
                    int sumOfRow = copy[i];
                    for (int j = itr; j >= itr + 2 - n; j--) {
                        sumOfRow += master[j];
                    }
                    if (sumOfRow != sum) {
                        continue;
                    }
                }

                itr++;
                master[itr] = copy[i];
                copy[i] = 0;
                value = master[itr];

                recursion();

                itr = saveItr;
                value = saveValue;
            }
        }
        if (saveItr == master.length - 1) {
            int sumOfD2 = 0;
            for (int j = 0; j < master.length; j += n + 1) {
                sumOfD2 += master[j];
            }
            if (sumOfD2 == sum) {
                printArray(master);
            }
        }
        master[saveItr] = 0;
        copy[saveValue - 1] = saveValue;
    }

    public static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%4d", array[i]));
            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }
    }

}