package ViewController;

import DAO.UsuarioDAO;
import Model.User;
import View.TelaLogin;
import View.TelaPrincipal;
import ViewController.Helpers.LoginHelps;

public class LoginController {

	private TelaLogin view;
	private LoginHelps helper;


	public LoginController(TelaLogin view) {
		this.view = view;
		this.helper = new LoginHelps (view);
	}
	
	public void showMenssage () {

		System.out.println("Busquei algo do banco de dados");
		
		this.view.exibeMensagem ("Executei o fiz tarefa");
	}
	
	public void loginSystem() {
		
		User usuario = helper.obterModelo();
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		User usuarioAuutenticado = usuarioDao.selectPorNomeESenha(usuario);
		
		if (usuarioAuutenticado != null) {
			TelaPrincipal menu = new TelaPrincipal();
			menu.setVisible(true);
			
		}else {
			view.exibeMensagem("Usuario ou senha invalidos");
		}
			
		
	}
}
