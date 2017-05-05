package YahooParse;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rate")
public class Rate {
    private String id;
    private String name;
    private double rate;
    private String date;
    private String time;
    private String ask;
    private String bid;

    public String getId() {
        return id;
    }
    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }
    @XmlElement(name="Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @XmlElement(name="Rate")
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    @XmlElement(name="Date")
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
    @XmlElement(name="Time")
    public void setTime(String time) {
        this.time = time;
    }

    public String getAsk() {
        return ask;
    }
    @XmlElement(name="Ask")
    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getBid() {
        return bid;
    }
    @XmlElement(name="Bid")
    public void setBid(String bid) {
        this.bid = bid;
    }

}
