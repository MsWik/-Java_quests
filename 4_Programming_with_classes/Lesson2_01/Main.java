package by.peleng.jav.Lesson2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("------------");
        Text text = new Text();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //  aCustomers.GenereteCistomers();
        //  aCustomers.toStrings();

        //  aCustomers.sortBuyers();
        System.out.println("--------------");
        //     System.out.println("Ввыод отсортированных по фамилии пользователей");
        System.out.println("--------------");


        Scanner in = new Scanner(System.in);
        String str;

        do {

            System.out.println("1)Ввести текст ");
            System.out.println("2)Вывести текст ");
            System.out.println("3)Вывести заголовок текста");
            System.out.println("4)Дополнить текст");
        //    System.out.println("5)Список рейсов для заданного дня недели время вылета больше заданного");
            System.out.println("-------------");

            Scanner ins = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер  корректно  ");
                in.next();
            }
            int keys = in.nextInt();


            switch (keys) {
                case (1):
                    text.GenereteText();
                    break;
                case (2):
                    System.out.println("--------------");
                    text.toStrings();
                    System.out.println("--------------");

                    break;

                case (3):

                    System.out.println("Заголовок текста");
                    System.out.println("--------------");

                    System.out.println(text.getTitle());

                    System.out.println("--------------");


                    break;
                case (4):
                    System.out.println("--------------");
                    System.out.println("Дополнить текст");

                    System.out.println("--------------");
                    System.out.println("Введите число предложений");
                    int n= Integer.parseInt(reader.readLine());


                    text.addText(n);




                    break;



                default:
                    System.out.println("Не верный выбор. ");

                    break;

            }
            Scanner strr = new Scanner(System.in);
            System.out.print("Закончить  Y/N: ");
            str = strr.nextLine();
        } while (!str.equals("Y"));
    }



}
