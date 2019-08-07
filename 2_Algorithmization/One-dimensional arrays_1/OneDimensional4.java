package by.peleng.java.lesson2;
/* Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/
public class OneDimensional4 {

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
        int more = 0;
        int less = 0;
        float byf = 0;
        float min = 0;
        float max = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                more = i;
            } else if (array[i] > max) {
                max = array[i];
                less = i;
            }


        }
        byf = array[more];
        array[more] = array[less];
        array[less] = byf;
        System.out.println("Минимальный элемент стоит в позиции " + more + " Максимальный элемент стоит в позиции " + less + "  Отсчет идет с 0 элемента ");
    }

}
