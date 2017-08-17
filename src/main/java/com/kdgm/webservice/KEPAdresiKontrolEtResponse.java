
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
 *         &lt;element name="KEPAdresiKontrolEtResult" type="{http://kaysis.gov.tr/}SonucOOfKepBilgileriWs" minOccurs="0"/>
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
    "kepAdresiKontrolEtResult"
})
@XmlRootElement(name = "KEPAdresiKontrolEtResponse")
public class KEPAdresiKontrolEtResponse {

    @XmlElement(name = "KEPAdresiKontrolEtResult")
    protected SonucOOfKepBilgileriWs kepAdresiKontrolEtResult;

    /**
     * Gets the value of the kepAdresiKontrolEtResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucOOfKepBilgileriWs }
     *     
     */
    public SonucOOfKepBilgileriWs getKEPAdresiKontrolEtResult() {
        return kepAdresiKontrolEtResult;
    }

    /**
     * Sets the value of the kepAdresiKontrolEtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucOOfKepBilgileriWs }
     *     
     */
    public void setKEPAdresiKontrolEtResult(SonucOOfKepBilgileriWs value) {
        this.kepAdresiKontrolEtResult = value;
    }

}
