
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KurumBirimWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KurumBirimWS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="DETSISNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentIdareKimlikKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnaKurumIdareKimlikKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fk_BulunduguYerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fk_KurumBirimTipID1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fk_KurumBirimTipID2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KurumHiyerarsik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KurumBirimTip3ler" type="{http://kaysis.gov.tr/}ArrayOfKurumBirimTip3WS" minOccurs="0"/>
 *         &lt;element name="ParentIdareKimlikKodu2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FaalOlupOlmadigi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Seviye" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DisYazismaMuhatabiOlupOlmadigi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Adres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YerAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KurumBirimWS", propOrder = {
    "detsisNo",
    "ad",
    "parentIdareKimlikKodu",
    "anaKurumIdareKimlikKodu",
    "fkBulunduguYerID",
    "fkKurumBirimTipID1",
    "fkKurumBirimTipID2",
    "kurumHiyerarsik",
    "aktifmi",
    "kurumBirimTip3Ler",
    "parentIdareKimlikKodu2",
    "faalOlupOlmadigi",
    "seviye",
    "disYazismaMuhatabiOlupOlmadigi",
    "adres",
    "yerAdi"
})
public class KurumBirimWS
    extends TablesBase
{

    @XmlElement(name = "DETSISNo")
    protected int detsisNo;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "ParentIdareKimlikKodu")
    protected int parentIdareKimlikKodu;
    @XmlElement(name = "AnaKurumIdareKimlikKodu")
    protected int anaKurumIdareKimlikKodu;
    @XmlElement(name = "Fk_BulunduguYerID", required = true, type = Integer.class, nillable = true)
    protected Integer fkBulunduguYerID;
    @XmlElement(name = "Fk_KurumBirimTipID1")
    protected int fkKurumBirimTipID1;
    @XmlElement(name = "Fk_KurumBirimTipID2")
    protected int fkKurumBirimTipID2;
    @XmlElement(name = "KurumHiyerarsik")
    protected String kurumHiyerarsik;
    @XmlElement(name = "Aktifmi")
    protected String aktifmi;
    @XmlElement(name = "KurumBirimTip3ler")
    protected ArrayOfKurumBirimTip3WS kurumBirimTip3Ler;
    @XmlElement(name = "ParentIdareKimlikKodu2")
    protected int parentIdareKimlikKodu2;
    @XmlElement(name = "FaalOlupOlmadigi")
    protected boolean faalOlupOlmadigi;
    @XmlElement(name = "Seviye")
    protected int seviye;
    @XmlElement(name = "DisYazismaMuhatabiOlupOlmadigi")
    protected boolean disYazismaMuhatabiOlupOlmadigi;
    @XmlElement(name = "Adres")
    protected String adres;
    @XmlElement(name = "YerAdi")
    protected String yerAdi;

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
     * Gets the value of the fkBulunduguYerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFkBulunduguYerID() {
        return fkBulunduguYerID;
    }

    /**
     * Sets the value of the fkBulunduguYerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFkBulunduguYerID(Integer value) {
        this.fkBulunduguYerID = value;
    }

    /**
     * Gets the value of the fkKurumBirimTipID1 property.
     * 
     */
    public int getFkKurumBirimTipID1() {
        return fkKurumBirimTipID1;
    }

    /**
     * Sets the value of the fkKurumBirimTipID1 property.
     * 
     */
    public void setFkKurumBirimTipID1(int value) {
        this.fkKurumBirimTipID1 = value;
    }

    /**
     * Gets the value of the fkKurumBirimTipID2 property.
     * 
     */
    public int getFkKurumBirimTipID2() {
        return fkKurumBirimTipID2;
    }

    /**
     * Sets the value of the fkKurumBirimTipID2 property.
     * 
     */
    public void setFkKurumBirimTipID2(int value) {
        this.fkKurumBirimTipID2 = value;
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

    /**
     * Gets the value of the kurumBirimTip3Ler property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKurumBirimTip3WS }
     *     
     */
    public ArrayOfKurumBirimTip3WS getKurumBirimTip3Ler() {
        return kurumBirimTip3Ler;
    }

    /**
     * Sets the value of the kurumBirimTip3Ler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKurumBirimTip3WS }
     *     
     */
    public void setKurumBirimTip3Ler(ArrayOfKurumBirimTip3WS value) {
        this.kurumBirimTip3Ler = value;
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
     * Gets the value of the faalOlupOlmadigi property.
     * 
     */
    public boolean isFaalOlupOlmadigi() {
        return faalOlupOlmadigi;
    }

    /**
     * Sets the value of the faalOlupOlmadigi property.
     * 
     */
    public void setFaalOlupOlmadigi(boolean value) {
        this.faalOlupOlmadigi = value;
    }

    /**
     * Gets the value of the seviye property.
     * 
     */
    public int getSeviye() {
        return seviye;
    }

    /**
     * Sets the value of the seviye property.
     * 
     */
    public void setSeviye(int value) {
        this.seviye = value;
    }

    /**
     * Gets the value of the disYazismaMuhatabiOlupOlmadigi property.
     * 
     */
    public boolean isDisYazismaMuhatabiOlupOlmadigi() {
        return disYazismaMuhatabiOlupOlmadigi;
    }

    /**
     * Sets the value of the disYazismaMuhatabiOlupOlmadigi property.
     * 
     */
    public void setDisYazismaMuhatabiOlupOlmadigi(boolean value) {
        this.disYazismaMuhatabiOlupOlmadigi = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdres(String value) {
        this.adres = value;
    }

    /**
     * Gets the value of the yerAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYerAdi() {
        return yerAdi;
    }

    /**
     * Sets the value of the yerAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYerAdi(String value) {
        this.yerAdi = value;
    }

}
