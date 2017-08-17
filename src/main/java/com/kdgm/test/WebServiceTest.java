package com.kdgm.test;

import com.kdgm.handler.TokenHandler;
import com.kdgm.webservice.BBDETSISWS;
import com.kdgm.webservice.DETSISServis;
import com.kdgm.webservice.KepBilgileriWs;
import com.kdgm.webservice.SonuclarOOfKepBilgileriWs;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramazan.cesur on 17.08.2017.
 */
public class WebServiceTest {
    public static void main(String[] args) {

        DETSISServis paymentService = new DETSISServis();
        final TokenHandler tokenHandler = new TokenHandler();
        paymentService.setHandlerResolver(new HandlerResolver() {
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler>handlerList = new ArrayList<Handler>();
                handlerList.add((Handler) tokenHandler);
                return handlerList;
            }
        });


        BBDETSISWS paymentWebServiceImp = paymentService.getBBDETSISWS();

        SonuclarOOfKepBilgileriWs  kepBllgisi = paymentWebServiceImp.aktifKEPAdresleriniGetir();


        List<KepBilgileriWs> lstKep=kepBllgisi.getSonuclar().getKepBilgileriWs();

        for (KepBilgileriWs kepBilgileriWs:lstKep){
            System.out.println(kepBilgileriWs.getKepAdresi());
        }
    }
}
