package Model;

import java.util.Date;

public class User extends People {


	protected String senha;
	protected String nivelAcesso;
	
	public User(int id, String name, String senha) {
		super(id, name);
		this.senha = senha;
	
	}
	
	public User(int id, String name, char sexo, String dtnascimento, String Telefone, String email, String rg, String senha, String nivelAcesso) {
		super(id, name, sexo, dtnascimento, Telefone, email, rg);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNivelAcesso() {
		return nivelAcesso;
	}


	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
