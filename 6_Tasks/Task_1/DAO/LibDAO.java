package by.peleng.java.DAO;

import by.peleng.java.entity.Book;

import java.util.List;

public interface LibDAO {
    boolean add(Book b);
    boolean remove(int id);
    List<Book> find(String title);
    List<Book>  getBook();




}
