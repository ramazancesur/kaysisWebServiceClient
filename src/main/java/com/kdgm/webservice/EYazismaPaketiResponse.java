
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="eYazismaPaketiResult" type="{http://kaysis.gov.tr/}SonucOOfeYazismaPaketi" minOccurs="0"/>
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
    "eYazismaPaketiResult"
})
@XmlRootElement(name = "eYazismaPaketiResponse")
public class EYazismaPaketiResponse {

    protected SonucOOfeYazismaPaketi eYazismaPaketiResult;

    /**
     * Gets the value of the eYazismaPaketiResult property.
     * 
     * @return
     *     possible object is
     *     {@link SonucOOfeYazismaPaketi }
     *     
     */
    public SonucOOfeYazismaPaketi getEYazismaPaketiResult() {
        return eYazismaPaketiResult;
    }

    /**
     * Sets the value of the eYazismaPaketiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonucOOfeYazismaPaketi }
     *     
     */
    public void setEYazismaPaketiResult(SonucOOfeYazismaPaketi value) {
        this.eYazismaPaketiResult = value;
    }

}
