package com.restservice.internal;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.restservice.RestService;
import com.restservice.dao.CalculatorDAO;
import com.restservice.model.Calculator;

public class RestServiceImpl implements RestService {

	@Autowired
	private CalculatorDAO calculatorDAO;

	@Override
	public Response add(AddParamters params) {
		Calculator calc = new Calculator();
		calc.setA(params.getA());
		calc.setB(params.getB());

		return Response.ok(calculatorDAO.add(calc)).build();
	}

}
