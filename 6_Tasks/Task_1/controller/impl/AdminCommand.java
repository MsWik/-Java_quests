package by.peleng.java.controller.impl;

import by.peleng.java.DAO.LibDAO;
import by.peleng.java.DAO.UserDAO;
import by.peleng.java.entity.Book;
import by.peleng.java.entity.BookInfo;
import by.peleng.java.entity.User;
import by.peleng.java.impl.FileUserDAO;
import by.peleng.java.impl.FiliLibDAO;

import javax.mail.MessagingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdminCommand {

    public void adminCommand(User user) throws IOException, MessagingException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LibDAO libDAO= FiliLibDAO.getInstance();
        UserDAO userDAO= FileUserDAO.getInstance();
        String str=null;

        do {

            System.out.println("1)Посмотреть все имеющиеся книги");
            System.out.println("2)Найти книгу по названию");
            System.out.println("3)Удалить книгу по id");
            System.out.println("4)Добавить новую книгу");
            System.out.println("5)Удалить пользователя");
            System.out.println("6)Добавить новую книгу и известить всех");
            System.out.println("7)Вывести электронные/бумажные книги");

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
                    System.out.println("Введите ID для удаления");
                    int id = Integer.parseInt(reader.readLine());
                    libDAO.remove(id);
                    break;
                case (4):
                    System.out.println("-------------");
                    BookInfo bookInfo = new BookInfo();

                    bookInfo.bookinfo();
                    libDAO.add(bookInfo);
                    break;
                case (5):
                    System.out.println("-------------");
                    System.out.println("Введите логин пользователя для удаления");
                    String login=reader.readLine();
                    if (userDAO.remove(login)) {System.out.println("Пользователь " + login + "успешно удален");}
                    else {System.out.println("Пользователь " + login + "не удален");}
                    break;


                case (6):
                    System.out.println("-------------");
                    BookInfo bookInfos = new BookInfo();

                    bookInfos.bookinfo();
                    libDAO.add(bookInfos);
                    List<String> adminEmail = new ArrayList<>(userDAO.getAdminEmail(userDAO.getUserList()));
                    List<String> userEmail = new ArrayList<>(userDAO.getUserEmail(userDAO.getUserList()));
                    MailSender mailSender = new MailSender();
                    System.out.println(adminEmail.get(0) + "  " +userEmail.get(0));
                    BookToMessage bookToMessage=new BookToMessage();
                    String mailSend =bookToMessage.bookToMessageSet(bookInfos);

                     for(int i=0;i<userEmail.size();i++){
                    mailSender.mailAdd(adminEmail.get(0),userEmail.get(i),
                            "Добавлена новая книга",mailSend,"VH58074VHq");}
                    break;
                case (7):
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
