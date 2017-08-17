
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YoneticiID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "yoneticiID"
})
@XmlRootElement(name = "IYEMYoneticiIDdenGorevListesiGetirWs")
public class IYEMYoneticiIDdenGorevListesiGetirWs {

    @XmlElement(name = "YoneticiID")
    protected int yoneticiID;

    /**
     * Gets the value of the yoneticiID property.
     * 
     */
    public int getYoneticiID() {
        return yoneticiID;
    }

    /**
     * Sets the value of the yoneticiID property.
     * 
     */
    public void setYoneticiID(int value) {
        this.yoneticiID = value;
    }

}
