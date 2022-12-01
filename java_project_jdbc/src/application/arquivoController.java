package application;

import java.sql.Connection;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class arquivoController {

	@FXML 
	private TextField campo;
	
	@FXML
	private Button botao;
	
	@FXML
	private Label texto;
	
	@FXML
	private Connection minhaConexao;
	
	double idade;
	
	String nome = "Carlin";
	double renda = 12345;
	
	public void receberIdade() throws Exception {
		idade = Double.parseDouble(campo.getText());
		
		if(idade >= 18) {
			texto.setText("Maior de idade!!");
			ClasseConexao acesso = new ClasseConexao();
			Connection minhaConexao = acesso.getConexao();
			String insert_sql = "INSERT INTO tabela_pessoas VALUES (id, 'Carlos', 1.2)";
			Statement pronto = minhaConexao.createStatement();
			pronto.executeUpdate(insert_sql);
		}else{
			texto.setText("Menor de idade!");
		}
	}
	
	
}
