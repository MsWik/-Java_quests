package by.peleng.java.lesson2;
/*5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/
public class OneDimensional5 {

    public static void main(String args[]) {
        int[] array = {2, 5, 7, 8, 3, 5, -5, 0};
        /*  Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите  Z:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число Z ");
            in.next();
        }
        int first = in.nextInt();
      	 float Z=2;*/

        for (int i = 0; i < array.length; i++) {

            if (array[i] > i) {
                System.out.println(array[i]);
            }


        }


    }

}
