package com.utd.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utd.agenda.model.Cliente;
import com.utd.agenda.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repository;
	
	public Cliente buscarClientePeloId(Long id) {
		
		return repository.findById(id).orElse(null);
	}
	
}
