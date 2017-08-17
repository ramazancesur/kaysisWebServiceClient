
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEyazismaImzaYetkilisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEyazismaImzaYetkilisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EyazismaImzaYetkilisi" type="{http://kaysis.gov.tr/}EyazismaImzaYetkilisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEyazismaImzaYetkilisi", propOrder = {
    "eyazismaImzaYetkilisi"
})
public class ArrayOfEyazismaImzaYetkilisi {

    @XmlElement(name = "EyazismaImzaYetkilisi", nillable = true)
    protected List<EyazismaImzaYetkilisi> eyazismaImzaYetkilisi;

    /**
     * Gets the value of the eyazismaImzaYetkilisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eyazismaImzaYetkilisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEyazismaImzaYetkilisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EyazismaImzaYetkilisi }
     * 
     * 
     */
    public List<EyazismaImzaYetkilisi> getEyazismaImzaYetkilisi() {
        if (eyazismaImzaYetkilisi == null) {
            eyazismaImzaYetkilisi = new ArrayList<EyazismaImzaYetkilisi>();
        }
        return this.eyazismaImzaYetkilisi;
    }

}
