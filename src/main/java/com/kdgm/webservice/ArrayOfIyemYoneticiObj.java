
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIyemYoneticiObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIyemYoneticiObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IyemYoneticiObj" type="{http://kaysis.gov.tr/}IyemYoneticiObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIyemYoneticiObj", propOrder = {
    "iyemYoneticiObj"
})
public class ArrayOfIyemYoneticiObj {

    @XmlElement(name = "IyemYoneticiObj", nillable = true)
    protected List<IyemYoneticiObj> iyemYoneticiObj;

    /**
     * Gets the value of the iyemYoneticiObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iyemYoneticiObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIyemYoneticiObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IyemYoneticiObj }
     * 
     * 
     */
    public List<IyemYoneticiObj> getIyemYoneticiObj() {
        if (iyemYoneticiObj == null) {
            iyemYoneticiObj = new ArrayList<IyemYoneticiObj>();
        }
        return this.iyemYoneticiObj;
    }

}
