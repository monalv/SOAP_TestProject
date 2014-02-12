package com.testing.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.11
 * 2014-01-28T15:23:56.269-08:00
 * Generated source version: 2.3.11
 * 
 */
@WebServiceClient(name = "CalculationService", 
                  wsdlLocation = "http://localhost/Calculate/services/CalculationPort?wsdl",
                  targetNamespace = "http://ws.testing.com/") 
public class CalculationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.testing.com/", "CalculationService");
    public final static QName CalculationPort = new QName("http://ws.testing.com/", "CalculationPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost/Calculate/services/CalculationPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost/Calculate/services/CalculationPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalculationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalculationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalculationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CalcSEI
     */
    @WebEndpoint(name = "CalculationPort")
    public CalcSEI getCalculationPort() {
        return super.getPort(CalculationPort, CalcSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcSEI
     */
    @WebEndpoint(name = "CalculationPort")
    public CalcSEI getCalculationPort(WebServiceFeature... features) {
        return super.getPort(CalculationPort, CalcSEI.class, features);
    }

}