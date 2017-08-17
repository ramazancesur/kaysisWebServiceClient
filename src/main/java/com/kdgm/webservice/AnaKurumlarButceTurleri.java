
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnaKurumlarButceTurleri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnaKurumlarButceTurleri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DETSISNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentIdareKimlikKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnaKurumIdareKimlikKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParentIdareKimlikKodu2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ButceTuruID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ButceTuru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fk_TuzelKisilikID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TuzelKisilik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnaKurumlarButceTurleri", propOrder = {
    "detsisNo",
    "ad",
    "parentIdareKimlikKodu",
    "anaKurumIdareKimlikKodu",
    "parentIdareKimlikKodu2",
    "butceTuruID",
    "butceTuru",
    "fkTuzelKisilikID",
    "tuzelKisilik"
})
public class AnaKurumlarButceTurleri {

    @XmlElement(name = "DETSISNo")
    protected int detsisNo;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "ParentIdareKimlikKodu")
    protected int parentIdareKimlikKodu;
    @XmlElement(name = "AnaKurumIdareKimlikKodu")
    protected int anaKurumIdareKimlikKodu;
    @XmlElement(name = "ParentIdareKimlikKodu2")
    protected int parentIdareKimlikKodu2;
    @XmlElement(name = "ButceTuruID")
    protected int butceTuruID;
    @XmlElement(name = "ButceTuru")
    protected String butceTuru;
    @XmlElement(name = "Fk_TuzelKisilikID")
    protected int fkTuzelKisilikID;
    @XmlElement(name = "TuzelKisilik")
    protected String tuzelKisilik;

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
     * Gets the value of the parentIdareKimlikKodu property.
     * 
     */
    public int getParentIdareKimlikKodu() {
        return parentIdareKimlikKodu;
    }

    /**
     * Sets the value of the parentIdareKimlikKodu property.
     * 
     */
    public void setParentIdareKimlikKodu(int value) {
        this.parentIdareKimlikKodu = value;
    }

    /**
     * Gets the value of the anaKurumIdareKimlikKodu property.
     * 
     */
    public int getAnaKurumIdareKimlikKodu() {
        return anaKurumIdareKimlikKodu;
    }

    /**
     * Sets the value of the anaKurumIdareKimlikKodu property.
     * 
     */
    public void setAnaKurumIdareKimlikKodu(int value) {
        this.anaKurumIdareKimlikKodu = value;
    }

    /**
     * Gets the value of the parentIdareKimlikKodu2 property.
     * 
     */
    public int getParentIdareKimlikKodu2() {
        return parentIdareKimlikKodu2;
    }

    /**
     * Sets the value of the parentIdareKimlikKodu2 property.
     * 
     */
    public void setParentIdareKimlikKodu2(int value) {
        this.parentIdareKimlikKodu2 = value;
    }

    /**
     * Gets the value of the butceTuruID property.
     * 
     */
    public int getButceTuruID() {
        return butceTuruID;
    }

    /**
     * Sets the value of the butceTuruID property.
     * 
     */
    public void setButceTuruID(int value) {
        this.butceTuruID = value;
    }

    /**
     * Gets the value of the butceTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButceTuru() {
        return butceTuru;
    }

    /**
     * Sets the value of the butceTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButceTuru(String value) {
        this.butceTuru = value;
    }

    /**
     * Gets the value of the fkTuzelKisilikID property.
     * 
     */
    public int getFkTuzelKisilikID() {
        return fkTuzelKisilikID;
    }

    /**
     * Sets the value of the fkTuzelKisilikID property.
     * 
     */
    public void setFkTuzelKisilikID(int value) {
        this.fkTuzelKisilikID = value;
    }

    /**
     * Gets the value of the tuzelKisilik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuzelKisilik() {
        return tuzelKisilik;
    }

    /**
     * Sets the value of the tuzelKisilik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuzelKisilik(String value) {
        this.tuzelKisilik = value;
    }

}
