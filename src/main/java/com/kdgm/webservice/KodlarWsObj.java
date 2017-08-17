
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KodlarWsObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KodlarWsObj">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnaKod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltKod1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltKod2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltKod3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KonuAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaklamaSuresi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaklamaZaman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaklamaKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DipNot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Tip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GrupBaslangici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrupBitisi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seviye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KodlarWsObj", propOrder = {
    "id",
    "anaKod",
    "altKod1",
    "altKod2",
    "altKod3",
    "konuAdi",
    "saklamaSuresi",
    "saklamaZaman",
    "saklamaKodu",
    "dipNot",
    "aciklama",
    "aktifmi",
    "tip",
    "grupBaslangici",
    "grupBitisi",
    "kod",
    "seviye"
})
public class KodlarWsObj
    extends TablesBase
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "AnaKod")
    protected String anaKod;
    @XmlElement(name = "AltKod1")
    protected String altKod1;
    @XmlElement(name = "AltKod2")
    protected String altKod2;
    @XmlElement(name = "AltKod3")
    protected String altKod3;
    @XmlElement(name = "KonuAdi")
    protected String konuAdi;
    @XmlElement(name = "SaklamaSuresi")
    protected String saklamaSuresi;
    @XmlElement(name = "SaklamaZaman")
    protected String saklamaZaman;
    @XmlElement(name = "SaklamaKodu")
    protected String saklamaKodu;
    @XmlElement(name = "DipNot")
    protected String dipNot;
    @XmlElement(name = "Aciklama")
    protected String aciklama;
    @XmlElement(name = "Aktifmi")
    protected boolean aktifmi;
    @XmlElement(name = "Tip")
    protected boolean tip;
    @XmlElement(name = "GrupBaslangici")
    protected String grupBaslangici;
    @XmlElement(name = "GrupBitisi")
    protected String grupBitisi;
    @XmlElement(name = "Kod")
    protected String kod;
    @XmlElement(name = "Seviye")
    protected String seviye;

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
     * Gets the value of the anaKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnaKod() {
        return anaKod;
    }

    /**
     * Sets the value of the anaKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnaKod(String value) {
        this.anaKod = value;
    }

    /**
     * Gets the value of the altKod1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltKod1() {
        return altKod1;
    }

    /**
     * Sets the value of the altKod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltKod1(String value) {
        this.altKod1 = value;
    }

    /**
     * Gets the value of the altKod2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltKod2() {
        return altKod2;
    }

    /**
     * Sets the value of the altKod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltKod2(String value) {
        this.altKod2 = value;
    }

    /**
     * Gets the value of the altKod3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltKod3() {
        return altKod3;
    }

    /**
     * Sets the value of the altKod3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltKod3(String value) {
        this.altKod3 = value;
    }

    /**
     * Gets the value of the konuAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonuAdi() {
        return konuAdi;
    }

    /**
     * Sets the value of the konuAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonuAdi(String value) {
        this.konuAdi = value;
    }

    /**
     * Gets the value of the saklamaSuresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaklamaSuresi() {
        return saklamaSuresi;
    }

    /**
     * Sets the value of the saklamaSuresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaklamaSuresi(String value) {
        this.saklamaSuresi = value;
    }

    /**
     * Gets the value of the saklamaZaman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaklamaZaman() {
        return saklamaZaman;
    }

    /**
     * Sets the value of the saklamaZaman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaklamaZaman(String value) {
        this.saklamaZaman = value;
    }

    /**
     * Gets the value of the saklamaKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaklamaKodu() {
        return saklamaKodu;
    }

    /**
     * Sets the value of the saklamaKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaklamaKodu(String value) {
        this.saklamaKodu = value;
    }

    /**
     * Gets the value of the dipNot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDipNot() {
        return dipNot;
    }

    /**
     * Sets the value of the dipNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDipNot(String value) {
        this.dipNot = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
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
     * Gets the value of the tip property.
     * 
     */
    public boolean isTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     */
    public void setTip(boolean value) {
        this.tip = value;
    }

    /**
     * Gets the value of the grupBaslangici property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupBaslangici() {
        return grupBaslangici;
    }

    /**
     * Sets the value of the grupBaslangici property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupBaslangici(String value) {
        this.grupBaslangici = value;
    }

    /**
     * Gets the value of the grupBitisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupBitisi() {
        return grupBitisi;
    }

    /**
     * Sets the value of the grupBitisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupBitisi(String value) {
        this.grupBitisi = value;
    }

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the seviye property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeviye() {
        return seviye;
    }

    /**
     * Sets the value of the seviye property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeviye(String value) {
        this.seviye = value;
    }

}
