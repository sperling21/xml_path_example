import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;


public class Main {


    public static void main(String... args) throws XPathExpressionException {

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        NodeList nodeList = (NodeList) xPath.evaluate("//contractItem[serviceId>=3]/contractItemId",
                // Note: The data.xml file is located in resource folder
                new InputSource(Main.class.getResourceAsStream("data.xml")), XPathConstants.NODESET);

        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getTextContent());
        }


    }

}
