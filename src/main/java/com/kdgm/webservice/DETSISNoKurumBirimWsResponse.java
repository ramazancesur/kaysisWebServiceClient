
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
 *         &lt;element name="DETSISNoKurumBirimWsResult" type="{http://kaysis.gov.tr/}SonucO" minOccurs="0"/>
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
    "detsisNoKurumBirimWsResult"
})
@XmlRootElement(name = "DETSISNoKurumBirimWsResponse")
public class DETSISNoKurumBirimWsResponse {

    @XmlElement(name = "DETSISNoKurumBirimWsResult")
    protected SonucO detsisNoKurumBirimWsResult;

    /**
     * Gets the value of the detsisNoKurumBirimWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucO }
     *     
     */
    public SonucO getDETSISNoKurumBirimWsResult() {
        return detsisNoKurumBirimWsResult;
    }

    /**
     * Sets the value of the detsisNoKurumBirimWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucO }
     *     
     */
    public void setDETSISNoKurumBirimWsResult(SonucO value) {
        this.detsisNoKurumBirimWsResult = value;
    }

}
