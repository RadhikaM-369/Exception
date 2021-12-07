package com.xworkz.Speaker.DAO;
 
import com.xworkz.Speaker.DTO.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO{
	
	SpeakerDTO s[]=new SpeakerDTO[5];
	int index=0;

	public void saveSpeakerDto(SpeakerDTO dto) {
		s[index]=dto;	
		index++;
	}

	public void display() {
		for (int i = 0; i < s.length; i++) {
		if(s[i]!=null)	{
			System.out.println(s[i].getBrand());
			System.out.println(s[i].getColor());
			System.out.println(s[i].getPrice());
			System.out.println(s[i].getWatt());
		}		}		}

	public void deleteByBrand(String brand) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].getBrand().equals(brand)) {
				s[i]=null;
			} 	}  	}

	public void updateByBrand(String brand, int newPrice) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].getBrand().equals(brand)) {
				s[i].setPrice(newPrice);
			}	}	}

	public void updateWattByBrand(String brand, int newWatt) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].getBrand().equals(brand)) {
				s[i].setWatt(newWatt);
			}
		}		
	}

}
