
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
 *         &lt;element name="IYEMYoneticiIDdenGorevListesiGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfIyemYoneticiObj" minOccurs="0"/>
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
    "iyemYoneticiIDdenGorevListesiGetirWsResult"
})
@XmlRootElement(name = "IYEMYoneticiIDdenGorevListesiGetirWsResponse")
public class IYEMYoneticiIDdenGorevListesiGetirWsResponse {

    @XmlElement(name = "IYEMYoneticiIDdenGorevListesiGetirWsResult")
    protected SonuclarOOfIyemYoneticiObj iyemYoneticiIDdenGorevListesiGetirWsResult;

    /**
     * Gets the value of the iyemYoneticiIDdenGorevListesiGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfIyemYoneticiObj }
     *     
     */
    public SonuclarOOfIyemYoneticiObj getIYEMYoneticiIDdenGorevListesiGetirWsResult() {
        return iyemYoneticiIDdenGorevListesiGetirWsResult;
    }

    /**
     * Sets the value of the iyemYoneticiIDdenGorevListesiGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfIyemYoneticiObj }
     *     
     */
    public void setIYEMYoneticiIDdenGorevListesiGetirWsResult(SonuclarOOfIyemYoneticiObj value) {
        this.iyemYoneticiIDdenGorevListesiGetirWsResult = value;
    }

}
