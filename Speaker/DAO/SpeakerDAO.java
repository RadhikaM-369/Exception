package com.xworkz.Speaker.DAO;

import com.xworkz.Speaker.DTO.SpeakerDTO;

public interface SpeakerDAO {
	
public void saveSpeakerDto(SpeakerDTO dto);
public void display();
public void deleteByBrand(String brand);
public void updateByBrand(String brand, int newPrice);
public void updateWattByBrand(String brand,int newWatt);

}
