package ViewController.Helpers;

import Model.User;
import View.TelaLogin;

public class LoginHelps {
	
	private final TelaLogin view;
	
	public LoginHelps (TelaLogin view) {
		this.view = view;
	}
	
	public  User obterModelo() {
		String nome = view.getTfUsuario().getText();
		String senha = view.getPfSenha().getText();
		User modelo = new User(0,nome,senha);
		return modelo;
	}
	
	public void setarModelo(User modelo) {
		String nome = modelo.getName();
		String senha = modelo.getSenha();
		
		view.getTfUsuario().setText(nome);
		view.getPfSenha().setText(senha);
	}
	
	public void limpaTela() {
		view.getTfUsuario().setText(" ");
		view.getPfSenha().setText(" ");
	}

}
