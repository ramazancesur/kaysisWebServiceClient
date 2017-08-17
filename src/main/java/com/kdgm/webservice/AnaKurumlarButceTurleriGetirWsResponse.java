
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
 *         &lt;element name="AnaKurumlarButceTurleriGetirWsResult" type="{http://kaysis.gov.tr/}SonuclarOOfAnaKurumlarButceTurleri" minOccurs="0"/>
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
    "anaKurumlarButceTurleriGetirWsResult"
})
@XmlRootElement(name = "AnaKurumlarButceTurleriGetirWsResponse")
public class AnaKurumlarButceTurleriGetirWsResponse {

    @XmlElement(name = "AnaKurumlarButceTurleriGetirWsResult")
    protected SonuclarOOfAnaKurumlarButceTurleri anaKurumlarButceTurleriGetirWsResult;

    /**
     * Gets the value of the anaKurumlarButceTurleriGetirWsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonuclarOOfAnaKurumlarButceTurleri }
     *     
     */
    public SonuclarOOfAnaKurumlarButceTurleri getAnaKurumlarButceTurleriGetirWsResult() {
        return anaKurumlarButceTurleriGetirWsResult;
    }

    /**
     * Sets the value of the anaKurumlarButceTurleriGetirWsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonuclarOOfAnaKurumlarButceTurleri }
     *     
     */
    public void setAnaKurumlarButceTurleriGetirWsResult(SonuclarOOfAnaKurumlarButceTurleri value) {
        this.anaKurumlarButceTurleriGetirWsResult = value;
    }

}
