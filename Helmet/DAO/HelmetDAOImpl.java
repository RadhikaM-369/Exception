package com.xworkz.Helmet.DAO;

import com.xworkz.Helmet.DTO.HelmetDto;

public class HelmetDAOImpl implements HelmetDAOInterface{
HelmetDto helmets[]=new HelmetDto[5];
static int index=0;

	
	public HelmetDAOImpl() {
	System.out.println("Inside helmet Dao impl");
}


	public void save(HelmetDto dto) {
	System.out.println("Inside helmet Dao impl");	
	helmets[index]=dto;	
	}

	
	public void display() {
		System.out.println("Display helmet information");
		for (int i = 0; i < helmets.length; i++) {
			System.out.println(helmets[i].getBrand());
			System.out.println(helmets[i].getColor());
			System.out.println(helmets[i].getPrice());
			System.out.println(helmets[i].getSize());
			System.out.println(helmets[i].getWeight());
		}
	}

}
