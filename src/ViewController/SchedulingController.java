package ViewController;

import java.util.ArrayList;

import DAO.AgendamentoDAO;
import Model.Scheduling;
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

}
