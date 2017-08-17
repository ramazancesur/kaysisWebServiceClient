
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
 *         &lt;element name="KurumBirimIletisimBilgileriGetirWsResult" type="{http://kaysis.gov.tr/}SonucIletisimBilgileri" minOccurs="0"/>
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
    "kurumBirimIletisimBilgileriGetirWsResult"
})
@XmlRootElement(name = "KurumBirimIletisimBilgileriGetirWsResponse")
public class KurumBirimIletisimBilgileriGetirWsResponse {

    @XmlElement(name = "KurumBirimIletisimBilgileriGetirWsResult")
    protected SonucIletisimBilgileri kurumBirimIletisimBilgileriGetirWsResult;

    /**
     * Gets the value of the kurumBirimIletisimBilgileriGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucIletisimBilgileri }
     *     
     */
    public SonucIletisimBilgileri getKurumBirimIletisimBilgileriGetirWsResult() {
        return kurumBirimIletisimBilgileriGetirWsResult;
    }

    /**
     * Sets the value of the kurumBirimIletisimBilgileriGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucIletisimBilgileri }
     *     
     */
    public void setKurumBirimIletisimBilgileriGetirWsResult(SonucIletisimBilgileri value) {
        this.kurumBirimIletisimBilgileriGetirWsResult = value;
    }

}
