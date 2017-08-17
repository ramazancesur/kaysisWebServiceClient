
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
 *         &lt;element name="AnaKurumlariGetirKurumBirimWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfKurumBirimWS" minOccurs="0"/>
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
    "anaKurumlariGetirKurumBirimWsResult"
})
@XmlRootElement(name = "AnaKurumlariGetirKurumBirimWsResponse")
public class AnaKurumlariGetirKurumBirimWsResponse {

    @XmlElement(name = "AnaKurumlariGetirKurumBirimWsResult")
    protected SonuclarOOfKurumBirimWS anaKurumlariGetirKurumBirimWsResult;

    /**
     * Gets the value of the anaKurumlariGetirKurumBirimWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public SonuclarOOfKurumBirimWS getAnaKurumlariGetirKurumBirimWsResult() {
        return anaKurumlariGetirKurumBirimWsResult;
    }

    /**
     * Sets the value of the anaKurumlariGetirKurumBirimWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfKurumBirimWS }
     *     
     */
    public void setAnaKurumlariGetirKurumBirimWsResult(SonuclarOOfKurumBirimWS value) {
        this.anaKurumlariGetirKurumBirimWsResult = value;
    }

}
