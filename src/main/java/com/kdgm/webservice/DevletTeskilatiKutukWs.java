
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevletTeskilatiKutukWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevletTeskilatiKutukWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DETSISNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevletTeskilatiKutukNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnaKurumDetsisNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KurumHiyerarsik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevletTeskilatiKutukWs", propOrder = {
    "detsisNo",
    "ad",
    "devletTeskilatiKutukNo",
    "anaKurumDetsisNo",
    "kurumHiyerarsik",
    "aktifmi"
})
public class DevletTeskilatiKutukWs {

    @XmlElement(name = "DETSISNo")
    protected int detsisNo;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "DevletTeskilatiKutukNo")
    protected String devletTeskilatiKutukNo;
    @XmlElement(name = "AnaKurumDetsisNo")
    protected int anaKurumDetsisNo;
    @XmlElement(name = "KurumHiyerarsik")
    protected String kurumHiyerarsik;
    @XmlElement(name = "Aktifmi")
    protected String aktifmi;

    /**
     * Gets the value of the detsisNo property.
     * 
     */
    public int getDETSISNo() {
        return detsisNo;
    }

    /**
     * Sets the value of the detsisNo property.
     * 
     */
    public void setDETSISNo(int value) {
        this.detsisNo = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the devletTeskilatiKutukNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevletTeskilatiKutukNo() {
        return devletTeskilatiKutukNo;
    }

    /**
     * Sets the value of the devletTeskilatiKutukNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevletTeskilatiKutukNo(String value) {
        this.devletTeskilatiKutukNo = value;
    }

    /**
     * Gets the value of the anaKurumDetsisNo property.
     * 
     */
    public int getAnaKurumDetsisNo() {
        return anaKurumDetsisNo;
    }

    /**
     * Sets the value of the anaKurumDetsisNo property.
     * 
     */
    public void setAnaKurumDetsisNo(int value) {
        this.anaKurumDetsisNo = value;
    }

    /**
     * Gets the value of the kurumHiyerarsik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumHiyerarsik() {
        return kurumHiyerarsik;
    }

    /**
     * Sets the value of the kurumHiyerarsik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumHiyerarsik(String value) {
        this.kurumHiyerarsik = value;
    }

    /**
     * Gets the value of the aktifmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktifmi() {
        return aktifmi;
    }

    /**
     * Sets the value of the aktifmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktifmi(String value) {
        this.aktifmi = value;
    }

}
