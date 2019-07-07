package by.peleng.jav.lesson2_03;
/*3 Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        State state = new State();
        String str="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("1)Создать государтсво");
            System.out.println("2)Вывести на консоль сталицу");
            System.out.println("3)Вывести количество областей");
            System.out.println("4)Вывести площадь государства");
            System.out.println("5)Вывести областные центры");
            System.out.println("-------------");


            int keys = Integer.parseInt(reader.readLine());


            switch (keys) {
                case (1):
                    state.generaState();
                     break;
                case (2):
                    System.out.println("--------------");
                    state.getCitySyperToString();
                    System.out.println("--------------");

                    break;

                case (3):


                    System.out.println("--------------");
                    state.getRegion();
                    System.out.println("--------------");


                    break;
                case (4):
                    System.out.println("--------------");

                    state.square();
                    System.out.println("--------------");



                    break;

                case (5):
                    System.out.println("--------------");

                    state.citiRegion();



                    System.out.println("--------------");
                    break;


                default:
                    System.out.println("Не верный выбор. ");

                    break;

            }

            System.out.print("Закончить  Y/N: ");
            str = reader.readLine();
        } while (!str.equals("Y"));

    }
}
