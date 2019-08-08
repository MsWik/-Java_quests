package by.peleng.jav.lesson9;
/*9 Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("------------");
        ArBook arBook = new ArBook();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------------");

        System.out.println("--------------");


        Scanner in = new Scanner(System.in);
        String str;

        do {

            System.out.println("1)Ввести список книг");
            System.out.println("2)Вывести список книг");
            System.out.println("3)Список книг заданного автора");
            System.out.println("4)Список книг заданного издательства");
            System.out.println("5)Список книг выпущенных после заданного года");
            System.out.println("-------------");

            Scanner ins = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер  корректно  ");
                in.next();
            }
            int keys = in.nextInt();


            switch (keys) {
                case (1):
                    arBook.GenereteBooks();
                    break;
                case (2):
                    System.out.println("--------------");
                    arBook.toStrings();
                    System.out.println("--------------");

                    break;

                case (3):

                    System.out.println("Введите автора");
                    System.out.println("--------------");

                    String author = reader.readLine();
                    arBook.getAutor(author);
                    System.out.println("--------------");


                    break;
                case (4):
                    System.out.println("--------------");
                    System.out.println("Введите название издательства");

                    System.out.println("--------------");
                    String publisher = reader.readLine();
                    arBook.getPublisher(publisher);


                    break;

                case (5):
                    System.out.println("--------------");
                    System.out.println("Введите год");
                    int year = Integer.parseInt(reader.readLine());
                    arBook.getYear(year);

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
