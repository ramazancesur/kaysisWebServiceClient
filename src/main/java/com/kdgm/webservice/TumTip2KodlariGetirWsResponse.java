
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
 *         &lt;element name="TumTip2KodlariGetirWsResult" type="{http://kaysis.gov.tr/}SonucResTip2" minOccurs="0"/>
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
    "tumTip2KodlariGetirWsResult"
})
@XmlRootElement(name = "TumTip2KodlariGetirWsResponse")
public class TumTip2KodlariGetirWsResponse {

    @XmlElement(name = "TumTip2KodlariGetirWsResult")
    protected SonucResTip2 tumTip2KodlariGetirWsResult;

    /**
     * Gets the value of the tumTip2KodlariGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucResTip2 }
     *     
     */
    public SonucResTip2 getTumTip2KodlariGetirWsResult() {
        return tumTip2KodlariGetirWsResult;
    }

    /**
     * Sets the value of the tumTip2KodlariGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucResTip2 }
     *     
     */
    public void setTumTip2KodlariGetirWsResult(SonucResTip2 value) {
        this.tumTip2KodlariGetirWsResult = value;
    }

}
