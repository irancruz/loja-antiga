package br.senac.rn.loja.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.senac.rn.loja.model.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> {
	
	
	public List<Cliente> findAll() {
		String sql = "SELECT d FROM Cliente d";
		TypedQuery<Cliente> query = manager.createQuery(sql, Cliente.class);
		return query.getResultList();
	}

	@Override
	public Class<Cliente> getClassType() {
		return Cliente.class;
	}
}
