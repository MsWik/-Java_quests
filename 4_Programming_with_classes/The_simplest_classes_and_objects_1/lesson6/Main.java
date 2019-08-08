package by.peleng.jav.lesson6;
/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Time time;

        System.out.println("-------------");
        System.out.println("1)Инициализировать часы базовыми параметрами 0:0:0");
        System.out.println("2)Инициализировать часы своими параметрами");
        System.out.println("-------------");
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Ввеедите номер корректно  ");
            in.next();
        }
        int key = in.nextInt();
        String str;

        switch (key) {
            case (1):
                time = new Time();
                break;
            case (2):
                System.out.println("Введите свои параметры:");
                System.out.println("-------------");
                System.out.println("Введите значение часа");
                int сhas = in.nextInt();
                System.out.println("Введите значение минуты");
                int min = in.nextInt();
                System.out.println("Введите значение секунды");
                int sek = in.nextInt();
                time = new Time(сhas,min,sek);


                break;


            default:
                System.out.println("Не верный выбор. Счетчик иницализирован по умолчанию");
                time = new Time();
                break;
        }


        System.out.println("-------------");
        do {

            System.out.println("1)Установить значение часа");
            System.out.println("2)Установить значение минут");
            System.out.println("3)Установить значение секунд");
            System.out.println("4)Показать время");
            System.out.println("5)Добавить час");
            System.out.println("6)Добавить минуты");
            System.out.println("7)Добавить секунды");





            System.out.println("-------------");


            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер  корректно  ");
                in.next();
            }
            int keys = in.nextInt();
            int ch;

            switch (keys) {
                case (1):

                    System.out.println("Введите значение часа");
                    ch = in.nextInt();
                   time.setHour(ch);
                    break;
                case (2):
                    System.out.println("Введите значение минут");
                    ch = in.nextInt();

                    time.setMinute(ch);

                    break;

                case (3):

                    System.out.println("Введите значение секунд");
                    ch = in.nextInt();

                    time.setSecond(ch);

                    break;
                case (4):
                    System.out.println("-------------");
                    System.out.format("%02d",time.getHour());
                    System.out.print(" : ");
                    System.out.format("%02d",time.getMinute());
                    System.out.print(" : ");
                    System.out.format("%02d",time.getSecond());
                    System.out.println("\n-------------");

                    break;

                case (5):

                    System.out.println("Введите сколько часов нужно добавить");
                    ch = in.nextInt();

                    time.setHourAdd(ch);

                    break;
                case (6):

                    System.out.println("Введите сколько минут нужно добавить");
                    ch = in.nextInt();

                    time.setMinuteAdd(ch);

                    break;
                case (7):

                    System.out.println("Введите сколько секунд нужно добавить");
                    ch = in.nextInt();

                    time.setSecondAdd(ch);

                    break;

                default:
                    System.out.println("Не верный выбор. ");

                    break;



            }
            Scanner strr = new Scanner(System.in);
            System.out.print("Закончить ? Y/N: ");

            str = strr.nextLine();
        }
        while (!str.equals("Y"));

    }
}