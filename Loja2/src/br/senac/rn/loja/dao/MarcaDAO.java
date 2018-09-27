package br.senac.rn.loja.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.senac.rn.loja.model.Marca;


public class MarcaDAO extends GenericDAO<Marca> {

	public List<Marca> findAll() {
		String sql = "SELECT d FROM Marca d";
		TypedQuery<Marca> query = manager
				.createQuery(sql, Marca.class);
		return query.getResultList();
	}
	
	@Override
	public Class<Marca> getClassType() {		
		return Marca.class;
	}

}
