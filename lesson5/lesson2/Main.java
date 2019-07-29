package by.peleng.java.lesson5.lesson2;
/*Задача 2
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        Payments payments = new Payments();
        Payments.Payment payment = new Payments.Payment();

        do {

            System.out.println("1)Создать корзину товаров");
            System.out.println("2)Вывести корзину товаров");
            System.out.println("3)Вывести цену всех товаров");


            System.out.println("-------------");


            int keys = Integer.parseInt(reader.readLine());


            switch (keys) {
                case (1):

                    System.out.println("Введите число товаров");
                    int number = Integer.parseInt(reader.readLine());
                    payments.setNumber(number);
                    payment.generate(payments.getNumber());




                    break;
                case (2):
                    System.out.println("--------------");
                    System.out.println(payment.toString());
                    System.out.println("--------------");

                    break;

                case (3):
                    System.out.println("--------------");
                    System.out.println(payments.getPriceAll(payment));
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
