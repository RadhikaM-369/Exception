package com.xworkz.Speaker.DTO;

public class SpeakerDTO {
	private String brand;
	private String color;
	private int price;
	private int watt;
	public SpeakerDTO(String brand, String color, int price, int watt) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.watt = watt;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		this.watt = watt;
	}  	}
