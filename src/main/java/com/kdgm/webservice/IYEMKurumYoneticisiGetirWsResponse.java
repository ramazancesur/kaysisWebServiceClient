
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
 *         &lt;element name="IYEMKurumYoneticisiGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfIyemYoneticiObj" minOccurs="0"/>
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
    "iyemKurumYoneticisiGetirWsResult"
})
@XmlRootElement(name = "IYEMKurumYoneticisiGetirWsResponse")
public class IYEMKurumYoneticisiGetirWsResponse {

    @XmlElement(name = "IYEMKurumYoneticisiGetirWsResult")
    protected SonuclarOOfIyemYoneticiObj iyemKurumYoneticisiGetirWsResult;

    /**
     * Gets the value of the iyemKurumYoneticisiGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfIyemYoneticiObj }
     *     
     */
    public SonuclarOOfIyemYoneticiObj getIYEMKurumYoneticisiGetirWsResult() {
        return iyemKurumYoneticisiGetirWsResult;
    }

    /**
     * Sets the value of the iyemKurumYoneticisiGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfIyemYoneticiObj }
     *     
     */
    public void setIYEMKurumYoneticisiGetirWsResult(SonuclarOOfIyemYoneticiObj value) {
        this.iyemKurumYoneticisiGetirWsResult = value;
    }

}
