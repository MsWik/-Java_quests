package by.peleng.jav.lesson9;
/*9 Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArBook {
    Book[] books;



    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }




    public void GenereteBooks() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Генерация книг");
        System.out.println("-----------");
        System.out.println("Введите число Книг");

        int size = Integer.parseInt(reader.readLine());
        books = new Book[size];
        String title;
        for (int i = 0; i < size; i++) {

            System.out.println("Введите id\n");

            int id = Integer.parseInt(reader.readLine());
            System.out.println("Введите Название\n");
            title = reader.readLine();

            System.out.println("Введите Авторов через запятую\n");

            String author = reader.readLine();


            System.out.println("Введите Издательство\n");


            String publisher = reader.readLine();
            System.out.println("Введите год издания\n");

            int yearPublishing = Integer.parseInt(reader.readLine());

            System.out.println("Введите число страниц\n");

            int pages = Integer.parseInt(reader.readLine());
            System.out.println("Введите цену\n");

            float proce = Float.parseFloat(reader.readLine());


            System.out.println("Введите тип переплета\n");
            String binding = reader.readLine();

            books[i] = new Book(id, title, author, publisher, yearPublishing, pages, proce, binding);
        }


        System.out.println("--------------");
        System.out.println("Ввыод закончен");
        System.out.println("--------------");
    }

    public void getAutor(String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().indexOf(author) != -1) {
                System.out.println(books[i].toString());

            }


        }
    }
    public void getPublisher(String publisher) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublisher().indexOf(publisher) != -1) {
                System.out.println(books[i].toString());

            }


        }
    }
    public void getYear(int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearPublishing()>= year) {
                System.out.println(books[i].toString());

            }


        }

    }


    public void toStrings() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }


    }


}



