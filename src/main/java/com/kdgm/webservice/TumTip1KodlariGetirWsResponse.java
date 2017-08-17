
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
 *         &lt;element name="TumTip1KodlariGetirWsResult" type="{http://kaysis.gov.tr/}SonucResTip1" minOccurs="0"/>
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
    "tumTip1KodlariGetirWsResult"
})
@XmlRootElement(name = "TumTip1KodlariGetirWsResponse")
public class TumTip1KodlariGetirWsResponse {

    @XmlElement(name = "TumTip1KodlariGetirWsResult")
    protected SonucResTip1 tumTip1KodlariGetirWsResult;

    /**
     * Gets the value of the tumTip1KodlariGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucResTip1 }
     *     
     */
    public SonucResTip1 getTumTip1KodlariGetirWsResult() {
        return tumTip1KodlariGetirWsResult;
    }

    /**
     * Sets the value of the tumTip1KodlariGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucResTip1 }
     *     
     */
    public void setTumTip1KodlariGetirWsResult(SonucResTip1 value) {
        this.tumTip1KodlariGetirWsResult = value;
    }

}
