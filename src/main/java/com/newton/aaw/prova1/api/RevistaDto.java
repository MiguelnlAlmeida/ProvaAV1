package com.newton.aaw.prova1.api;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.newton.aaw.prova1.domain.entity.Revista;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RevistaDto {
	
	
	@Id
	private String id;
	
	private String titulo;
	
	private String editora;
	
	private Integer ano;
	
	private Integer mes;
	
	private Integer status;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	public RevistaDto(Revista r) {
		this.id = r.getId();
		this.titulo = r.getTitulo();
		this.editora = r.getEditora();
		this.ano = r.getAno();
		this.mes = r.getMes();
		this.status = r.getStatus();
		this.createdAt = r.getCreatedAt();
		this.modifiedAt = r.getModifiedAt();
		
	}

}
