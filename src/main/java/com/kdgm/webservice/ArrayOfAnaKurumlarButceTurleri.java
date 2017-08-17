
package com.kdgm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAnaKurumlarButceTurleri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAnaKurumlarButceTurleri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnaKurumlarButceTurleri" type="{http://kaysis.gov.tr/}AnaKurumlarButceTurleri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnaKurumlarButceTurleri", propOrder = {
    "anaKurumlarButceTurleri"
})
public class ArrayOfAnaKurumlarButceTurleri {

    @XmlElement(name = "AnaKurumlarButceTurleri", nillable = true)
    protected List<AnaKurumlarButceTurleri> anaKurumlarButceTurleri;

    /**
     * Gets the value of the anaKurumlarButceTurleri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anaKurumlarButceTurleri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnaKurumlarButceTurleri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnaKurumlarButceTurleri }
     * 
     * 
     */
    public List<AnaKurumlarButceTurleri> getAnaKurumlarButceTurleri() {
        if (anaKurumlarButceTurleri == null) {
            anaKurumlarButceTurleri = new ArrayList<AnaKurumlarButceTurleri>();
        }
        return this.anaKurumlarButceTurleri;
    }

}
