package br.senac.rn.loja.testes;

import br.senac.rn.loja.dao.DepartamentoDAO;
import br.senac.rn.loja.model.Departamento;

public class TestaDepartamento {

	public static void main(String[] args) {
		Departamento departamento = new Departamento();
		departamento.setNome("Eletrodomestico");
		departamento.setSigla("ELD");
		departamento.setDesconto(0.7f);
		departamento.setFone("843232255");
		
		DepartamentoDAO dao = new DepartamentoDAO();
		
		dao.insert(departamento);
		
		System.out.println(dao.findAll());
				
		
	}

}
