package by.peleng.java.DOOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOOMparser {
    public String domParser()  {
        String result;

        try {
            File fXmlFil = new File("baza.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBulder = dbFactory.newDocumentBuilder();
            Document doc = null;

            doc = dBulder.parse(fXmlFil);

           result = (doc.getDocumentElement().getNodeName()) + "\n";
            NodeList nodeList = doc.getElementsByTagName("student");
            result+="----------"+"\n";
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                result+=("\n\n Element      " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    if (element.hasAttribute("id")) {
                        result += ("\nid---------  " + element.getAttribute("id"));
                        result += ("\nname-------  " + element.getElementsByTagName("name").item(0).getTextContent());
                        result += ("\nsurname----  " + element.getElementsByTagName("surname").item(0).getTextContent());
                        result += ("\nage--------  " + element.getElementsByTagName("age").item(0).getTextContent());
                        result += ("\nlocation---  " + element.getElementsByTagName("location").item(0).getTextContent());
                        result += ("\ngrupnumber-  " + element.getElementsByTagName("grupnumber").item(0).getTextContent());
                    } else {
                        result+="\n Элемент пуст  ";
                    }

                }

            }
        } catch (ParserConfigurationException e) {

            result=null;
            return e.toString();
        }
         catch (SAXException e) {
             result=null;
             return e.toString();
        } catch (IOException e) {
            result=null;
            return e.toString();
        }

    return result;
    }

}
