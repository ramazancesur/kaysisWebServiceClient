
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="detsisId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "detsisId"
})
@XmlRootElement(name = "KurumBirimIletisimBilgileriGetirWs")
public class KurumBirimIletisimBilgileriGetirWs {

    protected int detsisId;

    /**
     * Gets the value of the detsisId property.
     * 
     */
    public int getDetsisId() {
        return detsisId;
    }

    /**
     * Sets the value of the detsisId property.
     * 
     */
    public void setDetsisId(int value) {
        this.detsisId = value;
    }

}
