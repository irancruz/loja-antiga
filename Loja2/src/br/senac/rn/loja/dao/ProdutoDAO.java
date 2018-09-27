package br.senac.rn.loja.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.senac.rn.loja.model.Produto;

public class ProdutoDAO extends GenericDAO<Produto>{	
	
	public List<Produto> findAll() {
		String sql = "SELECT d FROM Produto d";
		TypedQuery<Produto> query = manager.createQuery(sql, Produto.class);
		return query.getResultList();
	}

	@Override
	public Class<Produto> getClassType() {
		// TODO Auto-generated method stub
		return Produto.class;
	}	

}
