package com.restservice.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "calculator")
public class Calculator implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8583610091357496152L;
	private Integer a;
	private Integer b;
	private Integer c;
	
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
	/**
	 * @return the c
	 */
	public Integer getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(Integer c) {
		this.c = c;
	}

}
