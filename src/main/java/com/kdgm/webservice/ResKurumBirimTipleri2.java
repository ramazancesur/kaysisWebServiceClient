
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResKurumBirimTipleri2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResKurumBirimTipleri2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KurumBirimTipi2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KurumBirimTipi2ParentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KurumBirimTipi2CogulAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResmiYaziEklenecekMuhatapBolumu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResmiYaziKesilecekMuhatapBolumu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KayitTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Used" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ResKurumBirimTipleri2", propOrder = {
    "id",
    "kurumBirimTipi2",
    "kurumBirimTipi2ParentID",
    "kurumBirimTipi2CogulAdi",
    "resmiYaziEklenecekMuhatapBolumu",
    "resmiYaziKesilecekMuhatapBolumu",
    "kayitTarihi",
    "used",
    "aktifmi"
})
public class ResKurumBirimTipleri2
    extends TablesBase
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "KurumBirimTipi2")
    protected String kurumBirimTipi2;
    @XmlElement(name = "KurumBirimTipi2ParentID")
    protected int kurumBirimTipi2ParentID;
    @XmlElement(name = "KurumBirimTipi2CogulAdi")
    protected String kurumBirimTipi2CogulAdi;
    @XmlElement(name = "ResmiYaziEklenecekMuhatapBolumu")
    protected String resmiYaziEklenecekMuhatapBolumu;
    @XmlElement(name = "ResmiYaziKesilecekMuhatapBolumu")
    protected String resmiYaziKesilecekMuhatapBolumu;
    @XmlElement(name = "KayitTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kayitTarihi;
    @XmlElement(name = "Used")
    protected boolean used;
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
     * Gets the value of the kurumBirimTipi2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumBirimTipi2() {
        return kurumBirimTipi2;
    }

    /**
     * Sets the value of the kurumBirimTipi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumBirimTipi2(String value) {
        this.kurumBirimTipi2 = value;
    }

    /**
     * Gets the value of the kurumBirimTipi2ParentID property.
     * 
     */
    public int getKurumBirimTipi2ParentID() {
        return kurumBirimTipi2ParentID;
    }

    /**
     * Sets the value of the kurumBirimTipi2ParentID property.
     * 
     */
    public void setKurumBirimTipi2ParentID(int value) {
        this.kurumBirimTipi2ParentID = value;
    }

    /**
     * Gets the value of the kurumBirimTipi2CogulAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumBirimTipi2CogulAdi() {
        return kurumBirimTipi2CogulAdi;
    }

    /**
     * Sets the value of the kurumBirimTipi2CogulAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumBirimTipi2CogulAdi(String value) {
        this.kurumBirimTipi2CogulAdi = value;
    }

    /**
     * Gets the value of the resmiYaziEklenecekMuhatapBolumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResmiYaziEklenecekMuhatapBolumu() {
        return resmiYaziEklenecekMuhatapBolumu;
    }

    /**
     * Sets the value of the resmiYaziEklenecekMuhatapBolumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResmiYaziEklenecekMuhatapBolumu(String value) {
        this.resmiYaziEklenecekMuhatapBolumu = value;
    }

    /**
     * Gets the value of the resmiYaziKesilecekMuhatapBolumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResmiYaziKesilecekMuhatapBolumu() {
        return resmiYaziKesilecekMuhatapBolumu;
    }

    /**
     * Sets the value of the resmiYaziKesilecekMuhatapBolumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResmiYaziKesilecekMuhatapBolumu(String value) {
        this.resmiYaziKesilecekMuhatapBolumu = value;
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
     * Gets the value of the used property.
     * 
     */
    public boolean isUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     */
    public void setUsed(boolean value) {
        this.used = value;
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
