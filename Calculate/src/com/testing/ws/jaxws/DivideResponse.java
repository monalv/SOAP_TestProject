
package com.testing.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.3.11
 * Tue Jan 28 15:23:07 PST 2014
 * Generated source version: 2.3.11
 */

@XmlRootElement(name = "DivideResponse", namespace = "http://ws.testing.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivideResponse", namespace = "http://ws.testing.com/")

public class DivideResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}
