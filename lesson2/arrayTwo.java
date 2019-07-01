package by.peleng.java.lesson2;



import java.util.Random;


public class arrayTwo {


    public static void main(String args[]) {
        int[][] array = new int[9][9];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                array[i][j] = random.nextInt(100);

                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();


        for (int i = 1; i < array[0].length; i += 2) {
            if (array[0][i] > array[array.length - 1][i]) {
                System.out.println("Столбец №" + i + ": ");
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j][i] + ", ");
                }
                System.out.println();
            }
        }
    }


}




