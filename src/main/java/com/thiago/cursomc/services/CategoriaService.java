package com.thiago.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cursomc.domain.Categoria;
import com.thiago.cursomc.repositories.CategoriaRepository;
import com.thiago.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		// Se nao achar o objeto 'id', lanca uma exception.
		// foi usado uma expressao Lambda. 
		// '()' a funcao nao recebe parametros
		return obj.orElseThrow( () -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: "+ id +", Tipo: " + Categoria.class.getName()));
	}
}
