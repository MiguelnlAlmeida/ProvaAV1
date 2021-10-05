package com.newton.aaw.prova1.Revista;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.newton.aaw.prova1.domain.entity.Revista;
import com.newton.aaw.prova1.domain.repository.RevistaRepository;
import com.newton.aaw.prova1.exception.NotFoundException;

@Service
public class RevistaService {
	
	
	private final RevistaRepository revistaRepository;
	
	public RevistaService(RevistaRepository revistaRepository) {
		this.revistaRepository = revistaRepository;
	}
	
	public Revista create(Revista r) {
		r.setCreatedAt(LocalDateTime.now());
		r.setModifiedAt(LocalDateTime.now());
		
		revistaRepository.save(r);
		
		return r;
	}
	
	public Revista update(String id, Revista r) {
		
		var existing = get(id);
		
		existing.setTitulo(r.getTitulo());
		existing.setEditora(r.getEditora());
		existing.setAno(r.getAno());
		
		existing.setModifiedAt(LocalDateTime.now());
		
		revistaRepository.save(existing);
		
		return existing;
	}
	
	public Revista get(String id) {
		
		var revista = revistaRepository.findById(id);
		
		if (revista.isEmpty()) {
			throw new NotFoundException("Revista with ID " + id + " not found");
			
		}
		
		return revista.get();
	}
	
	public List<Revista> getAll() {
		return revistaRepository.findAll();
		
	}
	
	public void delete(String id) {
		get(id);
		
		revistaRepository.deleteById(id);
	}
	
}
