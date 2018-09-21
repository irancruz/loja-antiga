package br.senac.rn.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senac.rn.loja.model.Departamento;

public class DepartamentoDAO {

	public void inserir(Departamento departamento) {
		ConexaoMariaDB db = new ConexaoMariaDB();		
		String SQL = "INSERT INTO tb_departamentos (dep_nome, dep_sigla, dep_desconto) VALUES (?, ?, ?)";
		try {
			PreparedStatement statement = db.getConexao().prepareStatement(SQL);
			statement.setString(1, departamento.getNome());
			statement.setString(2, departamento.getSigla());
			statement.setFloat(3, departamento.getDesconto());
			statement.executeUpdate();
		}catch(SQLException exception){
			System.out.println("ERRO: " + exception.getMessage());			
		}		
		db.fechaConexao();
	}

	public void remover(Departamento departamento) {
		ConexaoMariaDB db = new ConexaoMariaDB();		
		String SQL = "DELETE FROM tb_departamentos WHERE dep_id = ?";
		try {
			PreparedStatement statement =  db.getConexao().prepareStatement(SQL);
			statement.setInt(1, departamento.getId());
			statement.executeUpdate();			
		}catch (SQLException exception){
			System.out.println("ERRO: " + exception.getMessage());			
		}	
		db.fechaConexao();
	}
	
	public void editar(Departamento departamento) {
		ConexaoMariaDB db = new ConexaoMariaDB();		
		String SQL = "UPDATE tb_departamentos SET dep_nome = ?, dep_sigla = ?, dep_desconto WHERE dep_id = ?";
		try {
			PreparedStatement statement =  db.getConexao().prepareStatement(SQL);
			statement.setString(1, departamento.getNome());
			statement.setString(2, departamento.getSigla());
			statement.setFloat(3, departamento.getDesconto());			
			statement.setInt(4, departamento.getId());
			statement.executeUpdate();
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		   	
		db.fechaConexao();
	}
	
	public List<Departamento> buscarTodos() {
		ConexaoMariaDB db = new ConexaoMariaDB();		
		List<Departamento> departamentos = new ArrayList<Departamento>();
		String SQL = "SELECT * FROM tb_departamentos";
		try {
			PreparedStatement statement =  db.getConexao().prepareStatement(SQL);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Departamento departamento = new Departamento();
				departamento.setId(result.getInt("dep_id"));
				departamento.setNome(result.getString("dep_nome"));
				departamento.setSigla(result.getString("dep_sigla"));
				departamento.setDesconto(result.getFloat("dep_desconto"));				
				departamentos.add(departamento);				
			}
			db.fechaConexao();
			return departamentos;
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		
		db.fechaConexao();
		return null;
	}
	
	public Departamento bucarPorId(Integer id) {
		ConexaoMariaDB db = new ConexaoMariaDB();		
		Departamento departamento = new Departamento();		
		String SQL = "SELECT * FROM tb_departamentos WHERE dep_id = ?";
		try {
			PreparedStatement statement =  db.getConexao().prepareStatement(SQL);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();	
			if (result.next()) {
				departamento.setId(result.getInt("dep_id"));
				departamento.setNome(result.getString("dep_nome"));
				departamento.setSigla(result.getString("sex_sigla"));	
				departamento.setDesconto(result.getFloat("dep_desconto"));				
			}				
			db.fechaConexao();
			return departamento;
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		
		db.fechaConexao();
		return null;			
	}
	
			
			
			
			
	/*private List<Departamento> departamentos = new ArrayList<>();
	
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
	}*/
}
