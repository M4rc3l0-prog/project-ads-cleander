package model.entities;

public class Agendamento {
	private int id;
	
	private String nome;
	private String servico;
	private String valor;
	private String date;
	private String hora;
	private String descricao;
	
	
	public Agendamento() {
		
	}
	
	

	public Agendamento(int id, String nome, String servico, String valor, String date, String hora, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.servico = servico;
		this.valor = valor;
		this.date = date;
		this.hora = hora;
		this.descricao = descricao;
	}



	public String getDate() {
		return date;
	}

	public String getHora() {
		return hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public String getServico() {
		return servico;
	}



	public String getValor() {
		return valor;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setServico(String servico) {
		this.servico = servico;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}




	
	
	

}
