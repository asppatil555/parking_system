package com.practice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Parking")

public class UserDetails {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int flat_no;
	
	private String name;
	
	
	private boolean Is_owner;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getFlat_no() {
		return flat_no;
	}


	public void setFlat_no(int flat_no) {
		this.flat_no = flat_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean getIs_owner() {
		return Is_owner;
	}


	public void setIs_owner(boolean is_owner) {
		Is_owner = is_owner;
	}


	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", flat_no=" + flat_no + ", name=" + name + ", Is_owner=" + Is_owner + "]";
	}


	
	
	


}
