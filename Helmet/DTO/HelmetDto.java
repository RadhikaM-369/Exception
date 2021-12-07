package com.xworkz.Helmet.DTO;

public class HelmetDto extends Throwable{
	private String brand;
	private int price;
	private  String color;
	private char size;
	private double weight;
	
	public HelmetDto(String brand, int price, String color, char size, double weight) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.weight = weight;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		
		return "Helmet [brand=" +brand+ ", price=" + price + ",color="+ color + ", weight="+ weight+ "]";
	}
}
