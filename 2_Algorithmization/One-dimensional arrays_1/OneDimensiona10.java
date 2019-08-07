package by.peleng.java.lesson2;
/*10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать*/
import java.util.Arrays;

public class OneDimensiona10 {

    public static void main(String args[]) {
        int[] array = {2, 5, 7, 8, 3, 5, -5, 1};


        for (int i = 1; i < array.length; i+=2) {

                array[i] = 0;


            }

        int fielSort;
        for(int i = 2, j = 1; i < array.length; i+=2, j++ ){
            fielSort = array[j];
            array[j] = array[i];
            array[i] = fielSort;
        }
        System.out.println("Result: " + Arrays.toString(array));



        }
    }

