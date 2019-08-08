package by.peleng.java.controller.impl;

import by.peleng.java.DAO.LibDAO;

import by.peleng.java.DAO.UserDAO;
import by.peleng.java.entity.Book;
import by.peleng.java.entity.User;

import by.peleng.java.impl.FileUserDAO;
import by.peleng.java.impl.FiliLibDAO;

import javax.mail.MessagingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserCommand {

    public void userCommand(User user) throws IOException, MessagingException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         LibDAO libDAO= FiliLibDAO.getInstance();
        String str=null;

        do {

            System.out.println("1)Посмотреть все имеющиеся книги");
            System.out.println("2)Найти книгу по названию");
            System.out.println("3)Направить запрос администратору на добавление книги");
            System.out.println("4)Вывести электронные/бумажные книги");


            System.out.println("-------------");


            int keys = 0;
            try {
                keys = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {

                System.out.println("Не корректно указано число, попробуйте снова");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Не корректно указано число, попробуйте снова");
            }


            switch (keys) {

                case (1):
                    System.out.println("-------------");
                    List<Book> listAll = new ArrayList<>(libDAO.getBook());
                    for (Book s : listAll) {
                        System.out.println(s.toString());
                    }
                    break;
                case (2):
                    System.out.println("-------------");
                    System.out.println("Введите название книги для поиска");
                    String name = reader.readLine();

                    List<Book> list = new ArrayList<>(libDAO.find(name));
                    for (Book s : list) {
                        System.out.println(s.toString());
                    }
                    break;
                case (3):
                    System.out.println("-------------");

                    System.out.println("Введите название книги");
                    String namesBook = reader.readLine();
                    System.out.println("Введите автора книги");
                    String author = reader.readLine();
                    System.out.println("Введите описание книги");
                    String description = reader.readLine();
                    System.out.println("Введите код издания");
                    Integer  yearOfPublishing = Integer.parseInt(reader.readLine());
                    UserDAO userDAO= FileUserDAO.getInstance();
                    List<String> adminEmail = new ArrayList<>(userDAO.getAdminEmail(userDAO.getUserList()));
                    MailSender mailSender = new MailSender();
                     System.out.println("Для успешной отправки письма необходим пароль от вашего почтового ящика");
                    String pass = reader.readLine();
                    Book book = new Book(0,namesBook, author, yearOfPublishing,description, false);
                    BookToMessage bookToMessage = new BookToMessage();

                    mailSender.mailAdd(adminEmail.get(0),user.getEmail(),"Добавлена новая книга",bookToMessage.bookToMessageGet(book),pass);

                    break;

                case (4):
                    System.out.println("-------------");
                    System.out.println("Какие  книги вы хотите увидеть ? (1 - бумажные, 0  электронные");
                    Integer paper = Integer.parseInt(reader.readLine());
                    Boolean bools;
                    if (paper==1){bools=true;}else {bools=false;}
                    BookToPaperOrNo bookToPaperOrNo = new BookToPaperOrNo();
                    for(Book books: bookToPaperOrNo.getBook(libDAO.getBook(),

                            bools)){
                        System.out.println(books.toString());

                    }
                    break;

                default:
                    System.out.println("Не верный выбор. Попробуйте еще раз ");

                    break;

            }

            System.out.print("Закончить  Y/N: ");

            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.print("Не корректный ввод: ");

            }
        } while (!str.equals("Y"));


    }
}
