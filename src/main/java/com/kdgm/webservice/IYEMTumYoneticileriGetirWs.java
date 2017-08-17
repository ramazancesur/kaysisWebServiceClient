
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
 *         &lt;element name="KurumID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "kurumID"
})
@XmlRootElement(name = "IYEMTumYoneticileriGetirWs")
public class IYEMTumYoneticileriGetirWs {

    @XmlElement(name = "KurumID")
    protected int kurumID;

    /**
     * Gets the value of the kurumID property.
     * 
     */
    public int getKurumID() {
        return kurumID;
    }

    /**
     * Sets the value of the kurumID property.
     * 
     */
    public void setKurumID(int value) {
        this.kurumID = value;
    }

}
