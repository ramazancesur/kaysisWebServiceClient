
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResYerKodlari complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResYerKodlari">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IlKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YerAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YerKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IlAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fk_YerTipiID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Aktifmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TelefonAlanKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YerTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResYerKodlari", propOrder = {
    "id",
    "ilKodu",
    "yerAdi",
    "yerKodu",
    "ilAdi",
    "fkYerTipiID",
    "aktifmi",
    "telefonAlanKodu",
    "yerTipi"
})
public class ResYerKodlari
    extends TablesBase
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "IlKodu")
    protected int ilKodu;
    @XmlElement(name = "YerAdi")
    protected String yerAdi;
    @XmlElement(name = "YerKodu")
    protected int yerKodu;
    @XmlElement(name = "IlAdi")
    protected String ilAdi;
    @XmlElement(name = "Fk_YerTipiID")
    protected int fkYerTipiID;
    @XmlElement(name = "Aktifmi")
    protected boolean aktifmi;
    @XmlElement(name = "TelefonAlanKodu")
    protected String telefonAlanKodu;
    @XmlElement(name = "YerTipi")
    protected String yerTipi;

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
     * Gets the value of the ilKodu property.
     * 
     */
    public int getIlKodu() {
        return ilKodu;
    }

    /**
     * Sets the value of the ilKodu property.
     * 
     */
    public void setIlKodu(int value) {
        this.ilKodu = value;
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

    /**
     * Gets the value of the yerKodu property.
     * 
     */
    public int getYerKodu() {
        return yerKodu;
    }

    /**
     * Sets the value of the yerKodu property.
     * 
     */
    public void setYerKodu(int value) {
        this.yerKodu = value;
    }

    /**
     * Gets the value of the ilAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlAdi() {
        return ilAdi;
    }

    /**
     * Sets the value of the ilAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlAdi(String value) {
        this.ilAdi = value;
    }

    /**
     * Gets the value of the fkYerTipiID property.
     * 
     */
    public int getFkYerTipiID() {
        return fkYerTipiID;
    }

    /**
     * Sets the value of the fkYerTipiID property.
     * 
     */
    public void setFkYerTipiID(int value) {
        this.fkYerTipiID = value;
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
     * Gets the value of the telefonAlanKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonAlanKodu() {
        return telefonAlanKodu;
    }

    /**
     * Sets the value of the telefonAlanKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonAlanKodu(String value) {
        this.telefonAlanKodu = value;
    }

    /**
     * Gets the value of the yerTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYerTipi() {
        return yerTipi;
    }

    /**
     * Sets the value of the yerTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYerTipi(String value) {
        this.yerTipi = value;
    }

}
