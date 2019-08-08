package by.peleng.note;

import by.peleng.note.DAO.NoteDAO;
import by.peleng.note.entity.*;
import by.peleng.note.inpl.FileNoteDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками
        в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
        Общие пояснения к практическому заданию.
        • В начале работы приложения данные должны считываться из файла, в конце
        работы – сохраняться в файл.
        • У пользователя должна быть возможность найти запись по любому параметру
        или по группе параметров (группу параметров можно определить
        самостоятельно), получить требуемые записи в отсортированном виде, найти
        записи, текстовое поле которой содержит определенное слово, а также
        добавить новую запись.
        • Особое условие: поиск, сравнение и валидацию вводимой информации
        осуществлять с использованием регулярных выражений.
        • Особое условие: проверку введенной информации на валидность должен
        осуществлять код, непосредственно добавляющий информацию.*/
public class Main {

    public static void main(String[] args) throws IOException {
        NoteDAO noteDAO = new FileNoteDAO();
        List<Note>  noteList = new ArrayList<>();
        if (noteDAO.getAll()!=null){
        noteList.addAll(noteDAO.getAll());}
        String str="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));







        do {

            System.out.println("1)Ввести заметку");
            System.out.println("2)Вывести все заметки");
            System.out.println("3)Отсортировать все заметки по Дате и Титлу");
            System.out.println("4)Отсортировать все заметки по емейлу и дате");
            System.out.println("5)Отсортировать все по дате");


            System.out.println("-------------");


            int keys = 0;
            try {
                keys = Integer.parseInt(reader.readLine());
            }

            catch(NumberFormatException e){

                System.out.println("Не корректно указано число, попробуйте снова");
            }

            catch (IOException e) {
                e.printStackTrace();
                System.out.println("Не корректно указано число, попробуйте снова");
            }


            switch (keys) {
                case (1):
                    NoteInfo note = new NoteInfo();
                    note.noteInfo();
                    noteList.add((Note) note);

                    break;
                case (2):

                    if (noteList!=null){
                        for (Note s:noteList){
                            System.out.println(s.toString());
                        }
                    }




                    break;

                case (3):
                    ComporatorNoteByDataTitle comporatorNoteByDataTitle =new ComporatorNoteByDataTitle();
                    Collections.sort(noteList, comporatorNoteByDataTitle);

                    break;

                case (4):
                    ComporatorNotesByEmailData comporatorNotesByEmailData = new ComporatorNotesByEmailData();
                    Collections.sort(noteList, comporatorNotesByEmailData);

                    break;


                case (5):
                    ComporatorNotesByData comporatorNotesByData = new ComporatorNotesByData();
                    Collections.sort(noteList, comporatorNotesByData);


                    break;

                default:
                    System.out.println("Не верный выбор. Попробуйте еще раз ");

                    break;

            }

            System.out.print("Закончить  Y/N: ");

            try {
                str = reader.readLine();
            }

            catch (IOException e) {
                e.printStackTrace();
                System.out.print("Не корректный ввод: ");

            }
        } while (!str.equals("Y"));
        noteDAO.saveAll(noteList);



    }
    }
