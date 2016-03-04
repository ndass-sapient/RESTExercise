package com.restservice.dao;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.restservice.model.Calculator;
import com.soapclient.MathUtility;

public class CalculatorDAO {

	/**
	 * This method interacts with the SOAP service that returns the add result
	 * with the help of generated SOAP client
	 * 
	 * @param calc
	 * @return
	 */
	public Calculator add(Calculator calc) {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setAddress("http://localhost:8080/SoapTest/services/MathUtilityPort");
		factory.setServiceClass(MathUtility.class);

		Object client = factory.create();

		int sum = ((MathUtility) client).addIntegers(calc.getA().intValue(), calc.getB().intValue());
		calc.setC(sum);

		return calc;
	}

}
