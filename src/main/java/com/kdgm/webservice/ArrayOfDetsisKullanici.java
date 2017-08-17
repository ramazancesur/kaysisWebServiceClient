
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDetsisKullanici complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDetsisKullanici">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetsisKullanici" type="{http://kaysis.gov.tr/}DetsisKullanici" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDetsisKullanici", propOrder = {
    "detsisKullanici"
})
public class ArrayOfDetsisKullanici {

    @XmlElement(name = "DetsisKullanici", nillable = true)
    protected List<DetsisKullanici> detsisKullanici;

    /**
     * Gets the value of the detsisKullanici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detsisKullanici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetsisKullanici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetsisKullanici }
     * 
     * 
     */
    public List<DetsisKullanici> getDetsisKullanici() {
        if (detsisKullanici == null) {
            detsisKullanici = new ArrayList<DetsisKullanici>();
        }
        return this.detsisKullanici;
    }

}
