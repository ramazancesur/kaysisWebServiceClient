
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
 *         &lt;element name="YeniDisYazismaYapanlariGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfKurumBirimWS" minOccurs="0"/>
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
    "yeniDisYazismaYapanlariGetirWsResult"
})
@XmlRootElement(name = "YeniDisYazismaYapanlariGetirWsResponse")
public class YeniDisYazismaYapanlariGetirWsResponse {

    @XmlElement(name = "YeniDisYazismaYapanlariGetirWsResult")
    protected SonuclarOOfKurumBirimWS yeniDisYazismaYapanlariGetirWsResult;

    /**
     * Gets the value of the yeniDisYazismaYapanlariGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public SonuclarOOfKurumBirimWS getYeniDisYazismaYapanlariGetirWsResult() {
        return yeniDisYazismaYapanlariGetirWsResult;
    }

    /**
     * Sets the value of the yeniDisYazismaYapanlariGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public void setYeniDisYazismaYapanlariGetirWsResult(SonuclarOOfKurumBirimWS value) {
        this.yeniDisYazismaYapanlariGetirWsResult = value;
    }

}
