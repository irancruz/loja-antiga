package br.senac.rn.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMariaDB {
	
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
				
		private Connection connection;
		
		public ConexaoMariaDB() {
			try {
				Class.forName(DRIVER);
				this.connection = DriverManager.getConnection(URL, USUARIO, SENHA);
				System.out.println("Conexao aberta");
			} catch (ClassNotFoundException exception) {
				System.out.println("DRIVER NAO ENCONTRADO!!!");
			} catch (SQLException exception) {
				System.out.println("PROBLEMAS COM A CONEXAO!!!");
				this.connection = null;
			}
		}	
				
		public Connection getConexao() {
			return this.connection;
		}
		
		public void fechaConexao() {
			try {
				this.connection.close();
				System.out.println("Conexao encerrada");
			} catch (SQLException exception) {
				System.out.println("ERRO: " + exception.getMessage());
			}
		}		
}
