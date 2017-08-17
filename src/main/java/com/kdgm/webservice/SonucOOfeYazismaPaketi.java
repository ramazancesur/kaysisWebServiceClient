
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SonucOOfeYazismaPaketi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SonucOOfeYazismaPaketi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SonucHatali" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HataMsj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SonucOOfeYazismaPaketi", propOrder = {
    "sonucHatali",
    "hataMsj"
})
public class SonucOOfeYazismaPaketi {

    @XmlElement(name = "SonucHatali")
    protected boolean sonucHatali;
    @XmlElement(name = "HataMsj")
    protected String hataMsj;

    /**
     * Gets the value of the sonucHatali property.
     * 
     */
    public boolean isSonucHatali() {
        return sonucHatali;
    }

    /**
     * Sets the value of the sonucHatali property.
     * 
     */
    public void setSonucHatali(boolean value) {
        this.sonucHatali = value;
    }

    /**
     * Gets the value of the hataMsj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHataMsj() {
        return hataMsj;
    }

    /**
     * Sets the value of the hataMsj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHataMsj(String value) {
        this.hataMsj = value;
    }

}
