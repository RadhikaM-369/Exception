package com.xworkz.Helmet.Service;

import com.xworkz.Helmet.DTO.HelmetDto;
import com.xworkz.Helmet.Exception.InvalidBrand;

public interface HelmetServiceInterface {
	
	public void validateSave(HelmetDto dto) throws InvalidBrand;

}
