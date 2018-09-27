package br.senac.rn.loja.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.senac.rn.loja.model.Venda;

public class VendaDAO extends GenericDAO<Venda> {
	
	
	public List<Venda> findAll() {
		String sql = "SELECT d FROM Venda d";
		TypedQuery<Venda> query = manager.createQuery(sql, Venda.class);
		return query.getResultList();
	}

	@Override
	public Class<Venda> getClassType() {
		return Venda.class;
	}
}