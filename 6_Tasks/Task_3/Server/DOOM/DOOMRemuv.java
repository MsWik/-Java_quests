package by.peleng.java.DOOM;

import by.peleng.java.entity.Student;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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

public class DOOMRemuv {

      //   public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {


        public boolean domRemuv(String id) {

            try {

                DocumentBuilderFactory docFactoru = DocumentBuilderFactory.newInstance();
                DocumentBuilder dobBuilder = docFactoru.newDocumentBuilder();
                Document doc = null;
                doc = dobBuilder.parse("baza.xml");

                Node course = doc.getElementsByTagName("student").item(Integer.parseInt(id)-1);
                NodeList list = course.getChildNodes();
                course.getAttributes().removeNamedItem("id");


                for (int i = 0; i < list.getLength(); i++) {
                    Node node = list.item(i);
                    if ("name".equals(node.getNodeName())) {
                        course.removeChild(node);
                    }
                    if ("surname".equals(node.getNodeName())) {
                        course.removeChild(node);
                    }
                    if ("age".equals(node.getNodeName())) {
                        course.removeChild(node);
                    }
                    if ("location".equals(node.getNodeName())) {
                        course.removeChild(node);
                    }

                    if ("grupnumber".equals(node.getNodeName())) {
                        course.removeChild(node);
                    }
                    if ("student".equals(node.getNodeName())) {
                        course.removeChild(node);
                    }
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



