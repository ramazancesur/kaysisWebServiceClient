
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
 *         &lt;element name="ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anaKurumIdareKimlikKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ad",
    "anaKurumIdareKimlikKodu"
})
@XmlRootElement(name = "AdaGoreKurumBirimSorgulaWs")
public class AdaGoreKurumBirimSorgulaWs {

    protected String ad;
    protected int anaKurumIdareKimlikKodu;

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the anaKurumIdareKimlikKodu property.
     * 
     */
    public int getAnaKurumIdareKimlikKodu() {
        return anaKurumIdareKimlikKodu;
    }

    /**
     * Sets the value of the anaKurumIdareKimlikKodu property.
     * 
     */
    public void setAnaKurumIdareKimlikKodu(int value) {
        this.anaKurumIdareKimlikKodu = value;
    }

}
