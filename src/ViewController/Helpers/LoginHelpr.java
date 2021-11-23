package ViewController.Helpers;

import Model.User;
import View.TelaLogin;

public class LoginHelpr  implements IHelper{
	
	private final TelaLogin view;
	
	public LoginHelpr (TelaLogin view) {
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

	@Override
	public Object obeterModelo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void limparTela() {
		// TODO Auto-generated method stub
		
	}

}
