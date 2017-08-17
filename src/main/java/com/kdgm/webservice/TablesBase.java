
package com.kdgm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TablesBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TablesBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TablesBase")
@XmlSeeAlso({
    DetsisKullanici.class,
    KurumBirimWS.class,
    ResKurumBirimTipleri1 .class,
    ResKurumBirimTipleri2 .class,
    KurumBirimTip3WS.class,
    IletisimBilgileriWS.class,
    EYazismaMuhatapBilgileri.class,
    KodlarWsObj.class,
    ResYerKodlari.class,
    ImzaYetkilisi.class
})
public abstract class TablesBase {


}
