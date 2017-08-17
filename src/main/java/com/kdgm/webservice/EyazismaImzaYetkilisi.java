
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EyazismaImzaYetkilisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EyazismaImzaYetkilisi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kaysis.gov.tr/}ImzaYetkilisi">
 *       &lt;sequence>
 *         &lt;element name="VekaletTuru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unvan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetsisNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EyazismaImzaYetkilisi", propOrder = {
    "vekaletTuru",
    "unvan",
    "detsisNo"
})
public class EyazismaImzaYetkilisi
    extends ImzaYetkilisi
{

    @XmlElement(name = "VekaletTuru")
    protected String vekaletTuru;
    @XmlElement(name = "Unvan")
    protected String unvan;
    @XmlElement(name = "DetsisNo")
    protected int detsisNo;

    /**
     * Gets the value of the vekaletTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVekaletTuru() {
        return vekaletTuru;
    }

    /**
     * Sets the value of the vekaletTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVekaletTuru(String value) {
        this.vekaletTuru = value;
    }

    /**
     * Gets the value of the unvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnvan() {
        return unvan;
    }

    /**
     * Sets the value of the unvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnvan(String value) {
        this.unvan = value;
    }

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

}
