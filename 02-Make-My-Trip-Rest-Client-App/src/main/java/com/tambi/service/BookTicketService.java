package com.tambi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tambi.requestbinding.PassengerRequest;
import com.tambi.responsebinding.IrctcResponse;

@Service
public class BookTicketService {
	
	public IrctcResponse bookTicket(PassengerRequest request) {
		
		String endpointUrl="http://localhost:9797/book";
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<IrctcResponse> entity = template.postForEntity(endpointUrl, request, IrctcResponse.class);
		
		IrctcResponse body = entity.getBody();
		
		return body;
	}

}
