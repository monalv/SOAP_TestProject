package com.testing.ws;

import javax.jws.WebService;

@WebService(name = "CalcSEI", targetNamespace = "http://ws.testing.com/")
public interface CalcSEI {

	public String Add(int a, int b);

	public String Subtract(int a, int b);

	public String Multiply(int a, int b);

	public String Divide(int a, int b);

}