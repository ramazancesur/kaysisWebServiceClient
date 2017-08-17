
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
 *         &lt;element name="IYEMTumYoneticileriGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfIyemYoneticiObj" minOccurs="0"/>
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
    "iyemTumYoneticileriGetirWsResult"
})
@XmlRootElement(name = "IYEMTumYoneticileriGetirWsResponse")
public class IYEMTumYoneticileriGetirWsResponse {

    @XmlElement(name = "IYEMTumYoneticileriGetirWsResult")
    protected SonuclarOOfIyemYoneticiObj iyemTumYoneticileriGetirWsResult;

    /**
     * Gets the value of the iyemTumYoneticileriGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfIyemYoneticiObj }
     *     
     */
    public SonuclarOOfIyemYoneticiObj getIYEMTumYoneticileriGetirWsResult() {
        return iyemTumYoneticileriGetirWsResult;
    }

    /**
     * Sets the value of the iyemTumYoneticileriGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfIyemYoneticiObj }
     *     
     */
    public void setIYEMTumYoneticileriGetirWsResult(SonuclarOOfIyemYoneticiObj value) {
        this.iyemTumYoneticileriGetirWsResult = value;
    }

}
