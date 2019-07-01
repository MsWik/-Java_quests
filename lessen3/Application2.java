package by.peleng.java.lessen3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/*Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.*/










public class Application2 {


    public static void main(String[] args) {

        String sytimg = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>\"";

        //   while (true) {
        char[] str = sytimg.toCharArray();
        for (int i = 1; i < sytimg.length(); i++) {
            if (str[i] == '<') {
                System.out.print(" Открывающий тэг" + str[i] + " ключевое слово ");
                i++;
                while (str[i] != '>') {
                    if (str[i] == '>') {
                        System.out.print("Закрывающий тэг " + str[i]);

                        if (str[i] != '>') {
                            System.out.print(str[i]);
                        }
                        i++;


                    }

                    System.out.println();
                }


            }


        }
    }
}

 //   }

