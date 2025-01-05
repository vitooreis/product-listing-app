package model;

public class Product {
	
	private String name;
	private String description;
	private double value;
	private boolean available;
	
	public Product(String name, String description, double value, boolean available) {
		this.name = name;
		this.description = description;
		this.value = value;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getValue() {
		return value;
	}

	public boolean isAvailable() {
		return available;
	}
}
