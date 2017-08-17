
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gonderenDetsisID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="muhatapDetsisIDs" type="{http://kaysis.gov.tr/}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gonderenDetsisID",
    "muhatapDetsisIDs"
})
@XmlRootElement(name = "eYazismaPaketi")
public class EYazismaPaketi {

    protected int gonderenDetsisID;
    protected ArrayOfInt muhatapDetsisIDs;

    /**
     * Gets the value of the gonderenDetsisID property.
     * 
     */
    public int getGonderenDetsisID() {
        return gonderenDetsisID;
    }

    /**
     * Sets the value of the gonderenDetsisID property.
     * 
     */
    public void setGonderenDetsisID(int value) {
        this.gonderenDetsisID = value;
    }

    /**
     * Gets the value of the muhatapDetsisIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMuhatapDetsisIDs() {
        return muhatapDetsisIDs;
    }

    /**
     * Sets the value of the muhatapDetsisIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMuhatapDetsisIDs(ArrayOfInt value) {
        this.muhatapDetsisIDs = value;
    }

}
