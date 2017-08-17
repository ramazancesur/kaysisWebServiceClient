
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
 *         &lt;element name="KendiTumBirimleriGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfKurumBirimWS" minOccurs="0"/>
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
    "kendiTumBirimleriGetirWsResult"
})
@XmlRootElement(name = "KendiTumBirimleriGetirWsResponse")
public class KendiTumBirimleriGetirWsResponse {

    @XmlElement(name = "KendiTumBirimleriGetirWsResult")
    protected SonuclarOOfKurumBirimWS kendiTumBirimleriGetirWsResult;

    /**
     * Gets the value of the kendiTumBirimleriGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public SonuclarOOfKurumBirimWS getKendiTumBirimleriGetirWsResult() {
        return kendiTumBirimleriGetirWsResult;
    }

    /**
     * Sets the value of the kendiTumBirimleriGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public void setKendiTumBirimleriGetirWsResult(SonuclarOOfKurumBirimWS value) {
        this.kendiTumBirimleriGetirWsResult = value;
    }

}
