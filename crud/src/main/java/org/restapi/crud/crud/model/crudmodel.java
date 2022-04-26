package org.restapi.crud.crud.model;

public class crudmodel {
	
	private int id;
	private String month;
	private int payment;
	
	
	public crudmodel() {
	}


	public crudmodel(int id, String month, int payment) {
		super();
		this.id = id;
		this.month = month;
		this.payment = payment;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String Month) {
		this.month = month;
	}


	public int getPayment() {
		return payment;
	}


	public void setPayment(int payment) {
		this.payment = payment;
	}
	

	

}
