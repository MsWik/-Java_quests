package by.peleng.java.lessen3;


/*Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.*/


/*import java.util.regex.Matcher;
import java.util.regex.Pattern;*/

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Application2 {









    public static void main(String[] args) {




     /*   String xml = "<notes><note id = \"1\"><to>Вася</to><from>Света</from><heading>Напоминание</heading>" +
                "<body>Позвони мне завтра!</body></note><note id = \"2\"><to>Петя</to><from>Маша</from><heading>" +
                "Важное напоминание</heading><body/></note></notes>";






        while (!xml.equals("")) {
            String reg1 = "";
            String reg2 = "/";
            for (int i = 1; i < xml.length(); i++) {
                if (xml.charAt(i) == ' ' || xml.charAt(i) == '>') {
                    break;
                }
                reg1 += String.valueOf(xml.charAt(i));
            }



            reg2 += reg1;

            if (reg1.charAt(reg1.length() - 1) == '/') {

                String in = "";
                for (int i = reg1.length() + 1; i < xml.length(); i++) {
                    if(xml.charAt(i) == '>') {
                        break;
                    }
                    in += String.valueOf(xml.charAt(i));
                }

                System.out.println();
                System.out.println();
                System.out.println("#####");
                System.out.println("Tag <" + reg1 + "> without body");
                System.out.println("Tag content - " + in);
                xml = xml.replace("<" + reg1 + in + ">","");
                System.out.println("#####");
            } else {

                Pattern p = Pattern.compile(reg1 + ".+?" + reg2);
                Matcher m = p.matcher(xml);

                String[] strings = new String[10];
                int h = 0;

                while (m.find()) {

                    strings[h] = "";
                    int cnt = reg1.length();
                    for (int i = m.start() + reg1.length(); i < xml.length(); i++) {
                        cnt++;
                        if (xml.charAt(i) == '>') {
                            break;
                        }
                        strings[h] += String.valueOf(xml.charAt(i));
                    }
                    String res = xml.substring(m.start() + cnt, m.end() - reg1.length() - 2);

                    System.out.println();
                    System.out.println();
                    System.out.println("#####");
                    System.out.println("Opening tag <" + reg1 + strings[h] + "> ,closing tag <" + reg2 + ">");
                    System.out.println("Tag content - " + strings[h]);
                    System.out.println("Node content <" + reg1 + strings[h] + ">" + "..." + "<" + reg2 + ">");
                    System.out.println(res);
                    System.out.println("#####");
                    h++;
                }

                for (int i = 0; i < h; i++) {
                    int index = xml.indexOf(reg1);
                    if (xml.charAt(index + reg1.length() + strings[i].length() + 1) == '<') {
                        xml = xml.replaceFirst("<" + reg1 + strings[i] + ">", "");
                        xml = xml.replaceAll("<" + reg2 + ">", "");
                    } else {
                        String s = "";
                        for (int j = index + reg1.length() + strings[i].length() + 1; j < xml.length(); j++) {
                            if (xml.charAt(j) == '<') {
                                break;
                            }
                            s += String.valueOf(xml.charAt(j));
                        }
                        String ss = "<" + reg1 + strings[i] + ">" + s;
                        xml = xml.replace(ss, "");
                        xml = xml.replaceAll("<" + reg2 + ">", "");
                    }
                }
            }
        }*/
    }
}



