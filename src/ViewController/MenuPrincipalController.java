package ViewController;

import View.TelaAgendar;
import View.TelaPrincipal;

public class MenuPrincipalController {
	private final MenuPrincipalController view;

	public MenuPrincipalController(MenuPrincipalController view) {

		this.view = view;
	}
	
	public MenuPrincipalController(TelaPrincipal telaPrincipal) {
		this.view = null;
		// TODO Auto-generated constructor stub
	}

	public void navegarAgenda() {
		TelaAgendar agenda =  new TelaAgendar();
		agenda.setVisible(true);
	}
	
	

}
