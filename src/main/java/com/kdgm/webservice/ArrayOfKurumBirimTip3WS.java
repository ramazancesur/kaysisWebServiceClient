
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKurumBirimTip3WS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKurumBirimTip3WS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KurumBirimTip3WS" type="{http://kaysis.gov.tr/}KurumBirimTip3WS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKurumBirimTip3WS", propOrder = {
    "kurumBirimTip3WS"
})
public class ArrayOfKurumBirimTip3WS {

    @XmlElement(name = "KurumBirimTip3WS", nillable = true)
    protected List<KurumBirimTip3WS> kurumBirimTip3WS;

    /**
     * Gets the value of the kurumBirimTip3WS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kurumBirimTip3WS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKurumBirimTip3WS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KurumBirimTip3WS }
     * 
     * 
     */
    public List<KurumBirimTip3WS> getKurumBirimTip3WS() {
        if (kurumBirimTip3WS == null) {
            kurumBirimTip3WS = new ArrayList<KurumBirimTip3WS>();
        }
        return this.kurumBirimTip3WS;
    }

}
