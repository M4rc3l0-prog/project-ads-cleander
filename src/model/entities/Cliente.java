package model.entities;

public class Cliente {
	private String nome;
	private String email;
	private String endereco;
	private String cidade;
	private String telefone;
	private String sexo;
	
	public Cliente(String nome, String email, String endereco, String cidade, String telefone, String sexo) {
	
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
		this.sexo = sexo;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	

}
