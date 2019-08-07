package by.peleng.java.lesson2;
/*Даны действительные числа

. Найти последовательность ....*/
public class OneDimensional7 {

    public static void main(String args[]) {
        int[] array = {2, 5, 7, 8, 3, 5, -5, 0};
        int length = (array.length / 2);
        int min = 0;


        for (int i = 0; i < length; i++) {
            if (Math.max(array[i], array[array.length - i-1]) > min) {
                min = Math.max(array[i], array[array.length - i-1]);

            }


        }
        System.out.println("Число :  " +  min );
    }
}
