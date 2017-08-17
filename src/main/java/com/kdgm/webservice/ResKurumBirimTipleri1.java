
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResKurumBirimTipleri1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResKurumBirimTipleri1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KurumBirimTipi1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KurumBirimTipi1ParentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcilacakTip2ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KurumBirimTipi1CogulAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KayitTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResKurumBirimTipleri1", propOrder = {
    "id",
    "kurumBirimTipi1",
    "kurumBirimTipi1ParentID",
    "acilacakTip2ID",
    "kurumBirimTipi1CogulAdi",
    "kayitTarihi",
    "aktifmi"
})
public class ResKurumBirimTipleri1
    extends TablesBase
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "KurumBirimTipi1")
    protected String kurumBirimTipi1;
    @XmlElement(name = "KurumBirimTipi1ParentID")
    protected int kurumBirimTipi1ParentID;
    @XmlElement(name = "AcilacakTip2ID")
    protected int acilacakTip2ID;
    @XmlElement(name = "KurumBirimTipi1CogulAdi")
    protected String kurumBirimTipi1CogulAdi;
    @XmlElement(name = "KayitTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kayitTarihi;
    @XmlElement(name = "Aktifmi")
    protected boolean aktifmi;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the kurumBirimTipi1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumBirimTipi1() {
        return kurumBirimTipi1;
    }

    /**
     * Sets the value of the kurumBirimTipi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumBirimTipi1(String value) {
        this.kurumBirimTipi1 = value;
    }

    /**
     * Gets the value of the kurumBirimTipi1ParentID property.
     * 
     */
    public int getKurumBirimTipi1ParentID() {
        return kurumBirimTipi1ParentID;
    }

    /**
     * Sets the value of the kurumBirimTipi1ParentID property.
     * 
     */
    public void setKurumBirimTipi1ParentID(int value) {
        this.kurumBirimTipi1ParentID = value;
    }

    /**
     * Gets the value of the acilacakTip2ID property.
     * 
     */
    public int getAcilacakTip2ID() {
        return acilacakTip2ID;
    }

    /**
     * Sets the value of the acilacakTip2ID property.
     * 
     */
    public void setAcilacakTip2ID(int value) {
        this.acilacakTip2ID = value;
    }

    /**
     * Gets the value of the kurumBirimTipi1CogulAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumBirimTipi1CogulAdi() {
        return kurumBirimTipi1CogulAdi;
    }

    /**
     * Sets the value of the kurumBirimTipi1CogulAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumBirimTipi1CogulAdi(String value) {
        this.kurumBirimTipi1CogulAdi = value;
    }

    /**
     * Gets the value of the kayitTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKayitTarihi() {
        return kayitTarihi;
    }

    /**
     * Sets the value of the kayitTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKayitTarihi(XMLGregorianCalendar value) {
        this.kayitTarihi = value;
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

}
