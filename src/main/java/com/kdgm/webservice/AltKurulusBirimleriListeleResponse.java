
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
 *         &lt;element name="AltKurulusBirimleriListeleResult" type="{http://kaysis.gov.tr/}SonuclarOOfKurumBirimWS" minOccurs="0"/>
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
    "altKurulusBirimleriListeleResult"
})
@XmlRootElement(name = "AltKurulusBirimleriListeleResponse")
public class AltKurulusBirimleriListeleResponse {

    @XmlElement(name = "AltKurulusBirimleriListeleResult")
    protected SonuclarOOfKurumBirimWS altKurulusBirimleriListeleResult;

    /**
     * Gets the value of the altKurulusBirimleriListeleResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public SonuclarOOfKurumBirimWS getAltKurulusBirimleriListeleResult() {
        return altKurulusBirimleriListeleResult;
    }

    /**
     * Sets the value of the altKurulusBirimleriListeleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public void setAltKurulusBirimleriListeleResult(SonuclarOOfKurumBirimWS value) {
        this.altKurulusBirimleriListeleResult = value;
    }

}
