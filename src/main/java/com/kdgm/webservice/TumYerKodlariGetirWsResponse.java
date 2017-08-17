
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
 *         &lt;element name="TumYerKodlariGetirWsResult" type="{http://kaysis.gov.tr/}SonucResYerKod" minOccurs="0"/>
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
    "tumYerKodlariGetirWsResult"
})
@XmlRootElement(name = "TumYerKodlariGetirWsResponse")
public class TumYerKodlariGetirWsResponse {

    @XmlElement(name = "TumYerKodlariGetirWsResult")
    protected SonucResYerKod tumYerKodlariGetirWsResult;

    /**
     * Gets the value of the tumYerKodlariGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucResYerKod }
     *     
     */
    public SonucResYerKod getTumYerKodlariGetirWsResult() {
        return tumYerKodlariGetirWsResult;
    }

    /**
     * Sets the value of the tumYerKodlariGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucResYerKod }
     *     
     */
    public void setTumYerKodlariGetirWsResult(SonucResYerKod value) {
        this.tumYerKodlariGetirWsResult = value;
    }

}
