package com.xworkz.Speaker;

import com.xworkz.Speaker.DAO.SpeakerDAOImpl;
import com.xworkz.Speaker.DTO.SpeakerDTO;
import com.xworkz.Speaker.Service.SpeakerDTOService;
import com.xworkz.Speaker.Service.SpeakerDTOServiceImpl;

public class Tester {

	public static void main(String[] args) throws Throwable {
		
		SpeakerDTOService speakerservice=new SpeakerDTOServiceImpl();
		
		SpeakerDAOImpl speakerDaoImpl=new SpeakerDAOImpl();
		
		SpeakerDTO sony= new SpeakerDTO("Sony", "black", 15000, 0);
		speakerDaoImpl.saveSpeakerDto(sony);
		
		speakerservice.validateWatt(sony);
		

	}

}
