package by.peleng.java.controller.impl;

import by.peleng.java.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookToPaperOrNo {

    public List<Book> getBook(List<Book> list, boolean paper) {
        List<Book> pBook = new ArrayList<>();
        if (paper==true){

        for (Book book:list){
            if(book.isPaper()==true){
                pBook.add(book);
            }
        }

        return pBook;
        } else {

            for (Book book:list){
                if(book.isPaper()!=true){
                    pBook.add(book);
                }
            }

            return pBook;
        }
    }





}
