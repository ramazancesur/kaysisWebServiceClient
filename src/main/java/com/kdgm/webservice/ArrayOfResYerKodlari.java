
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResYerKodlari complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResYerKodlari">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResYerKodlari" type="{http://kaysis.gov.tr/}ResYerKodlari" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResYerKodlari", propOrder = {
    "resYerKodlari"
})
public class ArrayOfResYerKodlari {

    @XmlElement(name = "ResYerKodlari", nillable = true)
    protected List<ResYerKodlari> resYerKodlari;

    /**
     * Gets the value of the resYerKodlari property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resYerKodlari property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResYerKodlari().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResYerKodlari }
     * 
     * 
     */
    public List<ResYerKodlari> getResYerKodlari() {
        if (resYerKodlari == null) {
            resYerKodlari = new ArrayList<ResYerKodlari>();
        }
        return this.resYerKodlari;
    }

}
