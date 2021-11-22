package ViewController.Helpers;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DAO.ClienteDAO;
import Model.Client;
import Model.Scheduling;
import Model.Service;
import View.TelaAgendar;

public class SchedulingHelper {
	
	private final TelaAgendar view;
	
	 public SchedulingHelper (TelaAgendar view) {
		 this.view = view;
	 }

	 
	 public void preecherTabela(ArrayList<Scheduling> agendamentos) {
		 DefaultTableModel tableModel =  (DefaultTableModel) view.getTable().getModel();
		 tableModel.setNumRows(0);
		 
		 for (Scheduling agendamento : agendamentos) {
			 
			 tableModel.addRow(new Object [] {
					 agendamento.getId(),
					 agendamento.getCliente().getName(),
					 agendamento.getServico().getDescricao(),
					 agendamento.getValor(),
					 agendamento.getDataFormatada(),
					 agendamento.getHoraFormatada(),
					 agendamento.getObservacao()
			 });
		 }
	 }


	public void preencherClientes(ArrayList<Client> clientes) {

		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
		
		for (Client cliente : clientes) {
			comboBoxModel.addElement(cliente);
		}
		
	}


	public void preencherServico(ArrayList<Service> servicos) {
			DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
		
		for (Service service : servicos) {
			comboBoxModel.addElement(servicos);
		}
		
	}
	 

	 
	  
}
