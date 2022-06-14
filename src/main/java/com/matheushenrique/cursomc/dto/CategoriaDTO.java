package com.matheushenrique.cursomc.dto;

import java.io.Serializable;

import com.matheushenrique.cursomc.domain.Categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public CategoriaDTO(Categoria categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
	}
	
}
