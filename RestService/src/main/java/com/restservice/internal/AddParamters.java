/**
 * 
 */
package com.restservice.internal;

import java.io.Serializable;

/**
 * @author ndass
 *
 */
public class AddParamters implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4789440006264676589L;

	private Integer a;
	
	private Integer b;

	/**
	 * @return the a
	 */
	public Integer getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Integer a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Integer getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(Integer b) {
		this.b = b;
	}
	
}
