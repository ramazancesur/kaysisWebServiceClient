
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IletisimBilgileriWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IletisimBilgileriWS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="DetsisNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Iletisim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IletisimTip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IletisimAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IletisimBilgileriWS", propOrder = {
    "detsisNo",
    "iletisim",
    "iletisimTip",
    "iletisimAdi"
})
public class IletisimBilgileriWS
    extends TablesBase
{

    @XmlElement(name = "DetsisNo")
    protected int detsisNo;
    @XmlElement(name = "Iletisim")
    protected String iletisim;
    @XmlElement(name = "IletisimTip")
    protected int iletisimTip;
    @XmlElement(name = "IletisimAdi")
    protected String iletisimAdi;

    /**
     * Gets the value of the detsisNo property.
     * 
     */
    public int getDetsisNo() {
        return detsisNo;
    }

    /**
     * Sets the value of the detsisNo property.
     * 
     */
    public void setDetsisNo(int value) {
        this.detsisNo = value;
    }

    /**
     * Gets the value of the iletisim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIletisim() {
        return iletisim;
    }

    /**
     * Sets the value of the iletisim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIletisim(String value) {
        this.iletisim = value;
    }

    /**
     * Gets the value of the iletisimTip property.
     * 
     */
    public int getIletisimTip() {
        return iletisimTip;
    }

    /**
     * Sets the value of the iletisimTip property.
     * 
     */
    public void setIletisimTip(int value) {
        this.iletisimTip = value;
    }

    /**
     * Gets the value of the iletisimAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIletisimAdi() {
        return iletisimAdi;
    }

    /**
     * Sets the value of the iletisimAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIletisimAdi(String value) {
        this.iletisimAdi = value;
    }

}
