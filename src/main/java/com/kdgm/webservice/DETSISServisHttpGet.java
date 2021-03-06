
package com.kdgm.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DETSISServisHttpGet", targetNamespace = "http://kaysis.gov.tr/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DETSISServisHttpGet {


    /**
     * Verilen Tarih bilgisi ile �u ana kadar D�� yaz��ma yapabilen kurumlarda yap�lan g�ncellemeleri getiren metotdur,Detayli Kullanim icin Lutfen Teknik rehbere basvurunuz
     * 
     * @param pGun
     * @param pYil
     * @param pAy
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "YeniDisYazismaYapanlariGetirWs")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS yeniDisYazismaYapanlariGetirWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pGun")
        String pGun,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pAy")
        String pAy,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "pYil")
        String pYil);

    /**
     * Kurumlarin Kullandigi Tum Tip1 Kod tanimlarini Getiren Metot
     * 
     * @return
     *     returns com.kdgm.webservice.SonucResTip1
     */
    @WebMethod(operationName = "TumTip1KodlariGetirWs")
    @WebResult(name = "SonucResTip1", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucResTip1 tumTip1KodlariGetirWs();

    /**
     * Kurumlarin Kullandigi Tum Tip2 Kod tanimlarini Getiren Metot
     * 
     * @return
     *     returns com.kdgm.webservice.SonucResTip2
     */
    @WebMethod(operationName = "TumTip2KodlariGetirWs")
    @WebResult(name = "SonucResTip2", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucResTip2 tumTip2KodlariGetirWs();

    /**
     * Kurumlarin Kullandigi Tum Yerkodlarin  tanimlarini Getiren Metot
     * 
     * @return
     *     returns com.kdgm.webservice.SonucResYerKod
     */
    @WebMethod(operationName = "TumYerKodlariGetirWs")
    @WebResult(name = "SonucResYerKod", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucResYerKod tumYerKodlariGetirWs();

    /**
     * Verilen Kurumun Iletisim Bilgisini Getiren Metot
     * 
     * @param detsisId
     * @return
     *     returns com.kdgm.webservice.SonucIletisimBilgileri
     */
    @WebMethod(operationName = "KurumBirimIletisimBilgileriGetirWs")
    @WebResult(name = "SonucIletisimBilgileri", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucIletisimBilgileri kurumBirimIletisimBilgileriGetirWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "detsisId")
        String detsisId);

    /**
     * Ana kurumlarin Iletisim Bilgilerini Getiren Metot
     * 
     * @return
     *     returns com.kdgm.webservice.SonucIletisimBilgileri
     */
    @WebMethod(operationName = "AnakurumIletisimBilgileriWs")
    @WebResult(name = "SonucIletisimBilgileri", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucIletisimBilgileri anakurumIletisimBilgileriWs();

    /**
     * Ana Kurumlarin Butce Turleri.
     * 
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfAnaKurumlarButceTurleri
     */
    @WebMethod(operationName = "AnaKurumlarButceTurleriGetirWs")
    @WebResult(name = "SonuclarOOfAnaKurumlarButceTurleri", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfAnaKurumlarButceTurleri anaKurumlarButceTurleriGetirWs();

    /**
     * Anakurumkodu ile Standart Dosya Plan� Kodlar�n� getiren metotdur.
     * 
     * @param idariKimlikKodu
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKodlarWsObj
     */
    @WebMethod(operationName = "KurumSDPKodlariGetirWs")
    @WebResult(name = "SonuclarOOfKodlarWsObj", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKodlarWsObj kurumSDPKodlariGetirWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IdariKimlikKodu")
        String idariKimlikKodu);

    /**
     * DETSISNo ile Kurum/Birim bilgileri sorgulayan metotdur.
     * 
     * @param detsisNo
     * @return
     *     returns com.kdgm.webservice.SonucO
     */
    @WebMethod(operationName = "DETSISNoKurumBirimWs")
    @WebResult(name = "SonucO", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucO detsisNoKurumBirimWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "DETSISNo")
        String detsisNo);

    /**
     * G�nderilen DETSISNo paremetresine ba�l� alt birimleri getiren metotdur.
     * 
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "KendiTumBirimleriGetirWs")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS kendiTumBirimleriGetirWs();

    /**
     * Verilen DETSISNona ba�l� Ana Kurumuna kadar olan b�t�n �st birimleri getiren metotdur.
     * 
     * @param detsisNo
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "HiyerarsiGetirKurumBirimWs")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS hiyerarsiGetirKurumBirimWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "DETSISNo")
        String detsisNo);

    /**
     * Verilen AnaDETSISNo ya ba�l� verilen Ada uygun Kurum/Birim listesi d�nen metotdur.
     * 
     * @param ad
     * @param anaKurumIdareKimlikKodu
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "AdaGoreKurumBirimSorgulaWs")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS adaGoreKurumBirimSorgulaWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ad")
        String ad,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "anaKurumIdareKimlikKodu")
        String anaKurumIdareKimlikKodu);

    /**
     * Ana kurumlar�n listesini d�nen metotdur.
     * 
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "AnaKurumlariGetirKurumBirimWs")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS anaKurumlariGetirKurumBirimWs();

    /**
     * Yer Kodu, Tip 1 ve Tip 2 ye g�re kurum listesi d�nen metotdur.
     * 
     * @param statuID
     * @param kategoriID
     * @param ilKodu
     * @param yerKodu
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "DetayBilgilereGoreSorgulaKurumBirimWs")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS detayBilgilereGoreSorgulaKurumBirimWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "yerKodu")
        String yerKodu,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "kategoriID")
        String kategoriID,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "statuID")
        String statuID,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IlKodu")
        String ilKodu);

    /**
     * KEP Adresi kontrol�n�n�n yap�ld��� metotdur.
     * 
     * @param kepAdresi
     * @return
     *     returns com.kdgm.webservice.SonucOOfKepBilgileriWs
     */
    @WebMethod(operationName = "KEPAdresiKontrolEt")
    @WebResult(name = "SonucOOfKepBilgileriWs", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonucOOfKepBilgileriWs kepAdresiKontrolEt(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "KepAdresi")
        String kepAdresi);

    /**
     * Aktif olan t�m KEP Adreslerinin listesini veren metotdur.
     * 
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKepBilgileriWs
     */
    @WebMethod(operationName = "AktifKEPAdresleriniGetir")
    @WebResult(name = "SonuclarOOfKepBilgileriWs", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKepBilgileriWs aktifKEPAdresleriniGetir();

    /**
     * 
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfDetsisKullanici
     */
    @WebMethod(operationName = "DetsisIslemYetkilisiBilgileriWs")
    @WebResult(name = "SonuclarOOfDetsisKullanici", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfDetsisKullanici detsisIslemYetkilisiBilgileriWs();

    /**
     * 
     * @param arananKurum
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfKurumBirimWS
     */
    @WebMethod(operationName = "AltKurulusBirimleriListele")
    @WebResult(name = "SonuclarOOfKurumBirimWS", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfKurumBirimWS altKurulusBirimleriListele(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "arananKurum")
        String arananKurum);

    /**
     * 
     * @param tcKimlikNo
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfIyemYoneticiObj
     */
    @WebMethod(operationName = "IYEMTCdenGorevListesiGetirWs")
    @WebResult(name = "SonuclarOOfIyemYoneticiObj", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfIyemYoneticiObj iyemtCdenGorevListesiGetirWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "TCKimlikNo")
        String tcKimlikNo);

    /**
     * 
     * @param yoneticiID
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfIyemYoneticiObj
     */
    @WebMethod(operationName = "IYEMYoneticiIDdenGorevListesiGetirWs")
    @WebResult(name = "SonuclarOOfIyemYoneticiObj", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfIyemYoneticiObj iyemYoneticiIDdenGorevListesiGetirWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "YoneticiID")
        String yoneticiID);

    /**
     * 
     * @param kurumID
     * @return
     *     returns com.kdgm.webservice.SonuclarOOfIyemYoneticiObj
     */
    @WebMethod(operationName = "IYEMTumYoneticileriGetirWs")
    @WebResult(name = "SonuclarOOfIyemYoneticiObj", targetNamespace = "http://kaysis.gov.tr/", partName = "Body")
    public SonuclarOOfIyemYoneticiObj iyemTumYoneticileriGetirWs(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "KurumID")
        String kurumID);

}
