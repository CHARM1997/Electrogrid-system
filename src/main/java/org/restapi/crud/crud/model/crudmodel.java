package org.restapi.crud.crud.model;

public class crudmodel {
	
	private String name;
	private int pass;
	
	
	public crudmodel() {
	}
	
	public crudmodel(String name, int pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	
	

}
