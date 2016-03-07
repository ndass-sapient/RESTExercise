/**
 * 
 */
package com.restservice.dao.runner;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.restservice.dao.CalculatorDAO;
import com.restservice.model.Calculator;

/**
 * @author ndass
 *
 */
public class CalculatorDAOTest {

	private Calculator params;
	private CalculatorDAO calculatorDAO;

	@Before
	public void setUp() {
		calculatorDAO = new CalculatorDAO();
		params = new Calculator();
		params.setA(88);
		params.setB(76);
	}

	@Test
	public void testRestService() {
		Calculator res = calculatorDAO.add(params);
		assertEquals(new Integer(88 + 76), res.getC());
	}

}
