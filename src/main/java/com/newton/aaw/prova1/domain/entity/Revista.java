package com.newton.aaw.prova1.domain.entity;

import java.time.LocalDateTime;

import com.newton.aaw.prova1.api.RevistaDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Revista {

	private String id;
	
	private String titulo;
	
	private String editora;
	
	private Integer ano;
	
	private Integer mes;
	
	private Integer status;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	public Revista(RevistaDto revistaDto) {
		this.id = revistaDto.getId();
		this.titulo = revistaDto.getTitulo();
		this.editora = revistaDto.getEditora();
		this.ano = revistaDto.getAno();
		this.mes = revistaDto.getMes();
		
		
	}
	
	
}