
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pGun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pAy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pYil" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pGun",
    "pAy",
    "pYil"
})
@XmlRootElement(name = "YeniDisYazismaYapanlariGetirWs")
public class YeniDisYazismaYapanlariGetirWs {

    protected int pGun;
    protected int pAy;
    protected int pYil;

    /**
     * Gets the value of the pGun property.
     * 
     */
    public int getPGun() {
        return pGun;
    }

    /**
     * Sets the value of the pGun property.
     * 
     */
    public void setPGun(int value) {
        this.pGun = value;
    }

    /**
     * Gets the value of the pAy property.
     * 
     */
    public int getPAy() {
        return pAy;
    }

    /**
     * Sets the value of the pAy property.
     * 
     */
    public void setPAy(int value) {
        this.pAy = value;
    }

    /**
     * Gets the value of the pYil property.
     * 
     */
    public int getPYil() {
        return pYil;
    }

    /**
     * Sets the value of the pYil property.
     * 
     */
    public void setPYil(int value) {
        this.pYil = value;
    }

}
