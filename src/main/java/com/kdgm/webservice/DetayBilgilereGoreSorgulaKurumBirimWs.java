
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yerKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kategoriID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statuID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IlKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "yerKodu",
    "kategoriID",
    "statuID",
    "ilKodu"
})
@XmlRootElement(name = "DetayBilgilereGoreSorgulaKurumBirimWs")
public class DetayBilgilereGoreSorgulaKurumBirimWs {

    protected int yerKodu;
    protected int kategoriID;
    protected int statuID;
    @XmlElement(name = "IlKodu")
    protected int ilKodu;

    /**
     * Gets the value of the yerKodu property.
     * 
     */
    public int getYerKodu() {
        return yerKodu;
    }

    /**
     * Sets the value of the yerKodu property.
     * 
     */
    public void setYerKodu(int value) {
        this.yerKodu = value;
    }

    /**
     * Gets the value of the kategoriID property.
     * 
     */
    public int getKategoriID() {
        return kategoriID;
    }

    /**
     * Sets the value of the kategoriID property.
     * 
     */
    public void setKategoriID(int value) {
        this.kategoriID = value;
    }

    /**
     * Gets the value of the statuID property.
     * 
     */
    public int getStatuID() {
        return statuID;
    }

    /**
     * Sets the value of the statuID property.
     * 
     */
    public void setStatuID(int value) {
        this.statuID = value;
    }

    /**
     * Gets the value of the ilKodu property.
     * 
     */
    public int getIlKodu() {
        return ilKodu;
    }

    /**
     * Sets the value of the ilKodu property.
     * 
     */
    public void setIlKodu(int value) {
        this.ilKodu = value;
    }

}
