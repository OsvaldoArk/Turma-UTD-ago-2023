package com.utd.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utd.agenda.model.Cliente;
import com.utd.agenda.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	ClienteService service;
	
	@RequestMapping("/")
	public String inicio() {
		
		Cliente cliente = service.buscarClientePeloId(1L);
		
		System.out.println(cliente);
		
		return "index";
	}
	
}
