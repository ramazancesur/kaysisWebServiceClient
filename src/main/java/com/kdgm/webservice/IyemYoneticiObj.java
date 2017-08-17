
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IyemYoneticiObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IyemYoneticiObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KurumHiyerarsik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentIdareKimlikKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnvanAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YoneticiKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YoneticiAdiSoyadi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DogumTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Yasi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YasGrup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HukukiDayanak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GorevTuru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GorevBaslamaTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GorevBitisTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IyemYoneticiObj", propOrder = {
    "id",
    "ad",
    "kurumHiyerarsik",
    "parentIdareKimlikKodu",
    "unvanAdi",
    "yoneticiKodu",
    "yoneticiAdiSoyadi",
    "dogumTarihi",
    "yasi",
    "yasGrup",
    "hukukiDayanak",
    "gorevTuru",
    "gorevBaslamaTarihi",
    "gorevBitisTarihi",
    "aktifmi"
})
public class IyemYoneticiObj {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "KurumHiyerarsik")
    protected String kurumHiyerarsik;
    @XmlElement(name = "ParentIdareKimlikKodu")
    protected String parentIdareKimlikKodu;
    @XmlElement(name = "UnvanAdi")
    protected String unvanAdi;
    @XmlElement(name = "YoneticiKodu")
    protected int yoneticiKodu;
    @XmlElement(name = "YoneticiAdiSoyadi")
    protected String yoneticiAdiSoyadi;
    @XmlElement(name = "DogumTarihi", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dogumTarihi;
    @XmlElement(name = "Yasi")
    protected int yasi;
    @XmlElement(name = "YasGrup")
    protected String yasGrup;
    @XmlElement(name = "HukukiDayanak")
    protected String hukukiDayanak;
    @XmlElement(name = "GorevTuru")
    protected String gorevTuru;
    @XmlElement(name = "GorevBaslamaTarihi", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gorevBaslamaTarihi;
    @XmlElement(name = "GorevBitisTarihi", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gorevBitisTarihi;
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
     * Gets the value of the parentIdareKimlikKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIdareKimlikKodu() {
        return parentIdareKimlikKodu;
    }

    /**
     * Sets the value of the parentIdareKimlikKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIdareKimlikKodu(String value) {
        this.parentIdareKimlikKodu = value;
    }

    /**
     * Gets the value of the unvanAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnvanAdi() {
        return unvanAdi;
    }

    /**
     * Sets the value of the unvanAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnvanAdi(String value) {
        this.unvanAdi = value;
    }

    /**
     * Gets the value of the yoneticiKodu property.
     * 
     */
    public int getYoneticiKodu() {
        return yoneticiKodu;
    }

    /**
     * Sets the value of the yoneticiKodu property.
     * 
     */
    public void setYoneticiKodu(int value) {
        this.yoneticiKodu = value;
    }

    /**
     * Gets the value of the yoneticiAdiSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoneticiAdiSoyadi() {
        return yoneticiAdiSoyadi;
    }

    /**
     * Sets the value of the yoneticiAdiSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoneticiAdiSoyadi(String value) {
        this.yoneticiAdiSoyadi = value;
    }

    /**
     * Gets the value of the dogumTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * Sets the value of the dogumTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDogumTarihi(XMLGregorianCalendar value) {
        this.dogumTarihi = value;
    }

    /**
     * Gets the value of the yasi property.
     * 
     */
    public int getYasi() {
        return yasi;
    }

    /**
     * Sets the value of the yasi property.
     * 
     */
    public void setYasi(int value) {
        this.yasi = value;
    }

    /**
     * Gets the value of the yasGrup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYasGrup() {
        return yasGrup;
    }

    /**
     * Sets the value of the yasGrup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYasGrup(String value) {
        this.yasGrup = value;
    }

    /**
     * Gets the value of the hukukiDayanak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHukukiDayanak() {
        return hukukiDayanak;
    }

    /**
     * Sets the value of the hukukiDayanak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHukukiDayanak(String value) {
        this.hukukiDayanak = value;
    }

    /**
     * Gets the value of the gorevTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGorevTuru() {
        return gorevTuru;
    }

    /**
     * Sets the value of the gorevTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGorevTuru(String value) {
        this.gorevTuru = value;
    }

    /**
     * Gets the value of the gorevBaslamaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGorevBaslamaTarihi() {
        return gorevBaslamaTarihi;
    }

    /**
     * Sets the value of the gorevBaslamaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGorevBaslamaTarihi(XMLGregorianCalendar value) {
        this.gorevBaslamaTarihi = value;
    }

    /**
     * Gets the value of the gorevBitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGorevBitisTarihi() {
        return gorevBitisTarihi;
    }

    /**
     * Sets the value of the gorevBitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGorevBitisTarihi(XMLGregorianCalendar value) {
        this.gorevBitisTarihi = value;
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
