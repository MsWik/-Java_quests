package by.peleng.java.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookInfo extends Book {

    public BookInfo() {
    }

    public void bookinfo() throws IOException {
        System.out.println("-------------");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название книги");
        super.setName(reader.readLine());
        System.out.println("Введите автора книги ");
        super.setAuthor(reader.readLine());
        System.out.println("Введите год издания книги ");
        super.setYearOfPublishing(Integer.parseInt(reader.readLine()));
        System.out.println("Введите краткое описание книги");
        super.setDescription(reader.readLine());
        System.out.println("Введите id книги");
        super.setId(Integer.parseInt(reader.readLine()));
        System.out.println("Книга бумажная или электронная (1 бумага/0 электронная)");
        Integer paper = Integer.parseInt(reader.readLine());
        Boolean bools;
        if (paper==1){bools=true;}else {bools=false;}
        super.setPaper(bools);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
