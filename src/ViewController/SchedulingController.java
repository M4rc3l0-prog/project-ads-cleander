package ViewController;

import java.util.ArrayList;

import DAO.AgendamentoDAO;
import DAO.ClienteDAO;
import DAO.ServicoDAO;
import Model.Client;
import Model.Scheduling;
import Model.Service;
import View.TelaAgendar;
import ViewController.Helpers.SchedulingHelper;

public class SchedulingController {
	private final TelaAgendar view;
	private final SchedulingHelper helper;
	
	public SchedulingController (TelaAgendar view) {
		this.view = view;
		this.helper = new SchedulingHelper (view);
	}
	
	
	public void atualizarTabela() {
		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Scheduling> agendamento = agendamentoDAO.selectAll();
		
		helper.preecherTabela(agendamento);
		
	}
	
	 public void atualizaCliente() {
		 ClienteDAO clienteDAO = new ClienteDAO();
		 ArrayList<Client> clientes= clienteDAO.selectAll();
		 
		 helper.preencherClientes(clientes);
	 }
	 
	 public void atualizaServico() {
		 ServicoDAO servicoDAO = new ServicoDAO();
		 ArrayList<Service> servicos= servicoDAO.selectAll();
		 
		 helper.preencherServico(servicos);
	 }


}
