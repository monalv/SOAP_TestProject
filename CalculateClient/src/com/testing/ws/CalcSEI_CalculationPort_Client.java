
package com.testing.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.11
 * 2014-01-28T15:23:56.163-08:00
 * Generated source version: 2.3.11
 * 
 */
public final class CalcSEI_CalculationPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.testing.com/", "CalculationService");

    private CalcSEI_CalculationPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CalculationService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CalculationService ss = new CalculationService(wsdlURL, SERVICE_NAME);
        CalcSEI port = ss.getCalculationPort();  
        
        {
        System.out.println("Invoking multiply...");
        int _multiply_arg0 = 2;
        int _multiply_arg1 = 3;
        java.lang.String _multiply__return = port.multiply(_multiply_arg0, _multiply_arg1);
        System.out.println("multiply.result=" + _multiply__return);


        }
        {
        System.out.println("Invoking add...");
        int _add_arg0 = 2;
        int _add_arg1 = 3;
        java.lang.String _add__return = port.add(_add_arg0, _add_arg1);
        System.out.println("add.result=" + _add__return);


        }
        {
        System.out.println("Invoking subtract...");
        int _subtract_arg0 = 2;
        int _subtract_arg1 = 3;
        java.lang.String _subtract__return = port.subtract(_subtract_arg0, _subtract_arg1);
        System.out.println("subtract.result=" + _subtract__return);


        }
        {
        System.out.println("Invoking divide...");
        int _divide_arg0 = 2;
        int _divide_arg1 = 3;
        java.lang.String _divide__return = port.divide(_divide_arg0, _divide_arg1);
        System.out.println("divide.result=" + _divide__return);


        }

        System.exit(0);
    }

}
