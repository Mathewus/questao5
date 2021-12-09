package gui;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	
	private Button butaum;
	
	@FXML
	
	private Button butaumzinho;
	
	@FXML
	
	private TextField Nome;
	
	@FXML
	
	private TextField Sobrenome;
	
	
	@FXML
	public void botaosafe() {
			
		funcionario pessoa = new funcionario();
		
		pessoa.setNome(Nome.getText());
		pessoa.setSobrenome(Sobrenome.getText());
		
		
		System.out.println("Logado!!");
		System.out.println("Seja Bem Vindo!!");
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("Sobrenome: "+pessoa.getSobrenome());
		
	
	}
	@FXML
	
	public void botaooff() {
		
		System.out.println("Login off");
		
	
	}
	
	
}
