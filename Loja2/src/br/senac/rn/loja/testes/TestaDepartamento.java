package br.senac.rn.loja.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.senac.rn.loja.model.Departamento;

public class TestaDepartamento {

	public static void main(String[] args) {
		Departamento departamento = new Departamento();
		departamento.setNome("Padaria");
		departamento.setSigla("PDR");
		departamento.setDesconto(0.2f);
		departamento.setFone("843232255");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConexaoDB");
		EntityManager manager = factory.createEntityManager();
		
/*		manager.getTransaction().begin();
		manager.persist(departamento);
		manager.getTransaction().commit();
*/		
		System.out.println(manager.find(Departamento.class, 1));
				
		manager.clear();
		factory.close();
	}

}
