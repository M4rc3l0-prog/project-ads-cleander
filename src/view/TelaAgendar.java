package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import model.dao.AgendamentoDAO;
import model.entities.Agendamento;

public class TelaAgendar extends JFrame {

	private JPanel contentPane;
	private JTextField tfValor;
	private JTextField tfData;
	private JTextField tfHora;
	private JTextField tfId;
	
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	
	
	private JTextField tfObservacao;
	private JTextField tfCliente;
	private JTextField tfServico;
	
	/**
	 * Create the frame.
	 */
	public TelaAgendar() {
		initComponents();
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		table.setRowSorter(new TableRowSorter(modelo));
		readJTable();
		
	}
	
	
		
	  @SuppressWarnings("rawtypes")
	private void initComponents() {
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAgendar.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Agendar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 709, 530);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  	Agendamento agendamento = new Agendamento();
				  	AgendamentoDAO dao = new AgendamentoDAO();

				  	agendamento.setNome (tfCliente.getText());
					agendamento.setServico(tfServico.getText());
					agendamento.setValor(tfValor.getText());
					agendamento.setDate(tfData.getText());
					agendamento.setHora(tfHora.getText());
					agendamento.setDescricao(tfObservacao.getText());
		           int idconvert = Integer.parseInt(tfId.getText());
		           agendamento.setId(idconvert);
		            dao.update(agendamento);

