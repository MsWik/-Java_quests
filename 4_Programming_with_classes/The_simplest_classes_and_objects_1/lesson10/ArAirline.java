package by.peleng.jav.lesson10;


/*10 Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArAirline {
    Airline[] airlines;







    public void GenereteAirlines() throws IOException, ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Генерация самолетов");
        System.out.println("-----------");
        System.out.println("Введите число рейсов");

        int size = Integer.parseInt(reader.readLine());
        airlines = new Airline[size];
        String flightNumber;
        for (int i = 0; i < size; i++) {

            System.out.println("Введите пункт назначения\n");

            String destination = reader.readLine();
            System.out.println("Введите номер рейса\n");
            flightNumber = reader.readLine();

            System.out.println("Введите тип самолета\n");

            String aircraftType = reader.readLine();


            System.out.println("Введите дату вылета (HH:mm:ss)\n");


            Date date= ft.parse(reader.readLine());
            System.out.println("Введите деньт недели\n");

            String aircraftdaysWeek = reader.readLine();



            airlines[i] = new Airline(destination, flightNumber, aircraftType, date, aircraftdaysWeek);
        }


        System.out.println("--------------");
        System.out.println("Ввод закончен");
        System.out.println("--------------");
    }

    public void getDestination(String destination) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().indexOf(destination) != -1) {
                System.out.println(airlines[i].toString());

            }


        }
    }
    public void getAircraftdaysWeek(String aircraftdaysWeek) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getAircraftdaysWeek().indexOf(aircraftdaysWeek) != -1) {
                System.out.println(airlines[i].toString());

            }


        }
    }
    public void getAircraftdaysWeekData(String aircraftdaysWeek, Date date) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getAircraftdaysWeek().indexOf(aircraftdaysWeek) != -1
                    && airlines[i].getDepartureTime().after(date)) {
                System.out.println(airlines[i].toString());

            }


        }

    }


    public void toStrings() {
        for (int i = 0; i < airlines.length; i++) {
            System.out.println(airlines[i].toString());
        }


    }
}
