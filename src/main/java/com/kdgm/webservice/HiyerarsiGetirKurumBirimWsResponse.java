
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
 *         &lt;element name="HiyerarsiGetirKurumBirimWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfKurumBirimWS" minOccurs="0"/>
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
    "hiyerarsiGetirKurumBirimWsResult"
})
@XmlRootElement(name = "HiyerarsiGetirKurumBirimWsResponse")
public class HiyerarsiGetirKurumBirimWsResponse {

    @XmlElement(name = "HiyerarsiGetirKurumBirimWsResult")
    protected SonuclarOOfKurumBirimWS hiyerarsiGetirKurumBirimWsResult;

    /**
     * Gets the value of the hiyerarsiGetirKurumBirimWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public SonuclarOOfKurumBirimWS getHiyerarsiGetirKurumBirimWsResult() {
        return hiyerarsiGetirKurumBirimWsResult;
    }

    /**
     * Sets the value of the hiyerarsiGetirKurumBirimWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public void setHiyerarsiGetirKurumBirimWsResult(SonuclarOOfKurumBirimWS value) {
        this.hiyerarsiGetirKurumBirimWsResult = value;
    }

}
