<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://kaysis.gov.tr/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://kaysis.gov.tr/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://kaysis.gov.tr/">
      <s:element name="YeniDisYazismaYapanlariGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pGun" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pAy" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pYil" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="YeniDisYazismaYapanlariGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="YeniDisYazismaYapanlariGetirWsResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfKurumBirimWS">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfKurumBirimWS" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfKurumBirimWS">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="KurumBirimWS" nillable="true" type="tns:KurumBirimWS" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="KurumBirimWS">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="DETSISNo" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Ad" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="ParentIdareKimlikKodu" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AnaKurumIdareKimlikKodu" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fk_BulunduguYerID" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fk_KurumBirimTipID1" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fk_KurumBirimTipID2" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="KurumHiyerarsik" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Aktifmi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="KurumBirimTip3ler" type="tns:ArrayOfKurumBirimTip3WS" />
              <s:element minOccurs="1" maxOccurs="1" name="ParentIdareKimlikKodu2" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="FaalOlupOlmadigi" type="s:boolean" />
              <s:element minOccurs="1" maxOccurs="1" name="Seviye" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="DisYazismaMuhatabiOlupOlmadigi" type="s:boolean" />
              <s:element minOccurs="0" maxOccurs="1" name="Adres" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="YerAdi" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="TablesBase" abstract="true" />
      <s:complexType name="KurumBirimTip3WS">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="DETSISNo" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fk_KurumBirimTip3ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="TipAdi" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfKurumBirimTip3WS">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="KurumBirimTip3WS" nillable="true" type="tns:KurumBirimTip3WS" />
        </s:sequence>
      </s:complexType>
      <s:element name="BbServiceAuthentication" type="tns:BbServiceAuthentication" />
      <s:complexType name="BbServiceAuthentication">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="KurumID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
        </s:sequence>
        <s:anyAttribute />
      </s:complexType>
      <s:element name="TumTip1KodlariGetirWs">
        <s:complexType />
      </s:element>
      <s:element name="TumTip1KodlariGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TumTip1KodlariGetirWsResult" type="tns:SonucResTip1" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucResTip1">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfResKurumBirimTipleri1" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfResKurumBirimTipleri1">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ResKurumBirimTipleri1" nillable="true" type="tns:ResKurumBirimTipleri1" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ResKurumBirimTipleri1">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="KurumBirimTipi1" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="KurumBirimTipi1ParentID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AcilacakTip2ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="KurumBirimTipi1CogulAdi" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="KayitTarihi" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Aktifmi" type="s:boolean" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="TumTip2KodlariGetirWs">
        <s:complexType />
      </s:element>
      <s:element name="TumTip2KodlariGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TumTip2KodlariGetirWsResult" type="tns:SonucResTip2" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucResTip2">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfResKurumBirimTipleri2" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfResKurumBirimTipleri2">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ResKurumBirimTipleri2" nillable="true" type="tns:ResKurumBirimTipleri2" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ResKurumBirimTipleri2">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="KurumBirimTipi2" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="KurumBirimTipi2ParentID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="KurumBirimTipi2CogulAdi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ResmiYaziEklenecekMuhatapBolumu" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ResmiYaziKesilecekMuhatapBolumu" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="KayitTarihi" type="s:dateTime" />
              <s:element minOccurs="1" maxOccurs="1" name="Used" type="s:boolean" />
              <s:element minOccurs="1" maxOccurs="1" name="Aktifmi" type="s:boolean" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="TumYerKodlariGetirWs">
        <s:complexType />
      </s:element>
      <s:element name="TumYerKodlariGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TumYerKodlariGetirWsResult" type="tns:SonucResYerKod" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucResYerKod">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfResYerKodlari" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfResYerKodlari">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ResYerKodlari" nillable="true" type="tns:ResYerKodlari" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ResYerKodlari">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="IlKodu" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="YerAdi" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="YerKodu" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="IlAdi" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Fk_YerTipiID" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Aktifmi" type="s:boolean" />
              <s:element minOccurs="0" maxOccurs="1" name="TelefonAlanKodu" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="YerTipi" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="KurumBirimIletisimBilgileriGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="detsisId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KurumBirimIletisimBilgileriGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KurumBirimIletisimBilgileriGetirWsResult" type="tns:SonucIletisimBilgileri" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucIletisimBilgileri">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfIletisimBilgileriWS" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfIletisimBilgileriWS">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="IletisimBilgileriWS" nillable="true" type="tns:IletisimBilgileriWS" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="IletisimBilgileriWS">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="DetsisNo" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="Iletisim" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="IletisimTip" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="IletisimAdi" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="AnakurumIletisimBilgileriWs">
        <s:complexType />
      </s:element>
      <s:element name="AnakurumIletisimBilgileriWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AnakurumIletisimBilgileriWsResult" type="tns:SonucIletisimBilgileri" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AnaKurumlarButceTurleriGetirWs">
        <s:complexType />
      </s:element>
      <s:element name="AnaKurumlarButceTurleriGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AnaKurumlarButceTurleriGetirWsResult" type="tns:SonuclarOOfAnaKurumlarButceTurleri" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfAnaKurumlarButceTurleri">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfAnaKurumlarButceTurleri" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfAnaKurumlarButceTurleri">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="AnaKurumlarButceTurleri" nillable="true" type="tns:AnaKurumlarButceTurleri" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="AnaKurumlarButceTurleri">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="DETSISNo" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Ad" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ParentIdareKimlikKodu" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="AnaKurumIdareKimlikKodu" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ParentIdareKimlikKodu2" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="ButceTuruID" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ButceTuru" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Fk_TuzelKisilikID" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="TuzelKisilik" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="KurumSDPKodlariGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="IdariKimlikKodu" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KurumSDPKodlariGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KurumSDPKodlariGetirWsResult" type="tns:SonuclarOOfKodlarWsObj" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfKodlarWsObj">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfKodlarWsObj" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfKodlarWsObj">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="KodlarWsObj" nillable="true" type="tns:KodlarWsObj" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="KodlarWsObj">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="AnaKod" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="AltKod1" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="AltKod2" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="AltKod3" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="KonuAdi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SaklamaSuresi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SaklamaZaman" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="SaklamaKodu" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DipNot" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Aciklama" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Aktifmi" type="s:boolean" />
              <s:element minOccurs="1" maxOccurs="1" name="Tip" type="s:boolean" />
              <s:element minOccurs="0" maxOccurs="1" name="GrupBaslangici" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GrupBitisi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Kod" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Seviye" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="DETSISNoKurumBirimWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DETSISNo" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DETSISNoKurumBirimWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DETSISNoKurumBirimWsResult" type="tns:SonucO" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucO">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfKurumBirimWS" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TestSonuc" type="tns:ArrayOfString" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="KendiTumBirimleriGetirWs">
        <s:complexType />
      </s:element>
      <s:element name="KendiTumBirimleriGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KendiTumBirimleriGetirWsResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HiyerarsiGetirKurumBirimWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DETSISNo" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HiyerarsiGetirKurumBirimWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="HiyerarsiGetirKurumBirimWsResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdaGoreKurumBirimSorgulaWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ad" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="anaKurumIdareKimlikKodu" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdaGoreKurumBirimSorgulaWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AdaGoreKurumBirimSorgulaWsResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AnaKurumlariGetirKurumBirimWs">
        <s:complexType />
      </s:element>
      <s:element name="AnaKurumlariGetirKurumBirimWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AnaKurumlariGetirKurumBirimWsResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DetayBilgilereGoreSorgulaKurumBirimWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="yerKodu" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="kategoriID" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="statuID" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="IlKodu" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DetayBilgilereGoreSorgulaKurumBirimWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DetayBilgilereGoreSorgulaKurumBirimWsResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KEPAdresiKontrolEt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KepAdresi" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KEPAdresiKontrolEtResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KEPAdresiKontrolEtResult" type="tns:SonucOOfKepBilgileriWs" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucOOfKepBilgileriWs">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="Sonuclar" type="tns:KepBilgileriWs" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="KepBilgileriWs">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="KurumDetsisNo" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="KepAdresi" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Aktifmi" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Durum" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="KEPAdresleriniGetir">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DetsisIDs" type="tns:ArrayOfInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfInt">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="int" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="KEPAdresleriniGetirResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KEPAdresleriniGetirResult" type="tns:SonuclarOOfKepBilgileriWs" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfKepBilgileriWs">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfKepBilgileriWs" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfKepBilgileriWs">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="KepBilgileriWs" type="tns:KepBilgileriWs" />
        </s:sequence>
      </s:complexType>
      <s:element name="AktifKEPAdresleriniGetir">
        <s:complexType />
      </s:element>
      <s:element name="AktifKEPAdresleriniGetirResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AktifKEPAdresleriniGetirResult" type="tns:SonuclarOOfKepBilgileriWs" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="eYazismaPaketi">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="gonderenDetsisID" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="muhatapDetsisIDs" type="tns:ArrayOfInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="eYazismaPaketiResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="eYazismaPaketiResult" type="tns:SonucOOfeYazismaPaketi" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonucOOfeYazismaPaketi">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:eYazismaPaketi" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="eYazismaPaketi">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapBilgi" type="tns:ArrayOfEYazismaMuhatapBilgileri" />
              <s:element minOccurs="0" maxOccurs="1" name="ImzaYetkilileri" type="tns:ArrayOfEyazismaImzaYetkilisi" />
              <s:element minOccurs="0" maxOccurs="1" name="Antet" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapAd" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="RYSayiDetsisNo" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="ArzRica" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GonderenTelefonNumarasi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GonderenFaksNumarasi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GonderenEPostaAdresi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GonderenInternetSitesiAdresi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="GonderenAdresi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="DagitimListesi" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfEYazismaMuhatapBilgileri">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="eYazismaMuhatapBilgileri" nillable="true" type="tns:eYazismaMuhatapBilgileri" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="eYazismaMuhatapBilgileri">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapKepAdresi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapKepTipi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapSifrelemeSertifikasi" type="s:base64Binary" />
              <s:element minOccurs="1" maxOccurs="1" name="KurumID" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapAdresi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="MuhatapAd" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ArrayOfEyazismaImzaYetkilisi">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="EyazismaImzaYetkilisi" nillable="true" type="tns:EyazismaImzaYetkilisi" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="EyazismaImzaYetkilisi">
        <s:complexContent mixed="false">
          <s:extension base="tns:ImzaYetkilisi">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="VekaletTuru" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Unvan" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="DetsisNo" type="s:int" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="ImzaYetkilisi">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="1" maxOccurs="1" name="TCYoneticiKodu" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="YoneticiAd" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="YoneticiSoyad" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="KutukNodanDetsisNoGetir">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="kutukNoList" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KutukNodanDetsisNoGetirResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="KutukNodanDetsisNoGetirResult" type="tns:SonuclarOOfDevletTeskilatiKutukWs" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfDevletTeskilatiKutukWs">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfDevletTeskilatiKutukWs" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDevletTeskilatiKutukWs">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DevletTeskilatiKutukWs" nillable="true" type="tns:DevletTeskilatiKutukWs" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DevletTeskilatiKutukWs">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="DETSISNo" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Ad" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DevletTeskilatiKutukNo" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="AnaKurumDetsisNo" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="KurumHiyerarsik" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Aktifmi" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="DetsisIslemYetkilisiBilgileriWs">
        <s:complexType />
      </s:element>
      <s:element name="DetsisIslemYetkilisiBilgileriWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DetsisIslemYetkilisiBilgileriWsResult" type="tns:SonuclarOOfDetsisKullanici" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfDetsisKullanici">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfDetsisKullanici" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfDetsisKullanici">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DetsisKullanici" nillable="true" type="tns:DetsisKullanici" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DetsisKullanici">
        <s:complexContent mixed="false">
          <s:extension base="tns:TablesBase">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="Adi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Soyadi" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Telefon" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Email" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Yetkisi" type="s:string" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="AltKurulusBirimleriListele">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="arananKurum" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AltKurulusBirimleriListeleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AltKurulusBirimleriListeleResult" type="tns:SonuclarOOfKurumBirimWS" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMTCdenGorevListesiGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TCKimlikNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMTCdenGorevListesiGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IYEMTCdenGorevListesiGetirWsResult" type="tns:SonuclarOOfIyemYoneticiObj" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="SonuclarOOfIyemYoneticiObj">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="SonucHatali" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="Sonuclar" type="tns:ArrayOfIyemYoneticiObj" />
          <s:element minOccurs="0" maxOccurs="1" name="HataMsj" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfIyemYoneticiObj">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="IyemYoneticiObj" nillable="true" type="tns:IyemYoneticiObj" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="IyemYoneticiObj">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="ID" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Ad" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="KurumHiyerarsik" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ParentIdareKimlikKodu" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UnvanAdi" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="YoneticiKodu" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="YoneticiAdiSoyadi" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="DogumTarihi" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Yasi" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="YasGrup" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="HukukiDayanak" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GorevTuru" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="GorevBaslamaTarihi" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="GorevBitisTarihi" nillable="true" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="Aktifmi" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:element name="IYEMYoneticiIDdenGorevListesiGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="YoneticiID" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMYoneticiIDdenGorevListesiGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IYEMYoneticiIDdenGorevListesiGetirWsResult" type="tns:SonuclarOOfIyemYoneticiObj" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMKurumYoneticisiGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="KurumID" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="Tarih" nillable="true" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMKurumYoneticisiGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IYEMKurumYoneticisiGetirWsResult" type="tns:SonuclarOOfIyemYoneticiObj" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMTumYoneticileriGetirWs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="KurumID" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IYEMTumYoneticileriGetirWsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IYEMTumYoneticileriGetirWsResult" type="tns:SonuclarOOfIyemYoneticiObj" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SonuclarOOfKurumBirimWS" nillable="true" type="tns:SonuclarOOfKurumBirimWS" />
      <s:element name="SonucResTip1" nillable="true" type="tns:SonucResTip1" />
      <s:element name="SonucResTip2" nillable="true" type="tns:SonucResTip2" />
      <s:element name="SonucResYerKod" nillable="true" type="tns:SonucResYerKod" />
      <s:element name="SonucIletisimBilgileri" nillable="true" type="tns:SonucIletisimBilgileri" />
      <s:element name="SonuclarOOfAnaKurumlarButceTurleri" nillable="true" type="tns:SonuclarOOfAnaKurumlarButceTurleri" />
      <s:element name="SonuclarOOfKodlarWsObj" nillable="true" type="tns:SonuclarOOfKodlarWsObj" />
      <s:element name="SonucO" nillable="true" type="tns:SonucO" />
      <s:element name="SonucOOfKepBilgileriWs" nillable="true" type="tns:SonucOOfKepBilgileriWs" />
      <s:element name="SonuclarOOfKepBilgileriWs" nillable="true" type="tns:SonuclarOOfKepBilgileriWs" />
      <s:element name="SonuclarOOfDetsisKullanici" nillable="true" type="tns:SonuclarOOfDetsisKullanici" />
      <s:element name="SonuclarOOfIyemYoneticiObj" nillable="true" type="tns:SonuclarOOfIyemYoneticiObj" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:YeniDisYazismaYapanlariGetirWs" />
  </wsdl:message>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:YeniDisYazismaYapanlariGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="TumTip1KodlariGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:TumTip1KodlariGetirWs" />
  </wsdl:message>
  <wsdl:message name="TumTip1KodlariGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:TumTip1KodlariGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="TumTip1KodlariGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="TumTip2KodlariGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:TumTip2KodlariGetirWs" />
  </wsdl:message>
  <wsdl:message name="TumTip2KodlariGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:TumTip2KodlariGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="TumTip2KodlariGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="TumYerKodlariGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:TumYerKodlariGetirWs" />
  </wsdl:message>
  <wsdl:message name="TumYerKodlariGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:TumYerKodlariGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="TumYerKodlariGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:KurumBirimIletisimBilgileriGetirWs" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:KurumBirimIletisimBilgileriGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="AnakurumIletisimBilgileriWsSoapIn">
    <wsdl:part name="parameters" element="tns:AnakurumIletisimBilgileriWs" />
  </wsdl:message>
  <wsdl:message name="AnakurumIletisimBilgileriWsSoapOut">
    <wsdl:part name="parameters" element="tns:AnakurumIletisimBilgileriWsResponse" />
  </wsdl:message>
  <wsdl:message name="AnakurumIletisimBilgileriWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:AnaKurumlarButceTurleriGetirWs" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:AnaKurumlarButceTurleriGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:KurumSDPKodlariGetirWs" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:KurumSDPKodlariGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsSoapIn">
    <wsdl:part name="parameters" element="tns:DETSISNoKurumBirimWs" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsSoapOut">
    <wsdl:part name="parameters" element="tns:DETSISNoKurumBirimWsResponse" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="KendiTumBirimleriGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:KendiTumBirimleriGetirWs" />
  </wsdl:message>
  <wsdl:message name="KendiTumBirimleriGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:KendiTumBirimleriGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="KendiTumBirimleriGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsSoapIn">
    <wsdl:part name="parameters" element="tns:HiyerarsiGetirKurumBirimWs" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsSoapOut">
    <wsdl:part name="parameters" element="tns:HiyerarsiGetirKurumBirimWsResponse" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsSoapIn">
    <wsdl:part name="parameters" element="tns:AdaGoreKurumBirimSorgulaWs" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsSoapOut">
    <wsdl:part name="parameters" element="tns:AdaGoreKurumBirimSorgulaWsResponse" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsSoapIn">
    <wsdl:part name="parameters" element="tns:AnaKurumlariGetirKurumBirimWs" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsSoapOut">
    <wsdl:part name="parameters" element="tns:AnaKurumlariGetirKurumBirimWsResponse" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsSoapIn">
    <wsdl:part name="parameters" element="tns:DetayBilgilereGoreSorgulaKurumBirimWs" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsSoapOut">
    <wsdl:part name="parameters" element="tns:DetayBilgilereGoreSorgulaKurumBirimWsResponse" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtSoapIn">
    <wsdl:part name="parameters" element="tns:KEPAdresiKontrolEt" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtSoapOut">
    <wsdl:part name="parameters" element="tns:KEPAdresiKontrolEtResponse" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="KEPAdresleriniGetirSoapIn">
    <wsdl:part name="parameters" element="tns:KEPAdresleriniGetir" />
  </wsdl:message>
  <wsdl:message name="KEPAdresleriniGetirSoapOut">
    <wsdl:part name="parameters" element="tns:KEPAdresleriniGetirResponse" />
  </wsdl:message>
  <wsdl:message name="KEPAdresleriniGetirBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="AktifKEPAdresleriniGetirSoapIn">
    <wsdl:part name="parameters" element="tns:AktifKEPAdresleriniGetir" />
  </wsdl:message>
  <wsdl:message name="AktifKEPAdresleriniGetirSoapOut">
    <wsdl:part name="parameters" element="tns:AktifKEPAdresleriniGetirResponse" />
  </wsdl:message>
  <wsdl:message name="AktifKEPAdresleriniGetirBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="eYazismaPaketiSoapIn">
    <wsdl:part name="parameters" element="tns:eYazismaPaketi" />
  </wsdl:message>
  <wsdl:message name="eYazismaPaketiSoapOut">
    <wsdl:part name="parameters" element="tns:eYazismaPaketiResponse" />
  </wsdl:message>
  <wsdl:message name="eYazismaPaketiBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="KutukNodanDetsisNoGetirSoapIn">
    <wsdl:part name="parameters" element="tns:KutukNodanDetsisNoGetir" />
  </wsdl:message>
  <wsdl:message name="KutukNodanDetsisNoGetirSoapOut">
    <wsdl:part name="parameters" element="tns:KutukNodanDetsisNoGetirResponse" />
  </wsdl:message>
  <wsdl:message name="KutukNodanDetsisNoGetirBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsSoapIn">
    <wsdl:part name="parameters" element="tns:DetsisIslemYetkilisiBilgileriWs" />
  </wsdl:message>
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsSoapOut">
    <wsdl:part name="parameters" element="tns:DetsisIslemYetkilisiBilgileriWsResponse" />
  </wsdl:message>
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleSoapIn">
    <wsdl:part name="parameters" element="tns:AltKurulusBirimleriListele" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleSoapOut">
    <wsdl:part name="parameters" element="tns:AltKurulusBirimleriListeleResponse" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:IYEMTCdenGorevListesiGetirWs" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:IYEMTCdenGorevListesiGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:IYEMYoneticiIDdenGorevListesiGetirWs" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:IYEMYoneticiIDdenGorevListesiGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="IYEMKurumYoneticisiGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:IYEMKurumYoneticisiGetirWs" />
  </wsdl:message>
  <wsdl:message name="IYEMKurumYoneticisiGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:IYEMKurumYoneticisiGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="IYEMKurumYoneticisiGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsSoapIn">
    <wsdl:part name="parameters" element="tns:IYEMTumYoneticileriGetirWs" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsSoapOut">
    <wsdl:part name="parameters" element="tns:IYEMTumYoneticileriGetirWsResponse" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsBbServiceAuthentication">
    <wsdl:part name="BbServiceAuthentication" element="tns:BbServiceAuthentication" />
  </wsdl:message>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsHttpGetIn">
    <wsdl:part name="pGun" type="s:string" />
    <wsdl:part name="pAy" type="s:string" />
    <wsdl:part name="pYil" type="s:string" />
  </wsdl:message>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="TumTip1KodlariGetirWsHttpGetIn" />
  <wsdl:message name="TumTip1KodlariGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucResTip1" />
  </wsdl:message>
  <wsdl:message name="TumTip2KodlariGetirWsHttpGetIn" />
  <wsdl:message name="TumTip2KodlariGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucResTip2" />
  </wsdl:message>
  <wsdl:message name="TumYerKodlariGetirWsHttpGetIn" />
  <wsdl:message name="TumYerKodlariGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucResYerKod" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsHttpGetIn">
    <wsdl:part name="detsisId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucIletisimBilgileri" />
  </wsdl:message>
  <wsdl:message name="AnakurumIletisimBilgileriWsHttpGetIn" />
  <wsdl:message name="AnakurumIletisimBilgileriWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucIletisimBilgileri" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsHttpGetIn" />
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfAnaKurumlarButceTurleri" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsHttpGetIn">
    <wsdl:part name="IdariKimlikKodu" type="s:string" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKodlarWsObj" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsHttpGetIn">
    <wsdl:part name="DETSISNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucO" />
  </wsdl:message>
  <wsdl:message name="KendiTumBirimleriGetirWsHttpGetIn" />
  <wsdl:message name="KendiTumBirimleriGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsHttpGetIn">
    <wsdl:part name="DETSISNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsHttpGetIn">
    <wsdl:part name="ad" type="s:string" />
    <wsdl:part name="anaKurumIdareKimlikKodu" type="s:string" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsHttpGetIn" />
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsHttpGetIn">
    <wsdl:part name="yerKodu" type="s:string" />
    <wsdl:part name="kategoriID" type="s:string" />
    <wsdl:part name="statuID" type="s:string" />
    <wsdl:part name="IlKodu" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtHttpGetIn">
    <wsdl:part name="KepAdresi" type="s:string" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtHttpGetOut">
    <wsdl:part name="Body" element="tns:SonucOOfKepBilgileriWs" />
  </wsdl:message>
  <wsdl:message name="AktifKEPAdresleriniGetirHttpGetIn" />
  <wsdl:message name="AktifKEPAdresleriniGetirHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKepBilgileriWs" />
  </wsdl:message>
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsHttpGetIn" />
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfDetsisKullanici" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleHttpGetIn">
    <wsdl:part name="arananKurum" type="s:string" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsHttpGetIn">
    <wsdl:part name="TCKimlikNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfIyemYoneticiObj" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsHttpGetIn">
    <wsdl:part name="YoneticiID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfIyemYoneticiObj" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsHttpGetIn">
    <wsdl:part name="KurumID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsHttpGetOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfIyemYoneticiObj" />
  </wsdl:message>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsHttpPostIn">
    <wsdl:part name="pGun" type="s:string" />
    <wsdl:part name="pAy" type="s:string" />
    <wsdl:part name="pYil" type="s:string" />
  </wsdl:message>
  <wsdl:message name="YeniDisYazismaYapanlariGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="TumTip1KodlariGetirWsHttpPostIn" />
  <wsdl:message name="TumTip1KodlariGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucResTip1" />
  </wsdl:message>
  <wsdl:message name="TumTip2KodlariGetirWsHttpPostIn" />
  <wsdl:message name="TumTip2KodlariGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucResTip2" />
  </wsdl:message>
  <wsdl:message name="TumYerKodlariGetirWsHttpPostIn" />
  <wsdl:message name="TumYerKodlariGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucResYerKod" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsHttpPostIn">
    <wsdl:part name="detsisId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="KurumBirimIletisimBilgileriGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucIletisimBilgileri" />
  </wsdl:message>
  <wsdl:message name="AnakurumIletisimBilgileriWsHttpPostIn" />
  <wsdl:message name="AnakurumIletisimBilgileriWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucIletisimBilgileri" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsHttpPostIn" />
  <wsdl:message name="AnaKurumlarButceTurleriGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfAnaKurumlarButceTurleri" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsHttpPostIn">
    <wsdl:part name="IdariKimlikKodu" type="s:string" />
  </wsdl:message>
  <wsdl:message name="KurumSDPKodlariGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKodlarWsObj" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsHttpPostIn">
    <wsdl:part name="DETSISNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DETSISNoKurumBirimWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucO" />
  </wsdl:message>
  <wsdl:message name="KendiTumBirimleriGetirWsHttpPostIn" />
  <wsdl:message name="KendiTumBirimleriGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsHttpPostIn">
    <wsdl:part name="DETSISNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="HiyerarsiGetirKurumBirimWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsHttpPostIn">
    <wsdl:part name="ad" type="s:string" />
    <wsdl:part name="anaKurumIdareKimlikKodu" type="s:string" />
  </wsdl:message>
  <wsdl:message name="AdaGoreKurumBirimSorgulaWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsHttpPostIn" />
  <wsdl:message name="AnaKurumlariGetirKurumBirimWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsHttpPostIn">
    <wsdl:part name="yerKodu" type="s:string" />
    <wsdl:part name="kategoriID" type="s:string" />
    <wsdl:part name="statuID" type="s:string" />
    <wsdl:part name="IlKodu" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DetayBilgilereGoreSorgulaKurumBirimWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtHttpPostIn">
    <wsdl:part name="KepAdresi" type="s:string" />
  </wsdl:message>
  <wsdl:message name="KEPAdresiKontrolEtHttpPostOut">
    <wsdl:part name="Body" element="tns:SonucOOfKepBilgileriWs" />
  </wsdl:message>
  <wsdl:message name="AktifKEPAdresleriniGetirHttpPostIn" />
  <wsdl:message name="AktifKEPAdresleriniGetirHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKepBilgileriWs" />
  </wsdl:message>
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsHttpPostIn" />
  <wsdl:message name="DetsisIslemYetkilisiBilgileriWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfDetsisKullanici" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleHttpPostIn">
    <wsdl:part name="arananKurum" type="s:string" />
  </wsdl:message>
  <wsdl:message name="AltKurulusBirimleriListeleHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfKurumBirimWS" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsHttpPostIn">
    <wsdl:part name="TCKimlikNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IYEMTCdenGorevListesiGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfIyemYoneticiObj" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsHttpPostIn">
    <wsdl:part name="YoneticiID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IYEMYoneticiIDdenGorevListesiGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfIyemYoneticiObj" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsHttpPostIn">
    <wsdl:part name="KurumID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IYEMTumYoneticileriGetirWsHttpPostOut">
    <wsdl:part name="Body" element="tns:SonuclarOOfIyemYoneticiObj" />
  </wsdl:message>
  <wsdl:portType name="BBDETSISWS">
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen Tarih bilgisi ile şu ana kadar Dış yazışma yapabilen kurumlarda yapılan güncellemeleri getiren metotdur,Detayli Kullanim icin Lutfen Teknik rehbere basvurunuz</wsdl:documentation>
      <wsdl:input message="tns:YeniDisYazismaYapanlariGetirWsSoapIn" />
      <wsdl:output message="tns:YeniDisYazismaYapanlariGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Tip1 Kod tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumTip1KodlariGetirWsSoapIn" />
      <wsdl:output message="tns:TumTip1KodlariGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Tip2 Kod tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumTip2KodlariGetirWsSoapIn" />
      <wsdl:output message="tns:TumTip2KodlariGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Yerkodlarin  tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumYerKodlariGetirWsSoapIn" />
      <wsdl:output message="tns:TumYerKodlariGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen Kurumun Iletisim Bilgisini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:KurumBirimIletisimBilgileriGetirWsSoapIn" />
      <wsdl:output message="tns:KurumBirimIletisimBilgileriGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana kurumlarin Iletisim Bilgilerini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:AnakurumIletisimBilgileriWsSoapIn" />
      <wsdl:output message="tns:AnakurumIletisimBilgileriWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana Kurumlarin Butce Turleri.</wsdl:documentation>
      <wsdl:input message="tns:AnaKurumlarButceTurleriGetirWsSoapIn" />
      <wsdl:output message="tns:AnaKurumlarButceTurleriGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Anakurumkodu ile Standart Dosya Planı Kodlarını getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KurumSDPKodlariGetirWsSoapIn" />
      <wsdl:output message="tns:KurumSDPKodlariGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">DETSISNo ile Kurum/Birim bilgileri sorgulayan metotdur.</wsdl:documentation>
      <wsdl:input message="tns:DETSISNoKurumBirimWsSoapIn" />
      <wsdl:output message="tns:DETSISNoKurumBirimWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Gönderilen DETSISNo paremetresine bağlı alt birimleri getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KendiTumBirimleriGetirWsSoapIn" />
      <wsdl:output message="tns:KendiTumBirimleriGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen DETSISNona bağlı Ana Kurumuna kadar olan bütün üst birimleri getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:HiyerarsiGetirKurumBirimWsSoapIn" />
      <wsdl:output message="tns:HiyerarsiGetirKurumBirimWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen AnaDETSISNo ya bağlı verilen Ada uygun Kurum/Birim listesi dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AdaGoreKurumBirimSorgulaWsSoapIn" />
      <wsdl:output message="tns:AdaGoreKurumBirimSorgulaWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana kurumların listesini dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AnaKurumlariGetirKurumBirimWsSoapIn" />
      <wsdl:output message="tns:AnaKurumlariGetirKurumBirimWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Yer Kodu, Tip 1 ve Tip 2 ye göre kurum listesi dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:DetayBilgilereGoreSorgulaKurumBirimWsSoapIn" />
      <wsdl:output message="tns:DetayBilgilereGoreSorgulaKurumBirimWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">KEP Adresi kontrolününün yapıldığı metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KEPAdresiKontrolEtSoapIn" />
      <wsdl:output message="tns:KEPAdresiKontrolEtSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KEPAdresleriniGetir">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">İstenen Kurumların KEP Adres listesini veren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KEPAdresleriniGetirSoapIn" />
      <wsdl:output message="tns:KEPAdresleriniGetirSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Aktif olan tüm KEP Adreslerinin listesini veren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AktifKEPAdresleriniGetirSoapIn" />
      <wsdl:output message="tns:AktifKEPAdresleriniGetirSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="eYazismaPaketi">
      <wsdl:input message="tns:eYazismaPaketiSoapIn" />
      <wsdl:output message="tns:eYazismaPaketiSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KutukNodanDetsisNoGetir">
      <wsdl:input message="tns:KutukNodanDetsisNoGetirSoapIn" />
      <wsdl:output message="tns:KutukNodanDetsisNoGetirSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <wsdl:input message="tns:DetsisIslemYetkilisiBilgileriWsSoapIn" />
      <wsdl:output message="tns:DetsisIslemYetkilisiBilgileriWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <wsdl:input message="tns:AltKurulusBirimleriListeleSoapIn" />
      <wsdl:output message="tns:AltKurulusBirimleriListeleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <wsdl:input message="tns:IYEMTCdenGorevListesiGetirWsSoapIn" />
      <wsdl:output message="tns:IYEMTCdenGorevListesiGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <wsdl:input message="tns:IYEMYoneticiIDdenGorevListesiGetirWsSoapIn" />
      <wsdl:output message="tns:IYEMYoneticiIDdenGorevListesiGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMKurumYoneticisiGetirWs">
      <wsdl:input message="tns:IYEMKurumYoneticisiGetirWsSoapIn" />
      <wsdl:output message="tns:IYEMKurumYoneticisiGetirWsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <wsdl:input message="tns:IYEMTumYoneticileriGetirWsSoapIn" />
      <wsdl:output message="tns:IYEMTumYoneticileriGetirWsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="DETSISServisHttpGet">
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen Tarih bilgisi ile şu ana kadar Dış yazışma yapabilen kurumlarda yapılan güncellemeleri getiren metotdur,Detayli Kullanim icin Lutfen Teknik rehbere basvurunuz</wsdl:documentation>
      <wsdl:input message="tns:YeniDisYazismaYapanlariGetirWsHttpGetIn" />
      <wsdl:output message="tns:YeniDisYazismaYapanlariGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Tip1 Kod tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumTip1KodlariGetirWsHttpGetIn" />
      <wsdl:output message="tns:TumTip1KodlariGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Tip2 Kod tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumTip2KodlariGetirWsHttpGetIn" />
      <wsdl:output message="tns:TumTip2KodlariGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Yerkodlarin  tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumYerKodlariGetirWsHttpGetIn" />
      <wsdl:output message="tns:TumYerKodlariGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen Kurumun Iletisim Bilgisini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:KurumBirimIletisimBilgileriGetirWsHttpGetIn" />
      <wsdl:output message="tns:KurumBirimIletisimBilgileriGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana kurumlarin Iletisim Bilgilerini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:AnakurumIletisimBilgileriWsHttpGetIn" />
      <wsdl:output message="tns:AnakurumIletisimBilgileriWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana Kurumlarin Butce Turleri.</wsdl:documentation>
      <wsdl:input message="tns:AnaKurumlarButceTurleriGetirWsHttpGetIn" />
      <wsdl:output message="tns:AnaKurumlarButceTurleriGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Anakurumkodu ile Standart Dosya Planı Kodlarını getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KurumSDPKodlariGetirWsHttpGetIn" />
      <wsdl:output message="tns:KurumSDPKodlariGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">DETSISNo ile Kurum/Birim bilgileri sorgulayan metotdur.</wsdl:documentation>
      <wsdl:input message="tns:DETSISNoKurumBirimWsHttpGetIn" />
      <wsdl:output message="tns:DETSISNoKurumBirimWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Gönderilen DETSISNo paremetresine bağlı alt birimleri getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KendiTumBirimleriGetirWsHttpGetIn" />
      <wsdl:output message="tns:KendiTumBirimleriGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen DETSISNona bağlı Ana Kurumuna kadar olan bütün üst birimleri getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:HiyerarsiGetirKurumBirimWsHttpGetIn" />
      <wsdl:output message="tns:HiyerarsiGetirKurumBirimWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen AnaDETSISNo ya bağlı verilen Ada uygun Kurum/Birim listesi dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AdaGoreKurumBirimSorgulaWsHttpGetIn" />
      <wsdl:output message="tns:AdaGoreKurumBirimSorgulaWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana kurumların listesini dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AnaKurumlariGetirKurumBirimWsHttpGetIn" />
      <wsdl:output message="tns:AnaKurumlariGetirKurumBirimWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Yer Kodu, Tip 1 ve Tip 2 ye göre kurum listesi dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:DetayBilgilereGoreSorgulaKurumBirimWsHttpGetIn" />
      <wsdl:output message="tns:DetayBilgilereGoreSorgulaKurumBirimWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">KEP Adresi kontrolününün yapıldığı metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KEPAdresiKontrolEtHttpGetIn" />
      <wsdl:output message="tns:KEPAdresiKontrolEtHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Aktif olan tüm KEP Adreslerinin listesini veren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AktifKEPAdresleriniGetirHttpGetIn" />
      <wsdl:output message="tns:AktifKEPAdresleriniGetirHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <wsdl:input message="tns:DetsisIslemYetkilisiBilgileriWsHttpGetIn" />
      <wsdl:output message="tns:DetsisIslemYetkilisiBilgileriWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <wsdl:input message="tns:AltKurulusBirimleriListeleHttpGetIn" />
      <wsdl:output message="tns:AltKurulusBirimleriListeleHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <wsdl:input message="tns:IYEMTCdenGorevListesiGetirWsHttpGetIn" />
      <wsdl:output message="tns:IYEMTCdenGorevListesiGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <wsdl:input message="tns:IYEMYoneticiIDdenGorevListesiGetirWsHttpGetIn" />
      <wsdl:output message="tns:IYEMYoneticiIDdenGorevListesiGetirWsHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <wsdl:input message="tns:IYEMTumYoneticileriGetirWsHttpGetIn" />
      <wsdl:output message="tns:IYEMTumYoneticileriGetirWsHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="DETSISServisHttpPost">
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen Tarih bilgisi ile şu ana kadar Dış yazışma yapabilen kurumlarda yapılan güncellemeleri getiren metotdur,Detayli Kullanim icin Lutfen Teknik rehbere basvurunuz</wsdl:documentation>
      <wsdl:input message="tns:YeniDisYazismaYapanlariGetirWsHttpPostIn" />
      <wsdl:output message="tns:YeniDisYazismaYapanlariGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Tip1 Kod tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumTip1KodlariGetirWsHttpPostIn" />
      <wsdl:output message="tns:TumTip1KodlariGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Tip2 Kod tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumTip2KodlariGetirWsHttpPostIn" />
      <wsdl:output message="tns:TumTip2KodlariGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Kurumlarin Kullandigi Tum Yerkodlarin  tanimlarini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:TumYerKodlariGetirWsHttpPostIn" />
      <wsdl:output message="tns:TumYerKodlariGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen Kurumun Iletisim Bilgisini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:KurumBirimIletisimBilgileriGetirWsHttpPostIn" />
      <wsdl:output message="tns:KurumBirimIletisimBilgileriGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana kurumlarin Iletisim Bilgilerini Getiren Metot</wsdl:documentation>
      <wsdl:input message="tns:AnakurumIletisimBilgileriWsHttpPostIn" />
      <wsdl:output message="tns:AnakurumIletisimBilgileriWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana Kurumlarin Butce Turleri.</wsdl:documentation>
      <wsdl:input message="tns:AnaKurumlarButceTurleriGetirWsHttpPostIn" />
      <wsdl:output message="tns:AnaKurumlarButceTurleriGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Anakurumkodu ile Standart Dosya Planı Kodlarını getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KurumSDPKodlariGetirWsHttpPostIn" />
      <wsdl:output message="tns:KurumSDPKodlariGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">DETSISNo ile Kurum/Birim bilgileri sorgulayan metotdur.</wsdl:documentation>
      <wsdl:input message="tns:DETSISNoKurumBirimWsHttpPostIn" />
      <wsdl:output message="tns:DETSISNoKurumBirimWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Gönderilen DETSISNo paremetresine bağlı alt birimleri getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KendiTumBirimleriGetirWsHttpPostIn" />
      <wsdl:output message="tns:KendiTumBirimleriGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen DETSISNona bağlı Ana Kurumuna kadar olan bütün üst birimleri getiren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:HiyerarsiGetirKurumBirimWsHttpPostIn" />
      <wsdl:output message="tns:HiyerarsiGetirKurumBirimWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Verilen AnaDETSISNo ya bağlı verilen Ada uygun Kurum/Birim listesi dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AdaGoreKurumBirimSorgulaWsHttpPostIn" />
      <wsdl:output message="tns:AdaGoreKurumBirimSorgulaWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ana kurumların listesini dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AnaKurumlariGetirKurumBirimWsHttpPostIn" />
      <wsdl:output message="tns:AnaKurumlariGetirKurumBirimWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Yer Kodu, Tip 1 ve Tip 2 ye göre kurum listesi dönen metotdur.</wsdl:documentation>
      <wsdl:input message="tns:DetayBilgilereGoreSorgulaKurumBirimWsHttpPostIn" />
      <wsdl:output message="tns:DetayBilgilereGoreSorgulaKurumBirimWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">KEP Adresi kontrolününün yapıldığı metotdur.</wsdl:documentation>
      <wsdl:input message="tns:KEPAdresiKontrolEtHttpPostIn" />
      <wsdl:output message="tns:KEPAdresiKontrolEtHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Aktif olan tüm KEP Adreslerinin listesini veren metotdur.</wsdl:documentation>
      <wsdl:input message="tns:AktifKEPAdresleriniGetirHttpPostIn" />
      <wsdl:output message="tns:AktifKEPAdresleriniGetirHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <wsdl:input message="tns:DetsisIslemYetkilisiBilgileriWsHttpPostIn" />
      <wsdl:output message="tns:DetsisIslemYetkilisiBilgileriWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <wsdl:input message="tns:AltKurulusBirimleriListeleHttpPostIn" />
      <wsdl:output message="tns:AltKurulusBirimleriListeleHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <wsdl:input message="tns:IYEMTCdenGorevListesiGetirWsHttpPostIn" />
      <wsdl:output message="tns:IYEMTCdenGorevListesiGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <wsdl:input message="tns:IYEMYoneticiIDdenGorevListesiGetirWsHttpPostIn" />
      <wsdl:output message="tns:IYEMYoneticiIDdenGorevListesiGetirWsHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <wsdl:input message="tns:IYEMTumYoneticileriGetirWsHttpPostIn" />
      <wsdl:output message="tns:IYEMTumYoneticileriGetirWsHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BBDETSISWS" type="tns:BBDETSISWS">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/YeniDisYazismaYapanlariGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:YeniDisYazismaYapanlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/TumTip1KodlariGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:TumTip1KodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/TumTip2KodlariGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:TumTip2KodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/TumYerKodlariGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:TumYerKodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/KurumBirimIletisimBilgileriGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:KurumBirimIletisimBilgileriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <soap:operation soapAction="http://kaysis.gov.tr/AnakurumIletisimBilgileriWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AnakurumIletisimBilgileriWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/AnaKurumlarButceTurleriGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AnaKurumlarButceTurleriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/KurumSDPKodlariGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:KurumSDPKodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <soap:operation soapAction="http://kaysis.gov.tr/DETSISNoKurumBirimWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:DETSISNoKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/KendiTumBirimleriGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:KendiTumBirimleriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <soap:operation soapAction="http://kaysis.gov.tr/HiyerarsiGetirKurumBirimWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:HiyerarsiGetirKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <soap:operation soapAction="http://kaysis.gov.tr/AdaGoreKurumBirimSorgulaWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AdaGoreKurumBirimSorgulaWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <soap:operation soapAction="http://kaysis.gov.tr/AnaKurumlariGetirKurumBirimWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AnaKurumlariGetirKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <soap:operation soapAction="http://kaysis.gov.tr/DetayBilgilereGoreSorgulaKurumBirimWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:DetayBilgilereGoreSorgulaKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <soap:operation soapAction="http://kaysis.gov.tr/KEPAdresiKontrolEt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:KEPAdresiKontrolEtBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KEPAdresleriniGetir">
      <soap:operation soapAction="http://kaysis.gov.tr/KEPAdresleriniGetir" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:KEPAdresleriniGetirBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <soap:operation soapAction="http://kaysis.gov.tr/AktifKEPAdresleriniGetir" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AktifKEPAdresleriniGetirBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="eYazismaPaketi">
      <soap:operation soapAction="http://kaysis.gov.tr/eYazismaPaketi" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:eYazismaPaketiBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KutukNodanDetsisNoGetir">
      <soap:operation soapAction="http://kaysis.gov.tr/KutukNodanDetsisNoGetir" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:KutukNodanDetsisNoGetirBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <soap:operation soapAction="http://kaysis.gov.tr/DetsisIslemYetkilisiBilgileriWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:DetsisIslemYetkilisiBilgileriWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <soap:operation soapAction="http://kaysis.gov.tr/AltKurulusBirimleriListele" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:AltKurulusBirimleriListeleBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/IYEMTCdenGorevListesiGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:IYEMTCdenGorevListesiGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/IYEMYoneticiIDdenGorevListesiGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:IYEMYoneticiIDdenGorevListesiGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMKurumYoneticisiGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/IYEMKurumYoneticisiGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:IYEMKurumYoneticisiGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <soap:operation soapAction="http://kaysis.gov.tr/IYEMTumYoneticileriGetirWs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:IYEMTumYoneticileriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BBDETSISWS1" type="tns:BBDETSISWS">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/YeniDisYazismaYapanlariGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:YeniDisYazismaYapanlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/TumTip1KodlariGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:TumTip1KodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/TumTip2KodlariGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:TumTip2KodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/TumYerKodlariGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:TumYerKodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/KurumBirimIletisimBilgileriGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:KurumBirimIletisimBilgileriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/AnakurumIletisimBilgileriWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:AnakurumIletisimBilgileriWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/AnaKurumlarButceTurleriGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:AnaKurumlarButceTurleriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/KurumSDPKodlariGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:KurumSDPKodlariGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/DETSISNoKurumBirimWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:DETSISNoKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/KendiTumBirimleriGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:KendiTumBirimleriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/HiyerarsiGetirKurumBirimWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:HiyerarsiGetirKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/AdaGoreKurumBirimSorgulaWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:AdaGoreKurumBirimSorgulaWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/AnaKurumlariGetirKurumBirimWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:AnaKurumlariGetirKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/DetayBilgilereGoreSorgulaKurumBirimWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:DetayBilgilereGoreSorgulaKurumBirimWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <soap12:operation soapAction="http://kaysis.gov.tr/KEPAdresiKontrolEt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:KEPAdresiKontrolEtBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KEPAdresleriniGetir">
      <soap12:operation soapAction="http://kaysis.gov.tr/KEPAdresleriniGetir" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:KEPAdresleriniGetirBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <soap12:operation soapAction="http://kaysis.gov.tr/AktifKEPAdresleriniGetir" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:AktifKEPAdresleriniGetirBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="eYazismaPaketi">
      <soap12:operation soapAction="http://kaysis.gov.tr/eYazismaPaketi" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:eYazismaPaketiBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KutukNodanDetsisNoGetir">
      <soap12:operation soapAction="http://kaysis.gov.tr/KutukNodanDetsisNoGetir" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:KutukNodanDetsisNoGetirBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/DetsisIslemYetkilisiBilgileriWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:DetsisIslemYetkilisiBilgileriWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <soap12:operation soapAction="http://kaysis.gov.tr/AltKurulusBirimleriListele" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:AltKurulusBirimleriListeleBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/IYEMTCdenGorevListesiGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:IYEMTCdenGorevListesiGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/IYEMYoneticiIDdenGorevListesiGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:IYEMYoneticiIDdenGorevListesiGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMKurumYoneticisiGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/IYEMKurumYoneticisiGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:IYEMKurumYoneticisiGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <soap12:operation soapAction="http://kaysis.gov.tr/IYEMTumYoneticileriGetirWs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:IYEMTumYoneticileriGetirWsBbServiceAuthentication" part="BbServiceAuthentication" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DETSISServisHttpGet" type="tns:DETSISServisHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <http:operation location="/YeniDisYazismaYapanlariGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <http:operation location="/TumTip1KodlariGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <http:operation location="/TumTip2KodlariGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <http:operation location="/TumYerKodlariGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <http:operation location="/KurumBirimIletisimBilgileriGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <http:operation location="/AnakurumIletisimBilgileriWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <http:operation location="/AnaKurumlarButceTurleriGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <http:operation location="/KurumSDPKodlariGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <http:operation location="/DETSISNoKurumBirimWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <http:operation location="/KendiTumBirimleriGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <http:operation location="/HiyerarsiGetirKurumBirimWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <http:operation location="/AdaGoreKurumBirimSorgulaWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <http:operation location="/AnaKurumlariGetirKurumBirimWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <http:operation location="/DetayBilgilereGoreSorgulaKurumBirimWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <http:operation location="/KEPAdresiKontrolEt" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <http:operation location="/AktifKEPAdresleriniGetir" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <http:operation location="/DetsisIslemYetkilisiBilgileriWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <http:operation location="/AltKurulusBirimleriListele" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <http:operation location="/IYEMTCdenGorevListesiGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <http:operation location="/IYEMYoneticiIDdenGorevListesiGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <http:operation location="/IYEMTumYoneticileriGetirWs" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DETSISServisHttpPost" type="tns:DETSISServisHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="YeniDisYazismaYapanlariGetirWs">
      <http:operation location="/YeniDisYazismaYapanlariGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip1KodlariGetirWs">
      <http:operation location="/TumTip1KodlariGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumTip2KodlariGetirWs">
      <http:operation location="/TumTip2KodlariGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TumYerKodlariGetirWs">
      <http:operation location="/TumYerKodlariGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumBirimIletisimBilgileriGetirWs">
      <http:operation location="/KurumBirimIletisimBilgileriGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnakurumIletisimBilgileriWs">
      <http:operation location="/AnakurumIletisimBilgileriWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlarButceTurleriGetirWs">
      <http:operation location="/AnaKurumlarButceTurleriGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KurumSDPKodlariGetirWs">
      <http:operation location="/KurumSDPKodlariGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DETSISNoKurumBirimWs">
      <http:operation location="/DETSISNoKurumBirimWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KendiTumBirimleriGetirWs">
      <http:operation location="/KendiTumBirimleriGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HiyerarsiGetirKurumBirimWs">
      <http:operation location="/HiyerarsiGetirKurumBirimWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdaGoreKurumBirimSorgulaWs">
      <http:operation location="/AdaGoreKurumBirimSorgulaWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AnaKurumlariGetirKurumBirimWs">
      <http:operation location="/AnaKurumlariGetirKurumBirimWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetayBilgilereGoreSorgulaKurumBirimWs">
      <http:operation location="/DetayBilgilereGoreSorgulaKurumBirimWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KEPAdresiKontrolEt">
      <http:operation location="/KEPAdresiKontrolEt" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AktifKEPAdresleriniGetir">
      <http:operation location="/AktifKEPAdresleriniGetir" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DetsisIslemYetkilisiBilgileriWs">
      <http:operation location="/DetsisIslemYetkilisiBilgileriWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AltKurulusBirimleriListele">
      <http:operation location="/AltKurulusBirimleriListele" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTCdenGorevListesiGetirWs">
      <http:operation location="/IYEMTCdenGorevListesiGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMYoneticiIDdenGorevListesiGetirWs">
      <http:operation location="/IYEMYoneticiIDdenGorevListesiGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IYEMTumYoneticileriGetirWs">
      <http:operation location="/IYEMTumYoneticileriGetirWs" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="DETSISServis">
    <wsdl:port name="BBDETSISWS" binding="tns:BBDETSISWS">
      <soap:address location="https://bbws.kaysis.gov.tr/DETSISServis.asmx" />
    </wsdl:port>
    <wsdl:port name="BBDETSISWS1" binding="tns:BBDETSISWS1">
      <soap12:address location="https://bbws.kaysis.gov.tr/DETSISServis.asmx" />
    </wsdl:port>
    <wsdl:port name="DETSISServisHttpGet" binding="tns:DETSISServisHttpGet">
      <http:address location="https://bbws.kaysis.gov.tr/DETSISServis.asmx" />
    </wsdl:port>
    <wsdl:port name="DETSISServisHttpPost" binding="tns:DETSISServisHttpPost">
      <http:address location="https://bbws.kaysis.gov.tr/DETSISServis.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>