		        	tfCliente.setText(" ");
					tfServico.setText(" ");
					tfValor.setText(" ");
					tfData.setText(" ");
					tfHora.setText(" ");
					tfObservacao.setText(" ");
					
					
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
					table.setRowSorter(new TableRowSorter(modelo));
					readJTable();
					
					
				
			}
		});
		
		tfServico = new JTextField();
		tfServico.setBounds(129, 68, 135, 20);
		contentPane.add(tfServico);
		tfServico.setColumns(10);
		
		tfCliente = new JTextField();
		tfCliente.setBounds(129, 41, 135, 20);
		contentPane.add(tfCliente);
		tfCliente.setColumns(10);
		btnAlterar.setBounds(299, 205, 110, 24);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agendamento agendamento = new Agendamento();
			  	AgendamentoDAO dao = new AgendamentoDAO();

			  	int reply = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse agendamento", "Confirmação", JOptionPane.YES_NO_OPTION);
			    if (reply == JOptionPane.YES_OPTION)
			    {
			    	int idconvert = Integer.parseInt(tfId.getText());
			           agendamento.setId(idconvert);
			            dao.delete (agendamento);
			    }
	           

	        	tfCliente.setText(" ");
				tfServico.setText(" ");
				tfValor.setText(" ");
				tfData.setText(" ");
				tfHora.setText(" ");
				tfObservacao.setText(" ");
				
			}
		});
		btnExcluir.setBounds(33, 206, 135, 23);
		contentPane.add(btnExcluir);
		
		tfObservacao = new JTextField();
		tfObservacao.setBounds(413, 68, 240, 156);
		contentPane.add(tfObservacao);
		tfObservacao.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Observa\u00E7\u00E3o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(430, 43, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		scrollPane.setBounds(32, 240, 638, 245);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setForeground(Color.BLACK);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Cliente", "Servi\u00E7o", "Valor", "Data", "Hora"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/background-agenda.png")));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(0, 253, 693, 270);
		contentPane.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu_1.setBackground(Color.GRAY);
		mnNewMenu_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JLabel lblData = new JLabel("Data: ");
		lblData.setFont(new Font("Arial", Font.PLAIN, 14));
		lblData.setBounds(66, 125, 53, 17);
		contentPane.add(lblData);
		
		JLabel lblHora = new JLabel("Hora: ");
		lblHora.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHora.setBounds(66, 153, 53, 17);
		contentPane.add(lblHora);
		
		JLabel lblServio = new JLabel("Servi\u00E7o: ");
		lblServio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblServio.setBounds(66, 69, 57, 17);
		contentPane.add(lblServio);
		
		JLabel lblCliente = new JLabel("Cliente: ");
		lblCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCliente.setBounds(65, 41, 54, 17);
		contentPane.add(lblCliente);
		
		JLabel lblValor = new JLabel("Valor: ");
		lblValor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValor.setBounds(66, 97, 53, 17);
		contentPane.add(lblValor);
		
		tfValor = new JTextField();
		tfValor.setHorizontalAlignment(SwingConstants.CENTER);
		tfValor.setForeground(Color.BLACK);
		tfValor.setFont(new Font("Arial", Font.PLAIN, 14));
		tfValor.setBounds(129, 97, 86, 20);
		contentPane.add(tfValor);
		tfValor.setColumns(10);
		
		tfData = new JTextField();
		tfData.setHorizontalAlignment(SwingConstants.CENTER);
		tfData.setForeground(Color.BLACK);
		tfData.setFont(new Font("Arial", Font.PLAIN, 14));
		tfData.setColumns(10);
		tfData.setBounds(129, 124, 86, 20);
		contentPane.add(tfData);
		
		tfHora = new JTextField();
		tfHora.setHorizontalAlignment(SwingConstants.CENTER);
		tfHora.setForeground(Color.BLACK);
		tfHora.setFont(new Font("Arial", Font.PLAIN, 14));
		tfHora.setColumns(10);
		tfHora.setBounds(129, 152, 86, 20);
		contentPane.add(tfHora);
		
		JButton btnNewButton = new JButton("Agendar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Agendamento agendamento = new Agendamento();
				AgendamentoDAO dao = new AgendamentoDAO();
				agendamento.setNome (tfCliente.getText());
				agendamento.setServico(tfServico.getText());
				agendamento.setValor(tfValor.getText());
				agendamento.setDate(tfData.getText());
				agendamento.setHora(tfHora.getText());
				agendamento.setDescricao(tfObservacao.getText());
				dao.creat(agendamento);
				
				tfCliente.setText(" ");
				tfServico.setText(" ");
				tfValor.setText(" ");
				tfData.setText(" ");
				tfHora.setText(" ");
				tfObservacao.setText(" ");
				
				
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				table.setRowSorter(new TableRowSorter(modelo));
				readJTable();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(178, 204, 119, 24);
		contentPane.add(btnNewButton);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal principal = new TelaPrincipal();
				principal.setVisible(true);
				dispose();
			}
		});
		btnSair.setBackground(Color.WHITE);
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBounds(599, 11, 71, 25);
		contentPane.add(btnSair);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setBounds(66, 181, 46, 14);
		contentPane.add(lblId);
		
		tfId = new JTextField();
		tfId.setBounds(129, 183, 86, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/background-agenda.png")));
		lblNewLabel.setBounds(0, 0, 693, 257);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/background-agenda.png")));
	
	  
	  
		
	  
	  }
	  
	  public void readJTable() {
		  DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		  modelo.setNumRows(0);
		  AgendamentoDAO dao= new AgendamentoDAO();
		  
		  for (Agendamento a : dao.read()) {
			 modelo.addRow (new Object[] {
			  
			  a.getId(),
			  a.getNome(),
			  a.getServico(),
			  a.getValor(),
			  a.getDate(),
			  a.getHora(),
			  a.getDescricao(),
			 });
			  
		  }
	  }



	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}







	public JTextField getTfValor() {
		return tfValor;
	}



	public void setTfValor(JTextField tfValor) {
		this.tfValor = tfValor;
	}



	public JTextField getTfData() {
		return tfData;
	}



	public JTextField getTfHora() {
		return tfHora;
	}



	public void setTfData(JTextField tfData) {
		this.tfData = tfData;
	}



	public void setTfHora(JTextField tfHora) {
		this.tfHora = tfHora;
	}



	public JTextField getTfID() {
		return tfId;
	}
	
	



	public JTextField getTfObservacao() {
		return tfObservacao;
	}



	public void setTfObservacao(JTextField tfObservacao) {
		this.tfObservacao = tfObservacao;
	}



	public void setTfID(JTextField tfID) {
		this.tfId = tfID;
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
