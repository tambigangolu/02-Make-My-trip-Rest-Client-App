package com.tambi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tambi.requestbinding.PassengerRequest;
import com.tambi.responsebinding.IrctcResponse;
import com.tambi.service.BookTicketService;


@RestController
public class BookTicketRest {
	
	@Autowired
	private BookTicketService bookTicketService;
	
	@PostMapping("bookticket")
	public IrctcResponse bookTicketApi(@RequestBody PassengerRequest request) {
		
		IrctcResponse ticket = bookTicketService.bookTicket(request);
		
		return ticket;
		
	}

}
