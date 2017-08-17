package com.kdgm.handler;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by cesur on 16.4.2016.
 */
@Stateless
public class TokenHandler implements SOAPHandler<SOAPMessageContext>{


    private String username = "";

    private String password = "";

    public TokenHandler() {
    }


    public boolean handleMessage(SOAPMessageContext context) {

     /* Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        Date date = new Date(System.currentTimeMillis());
        System.out.println("PaswordString :" + password);
        String nonce = NonceAndDiggestPassword.buildNonce(date);
        String passDiggest = NonceAndDiggestPassword.buildDiggest(password, nonce, date.toString());


        String passDigestFromUi = "WWO2lPsZ1LoEkANS/JSAzU54VPA=";
        String nonceFromUi = "htu9JGxzcN5HepbQQ4sRQg==";
        String createdFromUi = "2016-04-16T12:46:56.324Z";
        if (outboundProperty.booleanValue()) {
            try {
                *//*** ENVELOPE ***//*
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPFactory factory = null;

                factory = SOAPFactory.newInstance();

                String prefix = "kay";
                String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";


                SOAPElement securityElement =
                        factory.createElement("BbServiceAuthentication", prefix, "");
                securityElement.addAttribute(QName.valueOf("xmlns:wsu"), "\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"");


                SOAPElement tokenElement =
                        factory.createElement("UsernameToken", prefix, uri);
                tokenElement.addAttribute(QName.valueOf("wsu:Id"), "\"UsernameToken-6A22B7A7A68D4A1C7E14608108163245\"");
                tokenElement.addAttribute(QName.valueOf("xmlns:wsu"), "\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"");


                SOAPElement userElem =
                        factory.createElement("Username", prefix, uri);
                userElem.addTextNode(username);
                System.out.println("Username :" + username);

                SOAPElement passwordElement =
                        factory.createElement("Password", prefix, uri);
                //passwordElement.addTextNode(passDiggest);
                passwordElement.addTextNode(passDigestFromUi);
                System.out.println("Password Diggest:" + passDiggest);
                passwordElement.addAttribute(QName.valueOf("Type"), "\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest\"");


                SOAPElement nonceElement =
                        factory.createElement("Nonce", prefix, uri);
                // nonceElement.addTextNode(nonce);
                nonceElement.addTextNode(nonceFromUi);
                System.out.println("Nonce :" + nonce);
                nonceElement.addAttribute(QName.valueOf("EncodingType"), "\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\"");


                SOAPElement createdElement =
                        factory.createElement("Created", "wsu", uri);
                //createdElement.addTextNode(date.toString());
                createdElement.addTextNode(createdFromUi);
                System.out.println("Created :" + createdFromUi);


                tokenElement.addChildElement(userElem);
                tokenElement.addChildElement(passwordElement);
                tokenElement.addChildElement(nonceElement);
                tokenElement.addChildElement(createdElement);
                securityElement.addChildElement(tokenElement);
                if (envelope.getHeader() != null) {
                    envelope.getHeader().detachNode();
                }
                SOAPHeader header = envelope.addHeader();
                header.addChildElement(securityElement);
            } catch (Exception ex) {
                ex.printStackTrace();
                return false;
            }

        }
        else {

        }*/

        try {
            SOAPMessage message = context.getMessage();

            SOAPHeader header = message.getSOAPHeader();
            SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
            if (header == null) {
                header = envelope.addHeader();
            }

            QName qNameUserCredentials = new QName("http://kaysis.gov.tr/", "BbServiceAuthentication");
            SOAPHeaderElement userCredentials = header.addHeaderElement(qNameUserCredentials);

            QName qNameUsername = new QName("http://kaysis.gov.tr/", "KurumID");
            SOAPHeaderElement username = header.addHeaderElement(qNameUsername);
            username.addTextNode(this.username);

            QName qNamePassword = new QName("http://kaysis.gov.tr/", "Password");
            SOAPHeaderElement password = header.addHeaderElement(qNamePassword);
            password.addTextNode(this.password);

            userCredentials.addChildElement(username);
            userCredentials.addChildElement(password);

            message.saveChanges();
            //TODO: remove this writer when the testing is finished
            StringWriter writer = new StringWriter();
            message.writeTo(new StringOutputStream(writer));


        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    //TODO: remove this class after testing is finished
    private static class StringOutputStream extends OutputStream {

        private StringWriter writer;

        public StringOutputStream(StringWriter writer) {
            this.writer = writer;
        }

        @Override
        public void write(int b) throws IOException {
            writer.write(b);
        }
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public Set<QName> getHeaders() {
        return new TreeSet<QName>();
    }

    public void close(MessageContext context) {

    }
}
