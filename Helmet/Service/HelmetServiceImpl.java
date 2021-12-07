package com.xworkz.Helmet.Service;

import com.xworkz.Helmet.DTO.HelmetDto;
import com.xworkz.Helmet.Exception.InvalidBrand;
import com.xworkz.Helmet.Exception.InvalidColor;
import com.xworkz.Helmet.Exception.InvalidPrice;
import com.xworkz.Helmet.Exception.InvalidSize;
import com.xworkz.Helmet.Exception.InvalidWeight;

public class HelmetServiceImpl implements HelmetServiceInterface{

	
	
	public HelmetServiceImpl() {
		System.out.println("Inside the implements Service class");
	}

	public void validateSave(HelmetDto dto) throws InvalidBrand {
		
		if(dto.getBrand()==null || dto.getBrand().length()<2) {
			InvalidBrand invalidBrand=new InvalidBrand("Invalid brand name");
			throw invalidBrand;
		}
		
		if(dto.getColor().isBlank()) {
			InvalidColor invalidColor=new InvalidColor("Invalid color name");
			throw invalidColor;
		}
		
		if(dto.getPrice()==0) {
			InvalidPrice invalidPrice=new InvalidPrice("Invalid price");
			throw invalidPrice;
		}
		//|| dto.getSize()!='L')
		if(!(dto.getSize()=='S' || dto.getSize()=='M' || dto.getSize()=='L'))  {
			InvalidSize invalidSize=new InvalidSize("Invalid size");
			throw invalidSize;
		}
		if(dto.getWeight()==0.0 ) {
			InvalidWeight invalidWeight=new InvalidWeight("not valid weight");
			throw invalidWeight;
		}
	}

}
