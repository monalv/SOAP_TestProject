
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

@XmlRootElement(name = "Subtract", namespace = "http://ws.testing.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subtract", namespace = "http://ws.testing.com/", propOrder = {"arg0", "arg1"})

public class Subtract {

    @XmlElement(name = "arg0")
    private int arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}
