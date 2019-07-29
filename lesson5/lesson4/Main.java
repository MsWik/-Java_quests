package by.peleng.java.lesson5.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str="";

        TreasureGenerator treasureGenerator = new TreasureGenerator();


        do {

            System.out.println("1)Вывести список сокровищь");
            System.out.println("2)Найти самое дорогое");
            System.out.println("3)Найти сокровища на заданную сумму");
     //       System.out.println("4)Сохранить сокровища в файл");



            System.out.println("-------------");


            int keys = 0;
            try {
                keys = Integer.parseInt(reader.readLine());
            }

            catch(NumberFormatException e){

                System.out.println("Не корректно указано число, попробуйте снова");
            }

            catch (IOException e) {
                e.printStackTrace();
                System.out.println("Не корректно указано число, попробуйте снова");
            }


            switch (keys) {
                case (1):
                    System.out.println("-------------");
                    System.out.println(treasureGenerator.toString());
                    System.out.println("-------------");

                    break;
                case (2):

                    System.out.println("--------------");
                    System.out.println("Самое дорогое сокровище: ");
                    System.out.println(treasureGenerator.searcDear().toString());

                    break;

                case (3):

                    System.out.println("--------------");
                    System.out.println("Введите сумму: ");
                    long maxCost=0;
                    try {
                        maxCost=Long.parseLong(reader.readLine());
                    }
                    catch(NumberFormatException e){

                        System.out.println("Не корректно указано число, попробуйте снова");
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Не корректно указано число, попробуйте снова");
                    }
                    if (maxCost!=0) {
                        System.out.println(treasureGenerator.toStringList(treasureGenerator.giveTreasures(maxCost)));
                        System.out.println(maxCost);
                    } else {System.out.println("Попробуйте еще раз. Стоимость равна 0");}
                    break;



                default:
                    System.out.println("Не верный выбор. Попробуйте еще раз ");

                    break;

            }

            System.out.print("Закончить  Y/N: ");

            try {
                str = reader.readLine();
            }

            catch (IOException e) {
                e.printStackTrace();
                System.out.print("Не корректный ввод: ");

            }
        } while (!str.equals("Y"));



    }

}



