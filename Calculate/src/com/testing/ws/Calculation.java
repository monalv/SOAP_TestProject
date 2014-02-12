package com.testing.ws;

import javax.jws.WebService;
/*
 * Class Calculation has methods to return the results of add,multiply,subtract,divide.
 * Assumption : considering only integer values.
 * */

@WebService(targetNamespace = "http://ws.testing.com/", endpointInterface = "com.testing.ws.CalcSEI", portName = "CalculationPort", serviceName = "CalculationService")
public class Calculation implements CalcSEI {

	public String Add(int a,int b){
		return a+"+"+b+"="+(a+b);
	}
	public String Subtract(int a,int b){
		return a+"-"+b+"="+(a-b);
	}
	public String Multiply(int a,int b){
		return a+"*"+b+"="+(a*b);
	}
	public String Divide(int a,int b){
		if(b!=0){
			float ans = (float)a/b;			
			return a+"/"+b+"="+ans;
		}else return "cannot divide by 0";
	}
}
