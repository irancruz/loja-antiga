package br.senac.rn.loja.dao;

import java.util.ArrayList;
import java.util.List;

import br.senac.rn.loja.model.Departamento;

public class DepartamentoDAO {

	private List<Departamento> departamentos = new ArrayList<>();
	
	public void inserir(Departamento departamento) {
		departamentos.add(departamento);
	};
	
	public void remover(Departamento departamento) {
		departamentos.remove(departamento);
	};
	
	public void editar(Departamento departamento) {
		departamentos.set(departamentos.indexOf(departamento), departamento);
	};
	public List<Departamento> buscarTodos() {		
		return departamentos;
	};
	public Departamento buscarId(Integer id) {
		for (Departamento departamento : departamentos) {
			if (id == departamento.getId()) {
				return departamento;
			}
		}
		return null;
	};
	public Departamento buscarNome(String nome) {
		for (Departamento departamento : departamentos) {
			if (departamento.getNome().equals(nome)) {
				return departamento;
			}				
		}
		return null;
	};
	public Departamento buscarSigla(String sigla) {
		for (Departamento departamento : departamentos) {
			if (departamento.getSigla().equals(sigla)) {
				return departamento;
			}
		}
		return null;
	}
}
