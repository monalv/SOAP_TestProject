package com.testing.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.11
 * 2014-01-28T15:23:56.257-08:00
 * Generated source version: 2.3.11
 * 
 */
@WebService(targetNamespace = "http://ws.testing.com/", name = "CalcSEI")
@XmlSeeAlso({ObjectFactory.class})
public interface CalcSEI {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "Multiply", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.Multiply")
    @WebMethod(operationName = "Multiply")
    @ResponseWrapper(localName = "MultiplyResponse", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.MultiplyResponse")
    public java.lang.String multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "Add", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.Add")
    @WebMethod(operationName = "Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.AddResponse")
    public java.lang.String add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.Subtract")
    @WebMethod(operationName = "Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.SubtractResponse")
    public java.lang.String subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "Divide", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.Divide")
    @WebMethod(operationName = "Divide")
    @ResponseWrapper(localName = "DivideResponse", targetNamespace = "http://ws.testing.com/", className = "com.testing.ws.DivideResponse")
    public java.lang.String divide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}
