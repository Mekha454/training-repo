package com.revature.model;

import java.util.List;
import java.util.Objects;

public class Recipe {
	
	private int id;
	private String name;
	private int cookTimeInMinutes;
	private Author author;
	private List<Ingredient> ingredients;
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(int id, String name, int cookTimeInMinutes) {
		super();
		this.id = id;
		this.name = name;
		this.cookTimeInMinutes = cookTimeInMinutes;
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

	public int getCookTimeInMinutes() {
		return cookTimeInMinutes;
	}

	public void setCookTimeInMinutes(int cookTimeInMinutes) {
		this.cookTimeInMinutes = cookTimeInMinutes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, cookTimeInMinutes, id, ingredients, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		return Objects.equals(author, other.author) && cookTimeInMinutes == other.cookTimeInMinutes && id == other.id
				&& Objects.equals(ingredients, other.ingredients) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", cookTimeInMinutes=" + cookTimeInMinutes + ", author=" + author
				+ ", ingredients=" + ingredients + "]";
	}
	
	

}
