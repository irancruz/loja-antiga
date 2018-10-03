package br.senac.rn.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Marca;
import br.senac.rn.loja.service.MarcaService;

//Se refere a uma ou varias paginas

@Controller
@RequestMapping("/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService service;	
	
/*	@GetMapping("/")
	public String index() {
		return "index";
	}*/
	
	@GetMapping("/lista")
	public String listar(Model model) {
		List<Marca> marcas = service.buscar();
		model.addAttribute("marcas", marcas);
		return "marca/lista";
	}
	
/*	@GetMapping("/listar")
	public String listar() {
		return null;
	}
*/
}
