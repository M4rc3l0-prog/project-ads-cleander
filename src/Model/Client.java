package Model;

import java.util.Date;

public class Client extends People {
	private String endereco;
	private String cep;
	
	
	public Client(int id, String name, char sexo, String dtnascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
		super(id, name, sexo, dtnascimento, telefone, email, rg);
		this.endereco = endereco;
		this.cep = cep;
	}

	public Client(int id, String name, String endereco, String cep) {
		super(id, name);
		this.endereco = endereco;
		this.cep = cep;
		
	}
	

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return getName();
	}
	
	

}
