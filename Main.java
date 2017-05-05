package YahooParse;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";
        try {
            readXml(request);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
    public static void readXml(String urlStr) throws JAXBException, MalformedURLException {
        URL url = new URL(urlStr);
        JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Query query = (Query)unmarshaller.unmarshal(url);
        System.out.println(query.getResults().getRate()[0].getName() + " - " + query.getResults().getRate()[0].getRate());
        System.out.println(query.getResults().getRate()[1].getName() + " - " + query.getResults().getRate()[1].getRate());

    }

}
