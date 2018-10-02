package br.senac.rn.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.senac.rn.loja.service.MarcaService;


//Se refere a uma ou varias paginas


@Controller("/")
public class MarcaController {
	
	@Autowired
	private MarcaService service;
	
	@GetMapping("/listar")
	public String listar() {
		return null;
	}

}
