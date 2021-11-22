package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Scheduling {
    
    private Integer id;
    private Client cliente;
    private Service servico;
    private float valor;
    private Date data;
    private String observacao;

    public Scheduling(Integer id, Client cliente, Service servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Scheduling(Integer id, Client cliente, Service servico, float valor, String data, String observacao) {
        this(id, cliente,servico,valor,data);
        this.observacao = observacao;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Client getCliente() {
        return cliente;
    }
    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    public Service getServico() {
        return servico;
    }
    public void setServico(Service servico) {
        this.servico = servico;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    } 
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }  
}