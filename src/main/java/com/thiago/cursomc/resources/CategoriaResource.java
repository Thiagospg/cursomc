package com.thiago.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.cursomc.domain.Categoria;
import com.thiago.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	// Instancia automaticamente o objeto
	@Autowired
	private CategoriaService service;

	// O endpoint será "/categorias + /{id}"
	// O id fica entre chaves pois representa um parâmetro

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)

	// ResponseEntity retorna um Http
	// @PathVariable para dizer ao spring que o parâmetro receberá o "{id}

	public ResponseEntity<?> find(@PathVariable Integer id) {

		Categoria obj = service.buscar(id);

		return ResponseEntity.ok().body(obj);
	}

}
