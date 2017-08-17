
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KurumBirimTip3WS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KurumBirimTip3WS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}TablesBase">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DETSISNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fk_KurumBirimTip3ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KurumBirimTip3WS", propOrder = {
    "id",
    "detsisNo",
    "fkKurumBirimTip3ID",
    "tipAdi"
})
public class KurumBirimTip3WS
    extends TablesBase
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DETSISNo")
    protected int detsisNo;
    @XmlElement(name = "Fk_KurumBirimTip3ID")
    protected int fkKurumBirimTip3ID;
    @XmlElement(name = "TipAdi")
    protected String tipAdi;

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
     * Gets the value of the fkKurumBirimTip3ID property.
     * 
     */
    public int getFkKurumBirimTip3ID() {
        return fkKurumBirimTip3ID;
    }

    /**
     * Sets the value of the fkKurumBirimTip3ID property.
     * 
     */
    public void setFkKurumBirimTip3ID(int value) {
        this.fkKurumBirimTip3ID = value;
    }

    /**
     * Gets the value of the tipAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipAdi() {
        return tipAdi;
    }

    /**
     * Sets the value of the tipAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipAdi(String value) {
        this.tipAdi = value;
    }

}
