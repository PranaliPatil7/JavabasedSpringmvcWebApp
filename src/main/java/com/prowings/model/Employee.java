package com.prowings.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	int id;
	@Column
	String name;
	@Column
	int phone;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String name, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", id=" + id + "]";
	}
	
	

}
