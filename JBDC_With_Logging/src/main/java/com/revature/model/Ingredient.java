package com.revature.model;

import java.util.Objects;

public class Ingredient {

	private int id;
	private String name;
	private String flavor;
	private float cost;
	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingredient(int id, String name, String flavor, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.flavor = flavor;
		this.cost = cost;
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
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, flavor, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredient other = (Ingredient) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost) && Objects.equals(flavor, other.flavor)
				&& id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", flavor=" + flavor + ", cost=" + cost + "]";
	}
	
	
}
