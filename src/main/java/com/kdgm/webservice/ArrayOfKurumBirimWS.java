
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKurumBirimWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKurumBirimWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KurumBirimWS" type="{http://kaysis.gov.tr/}KurumBirimWS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKurumBirimWS", propOrder = {
    "kurumBirimWS"
})
public class ArrayOfKurumBirimWS {

    @XmlElement(name = "KurumBirimWS", nillable = true)
    protected List<KurumBirimWS> kurumBirimWS;

    /**
     * Gets the value of the kurumBirimWS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kurumBirimWS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKurumBirimWS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KurumBirimWS }
     * 
     * 
     */
    public List<KurumBirimWS> getKurumBirimWS() {
        if (kurumBirimWS == null) {
            kurumBirimWS = new ArrayList<KurumBirimWS>();
        }
        return this.kurumBirimWS;
    }

}
