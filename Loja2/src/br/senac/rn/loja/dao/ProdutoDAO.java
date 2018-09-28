package br.senac.rn.loja.dao;

import br.senac.rn.loja.model.Produto;

public class ProdutoDAO extends GenericDAO<Produto>{	

	@Override
	public Class<Produto> getClassType() {
		// TODO Auto-generated method stub
		return Produto.class;
	}	

}
