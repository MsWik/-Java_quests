package by.peleng.java.lesson2;

public class OneDimensional8 {
/*8. Дана последовательность целых чисел
Образовать новую последовательность, выбросив из
исходной те члены, которые равны
min...
.*/

    public static void main(String args[]) {
        int[] array = {2, 5, 7, 8, 3, 5, -5, 0};
        int[] finalArray = new int[array.length];
        int min = array[0];
        int more = 1;
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }


        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                finalArray[k] = array[i];
                k++;
                System.out.println("Число :" + finalArray[i] + "    " + min + "   " + k);
            }


        }


    }
}
