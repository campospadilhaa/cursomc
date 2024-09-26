package com.andersonpadilha.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andersonpadilha.cursomc.domain.Categoria;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	public String requestMethodName(@RequestParam String param) {
		return new String();
	}

	@GetMapping
	public List<Categoria> listar() {

		Categoria categoria1 = new Categoria(1, "Informática");
		Categoria categoria2 = new Categoria(2, "Escritório");

		List<Categoria> listaCategoria = new ArrayList<Categoria>();
			listaCategoria.add(categoria1);
			listaCategoria.add(categoria2);

		return listaCategoria;
	}
}