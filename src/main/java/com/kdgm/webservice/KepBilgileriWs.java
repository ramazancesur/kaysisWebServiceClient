
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KepBilgileriWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KepBilgileriWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KurumDetsisNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KepAdresi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Durum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KepBilgileriWs", propOrder = {
    "kurumDetsisNo",
    "kepAdresi",
    "aktifmi",
    "durum"
})
public class KepBilgileriWs {

    @XmlElement(name = "KurumDetsisNo")
    protected int kurumDetsisNo;
    @XmlElement(name = "KepAdresi")
    protected String kepAdresi;
    @XmlElement(name = "Aktifmi")
    protected boolean aktifmi;
    @XmlElement(name = "Durum")
    protected String durum;

    /**
     * Gets the value of the kurumDetsisNo property.
     * 
     */
    public int getKurumDetsisNo() {
        return kurumDetsisNo;
    }

    /**
     * Sets the value of the kurumDetsisNo property.
     * 
     */
    public void setKurumDetsisNo(int value) {
        this.kurumDetsisNo = value;
    }

    /**
     * Gets the value of the kepAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKepAdresi() {
        return kepAdresi;
    }

    /**
     * Sets the value of the kepAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKepAdresi(String value) {
        this.kepAdresi = value;
    }

    /**
     * Gets the value of the aktifmi property.
     * 
     */
    public boolean isAktifmi() {
        return aktifmi;
    }

    /**
     * Sets the value of the aktifmi property.
     * 
     */
    public void setAktifmi(boolean value) {
        this.aktifmi = value;
    }

    /**
     * Gets the value of the durum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurum() {
        return durum;
    }

    /**
     * Sets the value of the durum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurum(String value) {
        this.durum = value;
    }

}
