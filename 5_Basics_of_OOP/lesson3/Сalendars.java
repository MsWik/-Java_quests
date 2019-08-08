package by.peleng.java.lesson5.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;


/*Задача 3
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.*/
public class Сalendars {

    List<Holiday> holidays = new ArrayList<Holiday>();

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public Сalendars(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public Сalendars() {

    }

    public void dateHoliday() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calendar date = Calendar.getInstance();
        String str = "";
        int namberHoliday = holidays.size();
        do {
            System.out.println("-------------");
            System.out.println("Укажите дату в формате dd/MM/yyyy");
            String dates = reader.readLine();
            if (dates.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
                SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
                date.setTime(parser.parse(dates));

                //      Pattern pattern = Pattern.compile("/");
                //        String[] words = pattern.split(dates);


                //         date.set(Integer.parseInt(words[0]), Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                System.out.println("Укажите навазние праздника");
                String nameHolidays = reader.readLine();
                System.out.println("-------------");
                holidays.add(namberHoliday, new Holiday(date, nameHolidays));
                namberHoliday++;
            } else {
                System.out.println("Не верный формат даты");
            }


            System.out.print("Закончить ввод празднечных дат Y/N: ");
            str = reader.readLine();


        } while (!str.equals("Y"));

    }

    public void dateHolidayToIn(Calendar dateIn, int dateEnd) {


        for (int i = 0; i < dateEnd; i++) {
            int day_of_week = dateIn.get(Calendar.DAY_OF_WEEK);
            if (day_of_week == 6 || day_of_week == 7) {
                DateFormat df = new SimpleDateFormat("dd MMM yyyy ");
                System.out.println(df.format(dateIn.getTime()));
                System.out.print("  Сегодня выходной день" + "\n");


            }

            for (int j = 0; j < holidays.size(); j++) {
                if (holidays.get(j).getCalendar().compareTo(dateIn) == 0) {
                    System.out.println("Сегодня " + holidays.get(j).getDescription());
                }

            }
            //  if (holidays.contains(dateIn)) {System.out.println("Сегодня " +
            //            holidays.get(holidays.indexOf(dateIn)).getDescription() ); }

            dateIn.add(Calendar.DATE, 1);

        }

    }



}
