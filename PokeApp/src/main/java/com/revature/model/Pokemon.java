package com.revature.model;

public class Pokemon {

	int id; 
	String name;
	String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	public Pokemon(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public Pokemon() {
		super();
	}
	
	
	
	
	
	
	
}
