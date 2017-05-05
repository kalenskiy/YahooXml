package YahooParse;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="results")
public class Results {
    private Rate[] rate;
    @XmlElement
    public void setRate(Rate[] rate) {
        this.rate = rate;
    }

    public Rate[] getRate() {
        return rate;
    }
}
