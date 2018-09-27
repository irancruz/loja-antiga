package br.senac.rn.loja.testes;

import br.senac.rn.loja.dao.DepartamentoDAO;
import br.senac.rn.loja.dao.MarcaDAO;
import br.senac.rn.loja.dao.ProdutoDAO;
import br.senac.rn.loja.model.Produto;

public class Testa {

	public static void main(String[] args) {
	
	
			Produto produto = new Produto();
			produto.setNome("Camisa");			
			produto.setMarca(new MarcaDAO().findById(1));
			produto.setDepartamento(new DepartamentoDAO().findById(1));			
			
			ProdutoDAO dao = new ProdutoDAO();
			
			dao.insert(produto);
			
			System.out.println(dao.findAll());					
			
	
	}

}

