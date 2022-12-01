package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClasseConexao {
	public Connection conexao;
	
	public Connection getConexao() throws Exception{
		String USUARIO = "root";
		String SENHA = "etec";
		String BANCO = "jdbc:mysql://localhost:3306/banco_pessoas";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
	}
}