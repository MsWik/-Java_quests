package by.peleng.java.lesson2;

/* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
*/
public class OneDimensional3 {

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
        int negative = 0;
        int positive = 0;
        int nul = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                nul++;
            }


        }
        System.out.println("Положительных элементов :" + positive + " отрицательных элементов :" + negative + " 0 элементов : " + nul);
    }


}


