package br.senac.rn.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senac.rn.loja.model.Produto;

public class ProdutoDAO {
	
	public void inserir(Produto produto) {
		ConexaoMariaDB db = new ConexaoMariaDB();		
		String SQL = "INSERT INTO tb_produtos (pro_nome, pro_descricao, pro_preco, pro_quantidade_estoque, "+
		"pro_quantidade_minima, pro_dep_id) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement statement = db.getConexao().prepareStatement(SQL);
			statement.setString(1, produto.getNome());
			statement.setString(2, produto.getDescricao());
			statement.setFloat(3, produto.getPreco());
			statement.setInt(4, produto.getQuantidade_estoque());
			statement.setInt(5, produto.getQuantidade_minima());
//			statement.setInt(6, produto.getMarca_id());
			statement.setInt(7, produto.getDepartamento().getId());
			statement.executeUpdate();
		}catch(SQLException exception){
			System.out.println("ERRO: " + exception.getMessage());			
		}	
		db.fechaConexao();
	}

	public void remover(Produto produto) {
		ConexaoMariaDB db = new ConexaoMariaDB();
		String SQL = "DELETE FROM tb_produtos WHERE pro_id = ?";
		try {
			PreparedStatement statement = db.getConexao().prepareStatement(SQL);
			statement.setInt(1, produto.getId());
			statement.executeUpdate();			
		}catch (SQLException exception){
			System.out.println("ERRO: " + exception.getMessage());			
		}
		db.fechaConexao();
	}
	
	public void editar(Produto produto) {
		ConexaoMariaDB db = new ConexaoMariaDB();
		String SQL = "UPDATE tb_produtos SET pro_nome = ?, pro_descricao = ?, pro_preco = ?, "+
		"pro_quantidade_estoque = ?, pro_quantidade_minima = ? FROM tb_produtos WHERE pro_id = ?";
		try {
			PreparedStatement statement = db.getConexao().prepareStatement(SQL);
			statement.setString(1, produto.getNome());
			statement.setString(2, produto.getDescricao());
			statement.setFloat(3, produto.getPreco());
			statement.setInt(4, produto.getQuantidade_estoque());
			statement.setInt(5, produto.getQuantidade_minima());
			statement.setInt(8, produto.getId());
			statement.executeUpdate();
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		
		db.fechaConexao();
	}
	
	public List<Produto> buscarTodos() {
		List<Produto> produtos = new ArrayList<Produto>();
		ConexaoMariaDB db = new ConexaoMariaDB();
		String SQL = "SELECT pro_id, pro_nome, pro_descricao, pro_preco, pro_quantidade_estoque, pro_quantidade_minima, "+
		"pro_dep_id FROM tb_produtos left join tb_departamentos on tb_produtos.pro_dep_id = tb_departamentos.dep_id";
		try {
			PreparedStatement statement = db.getConexao().prepareStatement(SQL);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Produto produto = new Produto();
				statement.setInt(1, produto.getId());
				statement.setString(2, produto.getNome());
				statement.setString(3, produto.getDescricao());
				statement.setFloat(4, produto.getPreco());
				statement.setInt(5, produto.getQuantidade_estoque());
				statement.setInt(6, produto.getQuantidade_minima());				
				statement.setInt(8, produto.getDepartamento().getId());		
				produtos.add(produto);				
			}
			db.fechaConexao();
			return produtos;			
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}		
		db.fechaConexao();
		return null;
	}
	
	public Produto bucarPorId(Integer id) {
		Produto produto = new Produto();		
		ConexaoMariaDB db = new ConexaoMariaDB();
		String SQL = "SELECT pro_id, pro_nome, pro_descricao, pro_preco, pro_quantidade_estoque, pro_quantidade_minima, "+
		"pro_dep_id  FROM tb_produtos WHERE prod_id = ?";
		try {
			PreparedStatement statement = db.getConexao().prepareStatement(SQL);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();	
			if (result.next()) {
				statement.setInt(1, produto.getId());
				statement.setString(2, produto.getNome());
				statement.setString(3, produto.getDescricao());
				statement.setFloat(4, produto.getPreco());
				statement.setInt(5, produto.getQuantidade_estoque());
				statement.setInt(6, produto.getQuantidade_minima());
				statement.setInt(8, produto.getDepartamento().getId());	
			}
			db.fechaConexao();
			return produto;
		}catch (SQLException exception) {
			System.out.println("ERRO: " + exception.getMessage());	
		}	
		db.fechaConexao();
		return null;				
	}	

}
