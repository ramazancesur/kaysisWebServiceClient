
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
 *         &lt;element name="KurumSDPKodlariGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfKodlarWsObj" minOccurs="0"/>
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
    "kurumSDPKodlariGetirWsResult"
})
@XmlRootElement(name = "KurumSDPKodlariGetirWsResponse")
public class KurumSDPKodlariGetirWsResponse {

    @XmlElement(name = "KurumSDPKodlariGetirWsResult")
    protected SonuclarOOfKodlarWsObj kurumSDPKodlariGetirWsResult;

    /**
     * Gets the value of the kurumSDPKodlariGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfKodlarWsObj }
     *     
     */
    public SonuclarOOfKodlarWsObj getKurumSDPKodlariGetirWsResult() {
        return kurumSDPKodlariGetirWsResult;
    }

    /**
     * Sets the value of the kurumSDPKodlariGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfKodlarWsObj }
     *     
     */
    public void setKurumSDPKodlariGetirWsResult(SonuclarOOfKodlarWsObj value) {
        this.kurumSDPKodlariGetirWsResult = value;
    }

}
