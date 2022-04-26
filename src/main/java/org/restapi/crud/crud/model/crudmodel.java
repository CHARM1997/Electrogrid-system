package org.restapi.crud.crud.model;

public class crudmodel {
	
	private int id;
	private String name;
	private int pass;
	
	
	public crudmodel() {
	}


	public crudmodel(int id, String name, int pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
