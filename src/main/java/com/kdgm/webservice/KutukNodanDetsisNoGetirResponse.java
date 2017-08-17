
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
 *         &lt;element name="KutukNodanDetsisNoGetirResult" type="{http://kaysis.gov.tr/}SonuclarOOfDevletTeskilatiKutukWs" minOccurs="0"/>
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
    "kutukNodanDetsisNoGetirResult"
})
@XmlRootElement(name = "KutukNodanDetsisNoGetirResponse")
public class KutukNodanDetsisNoGetirResponse {

    @XmlElement(name = "KutukNodanDetsisNoGetirResult")
    protected SonuclarOOfDevletTeskilatiKutukWs kutukNodanDetsisNoGetirResult;

    /**
     * Gets the value of the kutukNodanDetsisNoGetirResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfDevletTeskilatiKutukWs }
     *     
     */
    public SonuclarOOfDevletTeskilatiKutukWs getKutukNodanDetsisNoGetirResult() {
        return kutukNodanDetsisNoGetirResult;
    }

    /**
     * Sets the value of the kutukNodanDetsisNoGetirResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfDevletTeskilatiKutukWs }
     *     
     */
    public void setKutukNodanDetsisNoGetirResult(SonuclarOOfDevletTeskilatiKutukWs value) {
        this.kutukNodanDetsisNoGetirResult = value;
    }

}
