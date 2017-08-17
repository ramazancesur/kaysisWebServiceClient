
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResKurumBirimTipleri2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResKurumBirimTipleri2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResKurumBirimTipleri2" type="{http://kaysis.gov.tr/}ResKurumBirimTipleri2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResKurumBirimTipleri2", propOrder = {
    "resKurumBirimTipleri2"
})
public class ArrayOfResKurumBirimTipleri2 {

    @XmlElement(name = "ResKurumBirimTipleri2", nillable = true)
    protected List<ResKurumBirimTipleri2> resKurumBirimTipleri2;

    /**
     * Gets the value of the resKurumBirimTipleri2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resKurumBirimTipleri2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResKurumBirimTipleri2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResKurumBirimTipleri2 }
     * 
     * 
     */
    public List<ResKurumBirimTipleri2> getResKurumBirimTipleri2() {
        if (resKurumBirimTipleri2 == null) {
            resKurumBirimTipleri2 = new ArrayList<ResKurumBirimTipleri2>();
        }
        return this.resKurumBirimTipleri2;
    }

}
