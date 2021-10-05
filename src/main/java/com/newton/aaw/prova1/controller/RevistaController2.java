package com.newton.aaw.prova1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newton.aaw.prova1.Revista.RevistaService;
import com.newton.aaw.prova1.api.RevistaDto;
import com.newton.aaw.prova1.domain.entity.Revista;

@RestController
public class RevistaController2 {
	
	private final RevistaService revistaService;
	private Revista revista;
	
	public RevistaController2(RevistaService revistaService) {
		this.revistaService = revistaService;
	}

	@GetMapping("/revistas/{id}")
	public RevistaDto getById(@PathVariable String id) {
		var user = revistaService.get(id);
		
		return new RevistaDto(revista);
		
	}
	
	@GetMapping("/revistas")
	public List<RevistaDto> getAll() {
		var revistas = revistaService.getAll();
		
		var revistaDtos = new ArrayList<RevistaDto>();
		
		for (var revista: revistas) {
			revistaDtos.add(new RevistaDto(revista));
		}
		
		return revistaDtos;
		
	}
	
	@PostMapping("/revistas")
	public RevistaDto create(@RequestBody RevistaDto r) {
		var revista = new Revista(r);
		
		revista = revistaService.create(revista);
		
		return new RevistaDto(revista);
		
	}
	
	@PutMapping
	public RevistaDto update(@PathVariable String id, @RequestBody RevistaDto r) {
		var revista = new Revista(r);
		
		revista = revistaService.update(id, revista);
		
		return new RevistaDto(revista);
		
	}
	
	@DeleteMapping("/revistas/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		revistaService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
