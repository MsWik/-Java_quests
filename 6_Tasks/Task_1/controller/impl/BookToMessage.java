package by.peleng.java.controller.impl;

import by.peleng.java.entity.Book;

public class BookToMessage {

    public String bookToMessageSet(Book book){
        return  "Добавлена книга - "+ book.getName() + "\n" +
                "Автор книги :"+ book.getAuthor() + "\n" +
                "Книга выпущенна в " + book.getYearOfPublishing() +"\n"
                +"Краткое описание книги:  " +book.getDescription() +"id" + book.getId();

    }
    public String bookToMessageGet(Book book){
        return  "Прошу добавить книгу- "+ book.getName() + "\n" +
                "Автор книги :"+ book.getAuthor() + "\n" +
                "Книга выпущенна в " + book.getYearOfPublishing() +"\n"
                +"Краткое описание книги:  " +book.getDescription() +"id" + 0;

    }


}
