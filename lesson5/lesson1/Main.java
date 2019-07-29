package by.peleng.java.lesson5.lesson1;
/*Задача 1
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        TextFile file = new TextFile();

        do {

            System.out.println("1)Создать файл");
            System.out.println("2)Переименовать файл");
            System.out.println("3)Вывести на консоль содержимое");
            System.out.println("4)Дополнить файл");
            System.out.println("5)Удалить содержимое файла");


            System.out.println("-------------");


            int keys = Integer.parseInt(reader.readLine());


            switch (keys) {
                case (1):

                    System.out.println("Введите название файла");
                    String filiName = reader.readLine();

                    System.out.println("Введите корневую дерикторию файла");
                    String filidir = reader.readLine();
                    TextFile.NAME = filiName;
                    TextFile.DIR = filidir;
                    file.create();


                    break;
                case (2):
                    System.out.println("--------------");
                    System.out.println("Введите новое название файла");
                    String newName = reader.readLine();
                    file.rename(newName);
                    System.out.println("--------------");

                    break;

                case (3):


                    System.out.println("--------------");
                   file.withdraw();

                    System.out.println("--------------");


                    break;
                case (4):
                    System.out.println("--------------");
                    System.out.println("Введите текст");
                    String newText=reader.readLine();
                    file.add(newText);
                    System.out.println("--------------");


                    break;

                case (5):
                    System.out.println("--------------");
                    file.del();
                    System.out.println("Содержимое очищенно");
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
