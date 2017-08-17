
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eYazismaMuhatapBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eYazismaMuhatapBilgileri">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="MuhatapKepAdresi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MuhatapKepTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MuhatapSifrelemeSertifikasi" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="KurumID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MuhatapAdresi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MuhatapAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eYazismaMuhatapBilgileri", propOrder = {
    "muhatapKepAdresi",
    "muhatapKepTipi",
    "muhatapSifrelemeSertifikasi",
    "kurumID",
    "muhatapAdresi",
    "muhatapAd"
})
public class EYazismaMuhatapBilgileri
    extends TablesBase
{

    @XmlElement(name = "MuhatapKepAdresi")
    protected String muhatapKepAdresi;
    @XmlElement(name = "MuhatapKepTipi")
    protected String muhatapKepTipi;
    @XmlElement(name = "MuhatapSifrelemeSertifikasi")
    protected byte[] muhatapSifrelemeSertifikasi;
    @XmlElement(name = "KurumID")
    protected int kurumID;
    @XmlElement(name = "MuhatapAdresi")
    protected String muhatapAdresi;
    @XmlElement(name = "MuhatapAd")
    protected String muhatapAd;

    /**
     * Gets the value of the muhatapKepAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuhatapKepAdresi() {
        return muhatapKepAdresi;
    }

    /**
     * Sets the value of the muhatapKepAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuhatapKepAdresi(String value) {
        this.muhatapKepAdresi = value;
    }

    /**
     * Gets the value of the muhatapKepTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuhatapKepTipi() {
        return muhatapKepTipi;
    }

    /**
     * Sets the value of the muhatapKepTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuhatapKepTipi(String value) {
        this.muhatapKepTipi = value;
    }

    /**
     * Gets the value of the muhatapSifrelemeSertifikasi property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMuhatapSifrelemeSertifikasi() {
        return muhatapSifrelemeSertifikasi;
    }

    /**
     * Sets the value of the muhatapSifrelemeSertifikasi property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMuhatapSifrelemeSertifikasi(byte[] value) {
        this.muhatapSifrelemeSertifikasi = value;
    }

    /**
     * Gets the value of the kurumID property.
     * 
     */
    public int getKurumID() {
        return kurumID;
    }

    /**
     * Sets the value of the kurumID property.
     * 
     */
    public void setKurumID(int value) {
        this.kurumID = value;
    }

    /**
     * Gets the value of the muhatapAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuhatapAdresi() {
        return muhatapAdresi;
    }

    /**
     * Sets the value of the muhatapAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuhatapAdresi(String value) {
        this.muhatapAdresi = value;
    }

    /**
     * Gets the value of the muhatapAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuhatapAd() {
        return muhatapAd;
    }

    /**
     * Sets the value of the muhatapAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuhatapAd(String value) {
        this.muhatapAd = value;
    }

}
