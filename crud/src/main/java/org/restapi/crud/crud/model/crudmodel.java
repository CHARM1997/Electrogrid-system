package org.restapi.crud.crud.model;

public class crudmodel {
	
	private int id;
	private String unit;
	private int cost;
	
	
	public crudmodel() {
	}


	public crudmodel(int id, String unit, int cost) {
		super();
		this.id = id;
		this.unit = unit;
		this.cost = cost;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
	

	

}
