package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// ABSTRACT = EVITA INSTANCIAÇÃO
abstract public class People {
	
	//PROTECTED = PERMITE O ACESSO POR HERANÇA
	protected int id;
	protected String name;
	protected char sexo;
	protected Date dtnascimento;
	protected String telefone;
	protected String email;
	protected String rg;

	
	
	public People(int id, String name) {

		this.id = id;
		this.name = name;
	}



	public People(int id, String name, char sexo, String dtnascimento, String telefone, String email, String rg) {
		super();
		this.id = id;
		this.name = name;
		this.sexo = sexo;
		try {
			this.dtnascimento  = new SimpleDateFormat("dd/MM/yyyy").parse(dtnascimento	);
		} catch (ParseException e) {
			
			e.printStackTrace();
		};
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public Date getDtnascimento() {
		return dtnascimento;
	}



	public void setDtnascimento(Date dtnascimento) {
		this.dtnascimento = dtnascimento;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	

}
