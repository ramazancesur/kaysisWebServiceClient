
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKodlarWsObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKodlarWsObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KodlarWsObj" type="{http://kaysis.gov.tr/}KodlarWsObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKodlarWsObj", propOrder = {
    "kodlarWsObj"
})
public class ArrayOfKodlarWsObj {

    @XmlElement(name = "KodlarWsObj", nillable = true)
    protected List<KodlarWsObj> kodlarWsObj;

    /**
     * Gets the value of the kodlarWsObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kodlarWsObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKodlarWsObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KodlarWsObj }
     * 
     * 
     */
    public List<KodlarWsObj> getKodlarWsObj() {
        if (kodlarWsObj == null) {
            kodlarWsObj = new ArrayList<KodlarWsObj>();
        }
        return this.kodlarWsObj;
    }

}
