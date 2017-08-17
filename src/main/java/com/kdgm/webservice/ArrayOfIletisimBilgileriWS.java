
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIletisimBilgileriWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIletisimBilgileriWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IletisimBilgileriWS" type="{http://kaysis.gov.tr/}IletisimBilgileriWS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIletisimBilgileriWS", propOrder = {
    "iletisimBilgileriWS"
})
public class ArrayOfIletisimBilgileriWS {

    @XmlElement(name = "IletisimBilgileriWS", nillable = true)
    protected List<IletisimBilgileriWS> iletisimBilgileriWS;

    /**
     * Gets the value of the iletisimBilgileriWS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iletisimBilgileriWS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIletisimBilgileriWS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IletisimBilgileriWS }
     * 
     * 
     */
    public List<IletisimBilgileriWS> getIletisimBilgileriWS() {
        if (iletisimBilgileriWS == null) {
            iletisimBilgileriWS = new ArrayList<IletisimBilgileriWS>();
        }
        return this.iletisimBilgileriWS;
    }

}
