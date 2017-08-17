
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResKurumBirimTipleri1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResKurumBirimTipleri1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResKurumBirimTipleri1" type="{http://kaysis.gov.tr/}ResKurumBirimTipleri1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResKurumBirimTipleri1", propOrder = {
    "resKurumBirimTipleri1"
})
public class ArrayOfResKurumBirimTipleri1 {

    @XmlElement(name = "ResKurumBirimTipleri1", nillable = true)
    protected List<ResKurumBirimTipleri1> resKurumBirimTipleri1;

    /**
     * Gets the value of the resKurumBirimTipleri1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resKurumBirimTipleri1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResKurumBirimTipleri1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResKurumBirimTipleri1 }
     * 
     * 
     */
    public List<ResKurumBirimTipleri1> getResKurumBirimTipleri1() {
        if (resKurumBirimTipleri1 == null) {
            resKurumBirimTipleri1 = new ArrayList<ResKurumBirimTipleri1>();
        }
        return this.resKurumBirimTipleri1;
    }

}
