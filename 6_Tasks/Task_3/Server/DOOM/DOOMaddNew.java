package by.peleng.java.DOOM;


import by.peleng.java.entity.Student;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOOMaddNew {


    public boolean dOOMUpdate(Student student) {

        try {

            DocumentBuilderFactory docFactoru = DocumentBuilderFactory.newInstance();
            DocumentBuilder dobBuilder = docFactoru.newDocumentBuilder();
            Document doc = null;
            doc = dobBuilder.parse("baza.xml");


            // Получаем корневой элемент
            Node root = doc.getDocumentElement();

            // Создаем новую книгу по элементам
            // Сама книга <Book>
            Element students = doc.createElement("student");
            students.setAttribute("id", String.valueOf(doc.getElementsByTagName("student").getLength()+1));
            // <Title>
            Element name = doc.createElement("name");
            // Устанавливаем значение текста внутри тега
            name.setTextContent(student.getName());
            // <Author>
            Element surname = doc.createElement("surname");
            surname.setTextContent(student.getSurname());
            // <Date>
            Element age = doc.createElement("age");
            age.setTextContent(String.valueOf(student.getAge()));
            // <ISBN>
            Element location = doc.createElement("location");
            location.setTextContent(student.getLocation());
            // <Publisher>
            Element grupnumber = doc.createElement("grupnumber");
            grupnumber.setTextContent(student.getGrupnumber());
            // <Cost>
            //Element cost = document.createElement("Cost");
            //cost.setTextContent("499");
            // Устанавливаем атрибут
           // cost.setAttribute("currency", "RUB");

            // Добавляем внутренние элементы книги в элемент <Book>
            students.appendChild(name);
            students.appendChild(surname);
            students.appendChild(age);
            students.appendChild(location);
            students.appendChild(grupnumber);
           // students.appendChild(cost);
            // Добавляем книгу в корневой элемент
            root.appendChild(students);

            // Записываем XML в файл

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("baza.xml"));
            transformer.transform(source, result);
            System.out.println("Финиш");
        } catch (SAXException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
            return false;
        } catch (TransformerException e) {
            e.printStackTrace();
            return false;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}