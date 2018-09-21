package br.senac.rn.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senac.rn.loja.model.Sexo;

public class SexoDAO {
	
	//ALGUNS DRIVES
	//MariaDB -> org.mariadb.jdbc.Driver
	//MySQL -> com.mysql.cj.jdbc.Driver
	//PostgreSQL -> org.postgresql.Driver
	//MSSQL -> com.microsoft.sqlserver.jdbc.SQLServerDriver
	
	private final String DRIVER = "org.mariadb.jdbc.Driver";
	private final String BANCO = "db_loja_noite";
	private final String URL = "jdbc:mariadb://localhost:3306/" + BANCO;
	private final String USUARIO = "root";
	private final String SENHA = "";
	
	private Connection getConexao() {
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
			return connection;
		}catch (ClassNotFoundException exception) {
			System.out.println("DRIVE NÃO ENCONTRADO!!!");
		}catch (SQLException exception) {
			System.out.println("PROBLEMAS NA CONEXÃO!!!");
		}
		return null;
	}

	public void inserir(Sexo sexo) {
		String sql = "INSERT INTO tb_sexos (sex_nome, sex_sigla) VALUES (?, ?)";
		try {
			PreparedStatement statement = getConexao().prepareStatement(sql);
			statement.setString(1, sexo.getNome());
			statement.setString(2, sexo.getSigla());
			statement.executeUpdate();
		}catch(SQLException exception){
			System.out.println("ERRO: " + exception.getMessage());			
		}	
		
	}

	public void remover(Sexo sexo) {
		String SQL = "DELETE FROM tb_sexos WHERE sex_id = ?";
		try {
			PreparedStatement statement = getConexao().prepareStatement(SQL);
			statement.setInt(1, sexo.getId());
			statement.executeUpdate();			
		}catch (SQLException exception){
			System.out.println("ERRO: " + exception.getMessage());			
		}	
	}
	
	public void editar(Sexo sexo) {
		String SQL = "UPDATE tb_sexos SET sex_nome = ?, sex_sigla = ? WHERE sex_id = ?";
		try {
			PreparedStatement statement = getConexao().prepareStatement(SQL);
			statement.setString(1, sexo.getNome());
			statement.setString(2, sexo.getSigla());
			statement.setInt(3, sexo.getId());
			statement.executeUpdate();
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		   	
	}
	
	public List<Sexo> buscarTodos() {
		List<Sexo> sexos = new ArrayList<Sexo>();
		String SQL = "SELECT * FROM tb_sexos";
		try {
			PreparedStatement statement = getConexao().prepareStatement(SQL);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Sexo sexo = new Sexo();
				sexo.setId(result.getInt("sex_id"));
				sexo.setNome(result.getString("sex_nome"));
				sexo.setSigla(result.getString("sex_sigla"));
				sexos.add(sexo);				
			}
			return sexos;
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		
		return null;
	}
	
	public Sexo bucarPorId(Integer id) {
		Sexo sexo = new Sexo();		
		String SQL = "SELECT * FROM tb_sexos WHERE sex_id = ?";
		try {
			PreparedStatement statement = getConexao().prepareStatement(SQL);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();	
			if (result.next()) {
				sexo.setId(result.getInt("sex_id"));
				sexo.setNome(result.getString("sex_nome"));
				sexo.setSigla(result.getString("sex_sigla"));	
			}						
			return sexo;
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		
		return null;		
		
	}
	
	
}
