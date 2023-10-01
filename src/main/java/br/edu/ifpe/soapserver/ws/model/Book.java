package br.edu.ifpe.soapserver.ws.model;

import java.io.Serializable;

public class Book implements Serializable {

	/**
	 * 
	 */
	public Book() {
		super();
	}

	private static final long serialVersionUID = 8781380276470125527L;

	private String title;
	private String code;
	private double cost;

	public Book(String title, String code, double cost) {
		super();
		this.title = title;
		this.code = code;
		this.cost = cost;
	}

	public Book(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "> " + this.title + " (R$" + this.cost + ") " + this.code;
	}

}
