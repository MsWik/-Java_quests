package by.peleng.java.lesson5.lesson3;
import by.peleng.java.lesson5.lesson3.Сalendars;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        Сalendars calendas = new Сalendars();


        do {

            System.out.println("1)Создать праздничные даты");
            System.out.println("2)Вывести дни недели");



            System.out.println("-------------");


            int keys = Integer.parseInt(reader.readLine());


            switch (keys) {
                case (1):

                    calendas.dateHoliday();




                    break;
                case (2):
                    Calendar date =Calendar.getInstance();
                    System.out.println("--------------");
                    System.out.println("Введите дату начала отсчета в формате dd/MM/yyyy");
                    String dates = reader.readLine();
                    if (dates.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
                        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
                        date.setTime(parser.parse(dates));

                        System.out.println("Введите число дней ");
                        int i = Integer.parseInt(reader.readLine());
                        calendas.dateHolidayToIn(date,i);
                        System.out.println("--------------");
                    } else {
                        System.out.println("Что то пошло не так ");}
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
