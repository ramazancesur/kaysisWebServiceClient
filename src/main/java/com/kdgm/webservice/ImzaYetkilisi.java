
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImzaYetkilisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImzaYetkilisi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="TCYoneticiKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YoneticiAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YoneticiSoyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImzaYetkilisi", propOrder = {
    "tcYoneticiKodu",
    "yoneticiAd",
    "yoneticiSoyad"
})
@XmlSeeAlso({
    EyazismaImzaYetkilisi.class
})
public class ImzaYetkilisi
    extends TablesBase
{

    @XmlElement(name = "TCYoneticiKodu")
    protected int tcYoneticiKodu;
    @XmlElement(name = "YoneticiAd")
    protected String yoneticiAd;
    @XmlElement(name = "YoneticiSoyad")
    protected String yoneticiSoyad;

    /**
     * Gets the value of the tcYoneticiKodu property.
     * 
     */
    public int getTCYoneticiKodu() {
        return tcYoneticiKodu;
    }

    /**
     * Sets the value of the tcYoneticiKodu property.
     * 
     */
    public void setTCYoneticiKodu(int value) {
        this.tcYoneticiKodu = value;
    }

    /**
     * Gets the value of the yoneticiAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoneticiAd() {
        return yoneticiAd;
    }

    /**
     * Sets the value of the yoneticiAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoneticiAd(String value) {
        this.yoneticiAd = value;
    }

    /**
     * Gets the value of the yoneticiSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoneticiSoyad() {
        return yoneticiSoyad;
    }

    /**
     * Sets the value of the yoneticiSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoneticiSoyad(String value) {
        this.yoneticiSoyad = value;
    }

}
