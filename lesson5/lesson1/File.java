package by.peleng.java.lesson5.lesson1;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/*Задача 1
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/
public class File extends Directory {


    static String NAME;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public File(String name, String Dir) {
        super(Dir);
        NAME = name;
    }
    public File() {

    }




}