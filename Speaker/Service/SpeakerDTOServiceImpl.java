package com.xworkz.Speaker.Service;

import com.xworkz.Speaker.DTO.SpeakerDTO;
import com.xworkz.Speaker.Exceptions.InvalidBrandException;
import com.xworkz.Speaker.Exceptions.InvalidColorException;
import com.xworkz.Speaker.Exceptions.InvalidPriceException;
import com.xworkz.Speaker.Exceptions.InvalidWattValueException;
import com.xworkz.Speaker.DAO.SpeakerDAOImpl;
import com.xworkz.Speaker.DAO.SpeakerDAO;


public class SpeakerDTOServiceImpl implements SpeakerDTOService{
	
	boolean status=true;
	SpeakerDAO dao=new SpeakerDAOImpl();	
	
	public SpeakerDTOServiceImpl() {
		System.out.println("Inside service Implementation");
	}

	public boolean validateWatt(SpeakerDTO dto) throws InvalidBrandException {
		
		if(dto.getBrand().length()<4 || dto.getBrand()==null) {
			InvalidBrandException invalidBrand=new InvalidBrandException("Please enter valid Brand");
		throw invalidBrand;
		}		
		
		if(dto.getColor().isBlank()) {
			InvalidColorException invalidColor=new InvalidColorException("Please enter valid color");
		throw invalidColor;
		}
		
		if(dto.getPrice()==0) {
			InvalidPriceException invalidPrice=new InvalidPriceException("Please enter valid price");
		throw invalidPrice;
		}
		
		if(dto.getWatt()<=10) {
			InvalidWattValueException invalidWatt=new InvalidWattValueException("Please enter valid watt");
		throw invalidWatt;
		}
		return status;
	
	}
}
