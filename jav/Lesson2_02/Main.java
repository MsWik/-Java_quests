package by.peleng.jav.Lesson2_02;
/*/*2 Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите название авто");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String title=reader.readLine();
        Car car= new Car(title);

        String str="";
        do {

            System.out.println("1)Вывести марку");
            System.out.println("2)Заменить колесо");
            System.out.println("3)Ехать");
            System.out.println("4)Заправляться");

            System.out.println("-------------");

            int keys = Integer.parseInt(reader.readLine());


            switch (keys) {
                case (1):
                    System.out.println("--------------");
                   System.out.println(car.getTitle());
                    System.out.println("--------------");
                    break;
                case (2):
                    System.out.println("--------------");
                    System.out.println("Введите номер колеса ");
                    System.out.println("--------------");
                    int num=Integer.parseInt(reader.readLine());
                    num--;
                    if (num<4){
                    car.change(num);} else {System.out.println("У авто 4 колеса");}

                    break;

                case (3):


                    System.out.println("--------------");
                    car.carGo();


                    break;
                case (4):
                    System.out.println("--------------");
                    car.refueling();


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
