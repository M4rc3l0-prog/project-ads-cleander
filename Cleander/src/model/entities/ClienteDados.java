package model.entities;


public class ClienteDados {
	private String nome;
	private String email;
	private String cidade;
	private String endereco;
	private String complemento;
	private String telefone;
	private String comodos;
		
	
	public ClienteDados(String nome,String email, String cidade, String endereco, String complemento, String telefone, String comodos) {
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.endereco = endereco;
		this.complemento = complemento;
		this.telefone = telefone;
		this.comodos = comodos;
	}
	
	public ClienteDados() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getComodos() {
		return comodos;
	}
	public void setComodos(String comodos) {
		this.comodos = comodos;
	}

	
}