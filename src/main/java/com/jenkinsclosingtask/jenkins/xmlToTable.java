package com.jenkinsclosingtask.jenkins;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;


public class xmlToTable {

    public static String getTable(String URL) {
        String html_string = "";

        try {
            // Getting the xml from the URL
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(URL).openStream());

            // Normalize the data
            doc.getDocumentElement().normalize();

            // Split by tag name - item
            NodeList list = doc.getElementsByTagName("item");

            for (int i=0; i< list.getLength(); i++) {
                Node item = list.item(i);
                Element element = (Element) item;
                html_string += "<div class=\"item\">" +
                                "<div class=\"title\"><h2>"+ element.getElementsByTagName("title").item(0).getTextContent() +"</h2></div>" +
                                "  <div class=\"description\">" + element.getElementsByTagName("description").item(0).getTextContent() + "</div>\n" +
                                "<div class=\"link\">"+ element.getElementsByTagName("link").item(0).getTextContent() +"</div>\n" +
                                "<div class=\"pubDate\">"+ element.getElementsByTagName("pubDate").item(0).getTextContent() +"</div>" +
                                "</div>";

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return html_string;
//        try
//        {
////        StringBuilder result = new StringBuilder();
//
////            URL url = new URL(_URL);
////            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
////            conn.setRequestMethod("GET");
////            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
////
////            for (String line; (line = reader.readLine()) != null; ) {
////                myList.add(line);
////            }
////            System.out.println(myList.get(2));
////        }
////        System.out.println(resul);
//////            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse( url);
//////            println "DocumentBuilderFactory doc " + doc.dump()
////
////            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
////            DocumentBuilder db = dbf.newDocumentBuilder();
////            Document doc = db.parse(new URL(url).openStream());
////
////            doc.getDocumentElement().normalize();
//////            System.out.println ("Root element: " +
//////                    doc.getDocumentElement().getNodeName());
////
//////            System.out.println(doc.get);
////
////            TransformerFactory transformerFactory= TransformerFactory.newInstance();
////            Transformer xform = transformerFactory.newTransformer();
//////
////// that’s the default xform; use a stylesheet to get a real one
////            List myList = new ArrayList();
////
////            xform.transform(new DOMSource(doc), new StreamResult(myList.add()));
////        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return myList;
//
////        return url;
    }

}
