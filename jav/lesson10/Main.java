package by.peleng.jav.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*10 Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("------------");
        ArAirline arAirline = new ArAirline();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        //  aCustomers.GenereteCistomers();
        //  aCustomers.toStrings();

        //  aCustomers.sortBuyers();
        System.out.println("--------------");
        //     System.out.println("Ввыод отсортированных по фамилии пользователей");
        System.out.println("--------------");


        Scanner in = new Scanner(System.in);
        String str;

        do {

            System.out.println("1)Ввести список рейсов");
            System.out.println("2)Вывести список рейсов");
            System.out.println("3)Список рейсов для заданного пункта назначения");
            System.out.println("4)Список рейсов для заданного дня недели");
            System.out.println("5)Список рейсов для заданного дня недели время вылета больше заданного");
            System.out.println("-------------");

            Scanner ins = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер  корректно  ");
                in.next();
            }
            int keys = in.nextInt();


            switch (keys) {
                case (1):
                    arAirline.GenereteAirlines();
                    break;
                case (2):
                    System.out.println("--------------");
                    arAirline.toStrings();
                    System.out.println("--------------");

                    break;

                case (3):

                    System.out.println("Введите пункт назначения");
                    System.out.println("--------------");

                    String destination = reader.readLine();
                    arAirline.getDestination(destination);
                    System.out.println("--------------");


                    break;
                case (4):
                    System.out.println("--------------");
                    System.out.println("Введите название дня недели");

                    System.out.println("--------------");
                    String aircraftdaysWeek = reader.readLine();
                    arAirline.getAircraftdaysWeek(aircraftdaysWeek);


                    break;

                case (5):
                    System.out.println("--------------");
                    System.out.println("Введите день недели ");

                    String aircraftdaysWeeks = reader.readLine();

                    System.out.println("Введите двремя HH:mm:ss");
                    Date date= ft.parse(reader.readLine());
                    arAirline.getAircraftdaysWeekData(aircraftdaysWeeks,date);

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
