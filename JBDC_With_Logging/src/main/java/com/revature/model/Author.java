package com.revature.model;

import java.util.Objects;

public class Author {

	private int id;
	private String name;
	private String speciality;
	
	
	public Author() {
		super();
		
	}
	public Author(int id, String name, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, speciality);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(speciality, other.speciality);
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", speciality=" + speciality + "]";
	}
	
}
