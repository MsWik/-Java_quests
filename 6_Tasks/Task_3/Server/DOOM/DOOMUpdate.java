package by.peleng.java.DOOM;
import by.peleng.java.entity.Student;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DOOMUpdate {
    //   public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {


    public boolean dOOMUpdate(Student student) {

        try {

        DocumentBuilderFactory docFactoru = DocumentBuilderFactory.newInstance();
        DocumentBuilder dobBuilder = docFactoru.newDocumentBuilder();
        Document doc = null;
        doc = dobBuilder.parse("baza.xml");


        Node course = doc.getElementsByTagName("student").item(student.getId()-1);


        NamedNodeMap attr = course.getAttributes();
        Node nodeAttr = attr.getNamedItem("id");
        nodeAttr.setTextContent(String.valueOf(student.getId()));

     //  course.appendChild(categoru);
        NodeList list = course.getChildNodes();


        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            if ("name".equals(node.getNodeName())) {
               node.setTextContent(student.getName());
            }
            if ("surname".equals(node.getNodeName())) {
                node.setTextContent(student.getSurname());
            }
            if ("age".equals(node.getNodeName())) {
                node.setTextContent(String.valueOf(student.getAge()));
            }
         if ("location".equals(node.getNodeName())) {
                node.setTextContent(student.getLocation());
            }

            if ("grupnumber".equals(node.getNodeName())) {
                node.setTextContent(student.getGrupnumber());
            }
//            if ("grupnumber".equals(node.getNodeName())) {
  //              course.removeChild(node);
    //        }


       }


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
//}