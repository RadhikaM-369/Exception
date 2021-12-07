package com.xworkz.Helmet;

import com.xworkz.Helmet.DTO.HelmetDto;
import com.xworkz.Helmet.Service.HelmetServiceImpl;
import com.xworkz.Helmet.Service.HelmetServiceInterface;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Start");
		HelmetDto helmetDto=new HelmetDto("Vega", 1200, "Black",'W', 10.5);

		HelmetServiceInterface helmetService=new HelmetServiceImpl(); 
		helmetService.validateSave(helmetDto);
		System.out.println("End");
	}

}
