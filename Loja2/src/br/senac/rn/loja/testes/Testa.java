package br.senac.rn.loja.testes;


import br.senac.rn.loja.dao.MarcaDAO;

public class Testa {

	public static void main(String[] args) {
	
//	
//			Produto produto = new Produto();
//			produto.setNome("Camisa");			
//			produto.setMarca(new MarcaDAO().findById(1));
//			produto.setDepartamento(new DepartamentoDAO().findById(1));			
			
//			ProdutoDAO dao = new ProdutoDAO();
//			
//			dao.insert(produto);

		
		System.out.println(new MarcaDAO().findAll());		
	
	}

}

