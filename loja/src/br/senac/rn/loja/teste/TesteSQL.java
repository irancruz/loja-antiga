package br.senac.rn.loja.teste;

import br.senac.rn.loja.dao.DepartamentoDAO;
import br.senac.rn.loja.dao.ProdutoDAO;
import br.senac.rn.loja.model.Departamento;
import br.senac.rn.loja.model.Produto;

public class TesteSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sexo s = new Sexo();
//		s.setNome("MASCULINO");
//		s.setSigla("M");
//		s.setId(1);
		
//		SexoDAO dao = new SexoDAO();
//		dao.editar(s);
//		dao.inserir(s);
		
		//DepartamentoDAO dao = new DepartamentoDAO();
		//System.out.println(dao.bucarPorId(1));
		
		
	Departamento departamento = new DepartamentoDAO().bucarPorId(5);
	Produto produto = new Produto();	
	produto.setNome("Bola de Volei");
	produto.setDescricao("Bola de Volei");
	produto.setQuantidade_estoque(0);
	produto.setQuantidade_minima(0);;	
	produto.setPreco(100f);
	produto.setDepartamento(departamento);
	new ProdutoDAO().inserir(produto);
	}
	

}
