package by.peleng.java.impl;

import by.peleng.java.DAO.LibDAO;
import by.peleng.java.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FiliLibDAO implements LibDAO {

    private static final FiliLibDAO instance= new FiliLibDAO();

    public static FiliLibDAO getInstance() {
        return instance;
    }

    private FiliLibDAO() {
    }

    public Book toBook(String users) {
        Book bookNew = new Book();
        String[] bookSplit = users.split("\\|");
        //   System.out.println(Arrays.toString(bookSplit));
        bookNew.setName(bookSplit[0].split("=")[1]);
        bookNew.setAuthor(bookSplit[1].split("=")[1]);

        bookNew.setYearOfPublishing(Integer.parseInt(bookSplit[2].split("=")[1]));
        bookNew.setDescription(bookSplit[3].split("=")[1]);
      //  System.out.println(bookSplit[4].split("=")[1]);
        bookNew.setPaper(Boolean.parseBoolean(bookSplit[4].split("=")[1]));
//        System.out.println(bookSplit[5].split("=")[1]);
        bookNew.setId(Integer.parseInt(bookSplit[5].split("=")[1]));



        return bookNew;
    }


    @Override
    public boolean add(Book b) {


        Writer writer = null;
        try {


            String str = b.toString();


            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("baza.txt", true), "utf-8"));
            writer.write(str);
            //   System.out.println(str);
            writer.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        }

        return true;


    }

    @Override
    public boolean remove(int id) {
        Writer writer = null;
        String s;
        String bookList = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./resourсes/baza.txt"));
            while ((s = br.readLine()) != null) {
                bookList += s+"\n";
            }

            List<String> loginListAr = new LinkedList<String>(
                    Arrays.asList(bookList.split("\n")));
            System.out.println(loginListAr);
            for (int i = 0; i < loginListAr.size(); i++) {
                int numberId;
                String count = loginListAr.get(i);
                numberId = count.indexOf(Integer.toString(id));
                if (numberId != -1) {

                    loginListAr.remove(i);
                }

            }
            br.close();
            System.out.println(loginListAr);
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("./resourсes/baza.txt", false), "utf-8"));
            String finalStringAdd="";
            for (String count:loginListAr){
              finalStringAdd+=count+"\n";
          }
            writer.write(finalStringAdd);
            //   System.out.println(str);
            writer.flush();


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        }

        return true;


    }

    @Override
    public List<Book> find(String title) {
        List<Book> listBook = new ArrayList<>();


        String s;
        String bookList = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./resourсes/baza.txt"));
            while ((s = br.readLine()) != null) {
                bookList += s+"\n";

            }


            List<String> loginListAr = Arrays.asList(bookList.split("\n"));
            for (int i = 0; i < loginListAr.size(); i++) {
                int numberTitle;
                String count = loginListAr.get(i);
                numberTitle = count.indexOf(title);
                if (numberTitle != -1) {
                    listBook.add(toBook(count));


                }

            }
            br.close();


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return null;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return null;
        }


        return listBook;
    }

    @Override
    public List<Book> getBook() {
        List<Book> listBook = new ArrayList<>();


        String s;
        String bookList = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./resourсes/baza.txt"));
            while ((s = br.readLine()) != null) {
                bookList += s+"\n";

            }


            List<String> loginListAr = Arrays.asList(bookList.split("\n"));
            for (int i = 0; i < loginListAr.size(); i++) {

                String count = loginListAr.get(i);


                    listBook.add(toBook(count));




            }
            br.close();


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return null;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return null;
        }


        return listBook;



    }


}
