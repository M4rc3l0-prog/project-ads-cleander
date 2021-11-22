package ViewController.Helpers;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Model.Scheduling;
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
	 
	  
}
