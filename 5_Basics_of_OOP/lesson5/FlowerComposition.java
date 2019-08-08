package by.peleng.java.lesson5.lesson5;

import by.peleng.java.lesson5.lesson5.DAO.FlowerDAO;
import by.peleng.java.lesson5.lesson5.DAO.FlowerDAOint;

import by.peleng.java.lesson5.lesson5.impl.Provider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlowerComposition {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Provider provider = new Provider();
        List<Object> obg = new ArrayList<>();
        FlowerDAOint flowerDAOint = new FlowerDAO();
        Random random = new Random();
        String str=null;




        do {

            System.out.println("1)Создать букет");
            System.out.println("2)Записать букет");
            System.out.println("3)Прочитать букет");




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
              for (int count=0;count<random.nextInt(10)+1; count++){
                  obg.add(provider.getCommand("ЦВЕТОК"));

              }
                    obg.add(provider.getCommand("УПАКОВКА"));
                    for (int i=0;i<obg.size();i++){
                        System.out.println(obg.get(i).toString());

                    }


                    break;
                case (2):

                   if(flowerDAOint.savebouquet(obg)){System.out.println("Данные записаны");};



                    break;

                case (3):

                    System.out.println("--------------");
                    flowerDAOint.retirntext();
                    System.out.println("--------------");
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
