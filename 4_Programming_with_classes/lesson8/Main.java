package by.peleng.jav.lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------");
        ACustomers aCustomers = new ACustomers();

      //  aCustomers.GenereteCistomers();
      //  aCustomers.toStrings();

      //  aCustomers.sortBuyers();
        System.out.println("--------------");
   //     System.out.println("Ввыод отсортированных по фамилии пользователей");
        System.out.println("--------------");

       // aCustomers.toStrings();


        Scanner in = new Scanner(System.in);
        String str;

        do {

            System.out.println("1)Ввести покупателей");
            System.out.println("2)Вывести покупателей");
            System.out.println("3)Отсортировать по фамилии");
            System.out.println("4)По кредитной карточке");

            System.out.println("-------------");

            Scanner ins = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер  корректно  ");
                in.next();
            }
            int keys = in.nextInt();


            switch (keys) {
                case (1):
                    aCustomers.GenereteCistomers();
                    break;
                case (2):
                    System.out.println("--------------");
                    aCustomers.toStrings();
                    System.out.println("--------------");

                    break;

                case (3):

                    aCustomers.sortBuyers();
                    System.out.println("--------------");
                    System.out.println("Ввыод отсортированных по фамилии пользователей");
                    System.out.println("--------------");

                    aCustomers.toStrings();

                    break;
                case (4):
                    System.out.println("--------------");
                    System.out.println("Введите значение MAX");
                    int max = in.nextInt();
                    System.out.println("--------------");
                    System.out.println("Введите значение МИН");
                    int min = in.nextInt();
                    aCustomers.getCard(min, max);
                    System.out.println("--------------");
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