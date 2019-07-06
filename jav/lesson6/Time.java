package by.peleng.jav.lesson6;
/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time() {
        hour = 0;
        minute = 0;
        second = 0;


    }
    Time(int hour, int minute, int second){
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Не верно указано значение часа");
            this.hour = 0;
            System.out.println("Час установлен в 0");
        }

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Не верно указано значение минут");
            this.minute = 0;
            System.out.println("Минуты установлены в 00");
        }

        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Не верно указано значение секунд");
            this.second = 0;
            System.out.println("Секунды установлены в 00");
        }

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Не верно указано значение часа");
            this.hour = 0;
            System.out.println("Час установлен в 0");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Не верно указано значение минут");
            this.minute = 0;
            System.out.println("Минуты установлены в 00");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Не верно указано значение секунд");
            this.second = 0;
            System.out.println("Секунды установлены в 00");
        }
    }

    public void setHourAdd(int hour) {
        if ((this.hour + hour)<=23) {
            this.hour += hour;
        } else {
            System.out.println("Не верно указано значение часа");
            this.hour = 0;
            System.out.println("Часы установлены в 00");
        }
    }

    public void setMinuteAdd(int minute) {

            if ((this.minute+minute)<59) {
                this.minute = minute;
            } else {
                System.out.println("Не верно указано значение минут");
                this.minute = 0;
                System.out.println("Минуты установлены в 00");
            }
        }


    public void setSecondAdd(int second) {
        if ((this.second+second)<59) {
            this.second = second;
        } else {
            System.out.println("Не верно указано значение секунд");
            this.second = 0;
            System.out.println("Секунды установлены в 00");
        }
    }
}