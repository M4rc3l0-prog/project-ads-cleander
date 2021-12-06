package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.dao.AgendarDAO;
import model.entities.AgendarDados;

public class Agendar extends JFrame {

	private JPanel contentPane;
	private JTextField tfPreco;
	private JTextField tfHora;
	private JTextField tfData;
	private JTable table;
	private JTextField tfCliente;
	private JTextField tfServico;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Agendar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agendar.class.getResource("/icons/bucket.png")));
		// Instância
		AgendarDAO agendarDao = new AgendarDAO();
		AgendarDados agendarDados = new AgendarDados();
		
		// Instância
		setTitle("Agendamento de Servi\u00E7o");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 745, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Cliente");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(10, 34, 51, 19);
		contentPane.add(lblNome);
		
		JLabel lblServio = new JLabel("Servi\u00E7o: ");
		lblServio.setForeground(Color.BLACK);
		lblServio.setFont(new Font("Arial", Font.PLAIN, 16));
		lblServio.setBounds(10, 66, 62, 19);
		contentPane.add(lblServio);
		
		JLabel lblValor = new JLabel("Pre\u00E7o: ");
		lblValor.setForeground(Color.BLACK);
		lblValor.setFont(new Font("Arial", Font.PLAIN, 16));
		lblValor.setBounds(10, 158, 51, 19);
		contentPane.add(lblValor);
		
		JLabel lblNome_1_1 = new JLabel("Hora: ");
		lblNome_1_1.setForeground(Color.BLACK);
		lblNome_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome_1_1.setBounds(10, 128, 43, 19);
		contentPane.add(lblNome_1_1);
		
		JLabel lblData = new JLabel("Data: ");
		lblData.setForeground(Color.BLACK);
		lblData.setFont(new Font("Arial", Font.PLAIN, 16));
		lblData.setBounds(10, 96, 43, 19);
		contentPane.add(lblData);
		
		tfPreco = new JTextField();
		tfPreco.setForeground(Color.BLACK);
		tfPreco.setFont(new Font("Arial", Font.PLAIN, 15));
		tfPreco.setColumns(10);
		tfPreco.setBounds(131, 158, 207, 21);
		contentPane.add(tfPreco);
		
		tfHora = new JTextField();
		tfHora.setForeground(Color.BLACK);
		tfHora.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHora.setColumns(10);
		tfHora.setBounds(131, 128, 207, 21);
		contentPane.add(tfHora);
		
		tfData = new JTextField();
		tfData.setForeground(Color.BLACK);
		tfData.setFont(new Font("Arial", Font.PLAIN, 15));
		tfData.setColumns(10);
		tfData.setBounds(131, 96, 207, 21);
		contentPane.add(tfData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 286, 616, 191);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "Servi\u00E7o", "Cidade", "Endere\u00E7o", "Data", "Horas", "Pre\u00E7o", "Quant. C\u00F4modos"
			}
		));
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setForeground(Color.BLACK);
		scrollPane.setViewportView(table);
		
		JButton btnPesquisar_1_1 = new JButton("Agendar");
		btnPesquisar_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				agendarDados.setData(tfData.getText());
				agendarDados.setHora(tfHora.getText());
				agendarDados.setPreco(tfPreco.getText());
				agendarDados.setCliente(tfCliente.getText());
				agendarDados.setServico(tfServico.getText());
				
				agendarDao.registrarServico(agendarDados);
				
				tfData.setText("");
				tfHora.setText("");
				tfPreco.setText("");
				tfServico.setText("");
				tfCliente.setText("");
	
			
			}
			});
		btnPesquisar_1_1.setForeground(Color.BLACK);
		btnPesquisar_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar_1_1.setAlignmentX(0.5f);
		btnPesquisar_1_1.setBounds(186, 190, 95, 27);
		contentPane.add(btnPesquisar_1_1);
		
		JButton btnPesquisar_1_2_1 = new JButton("Voltar");
		btnPesquisar_1_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal = new Principal();
					principal.setVisible(true);
						dispose();
			}
		});
		btnPesquisar_1_2_1.setForeground(Color.BLACK);
		btnPesquisar_1_2_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar_1_2_1.setAlignmentX(0.5f);
		btnPesquisar_1_2_1.setBounds(631, 480, 93, 27);
		contentPane.add(btnPesquisar_1_2_1);
		
		tfCliente = new JTextField();
		tfCliente.setForeground(Color.BLACK);
		tfCliente.setFont(new Font("Arial", Font.PLAIN, 15));
		tfCliente.setColumns(10);
		tfCliente.setBounds(131, 34, 207, 21);
		contentPane.add(tfCliente);
		
		tfServico = new JTextField();
		tfServico.setForeground(Color.BLACK);
		tfServico.setFont(new Font("Arial", Font.PLAIN, 15));
		tfServico.setColumns(10);
		tfServico.setBounds(131, 66, 207, 21);
		contentPane.add(tfServico);
		
		JButton btnPesquisar_1_2_1_1 = new JButton("Atualizar");
		btnPesquisar_1_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultSet rs = agendarDao.listarAgendamentos();
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				modelo.setNumRows(0);
				try {
					
				while(rs.next()) {
					
					modelo.addRow(new Object[]{rs.getString("cliente"),rs.getString("servico"),rs.getString("cidade"),rs.getString("endereco"),
							rs.getString("data"),rs.getString("hora"),rs.getString("preco"),rs.getString("comodos")});
				}
				
				
				rs.close();
				}catch(Exception e1) {
					
				}
			}
			
		});
		btnPesquisar_1_2_1_1.setForeground(Color.BLACK);
		btnPesquisar_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar_1_2_1_1.setAlignmentX(0.5f);
		btnPesquisar_1_2_1_1.setBounds(630, 289, 94, 27);
		contentPane.add(btnPesquisar_1_2_1_1);
		
		JButton btnPesquisar_1_2_1_1_1 = new JButton("Alterar");
		btnPesquisar_1_2_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				agendarDados.setData(tfData.getText());
				agendarDados.setHora(tfHora.getText());
				agendarDados.setPreco(tfPreco.getText());
				agendarDados.setServico(tfServico.getText());
				agendarDados.setCidade(tfCliente.getText());
				
				agendarDao.alterarServico(agendarDados);
				
				tfData.setText("");
				tfHora.setText("");
				tfPreco.setText("");
				tfServico.setText("");
				tfCliente.setText("");
			}
		});
		btnPesquisar_1_2_1_1_1.setForeground(Color.BLACK);
		btnPesquisar_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar_1_2_1_1_1.setAlignmentX(0.5f);
		btnPesquisar_1_2_1_1_1.setBounds(630, 347, 94, 27);
		contentPane.add(btnPesquisar_1_2_1_1_1);
		
		JButton btnPesquisar_1_2_1_1_1_1 = new JButton("Excluir");
		btnPesquisar_1_2_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				agendarDados.setCliente(tfCliente.getText());
				agendarDao.excluirServico(agendarDados);
				
				tfCliente.setText("");
				tfServico.setText("");
				tfData.setText("");
				tfHora.setText("");
				tfPreco.setText("");
			}
		});
		btnPesquisar_1_2_1_1_1_1.setForeground(Color.BLACK);
		btnPesquisar_1_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar_1_2_1_1_1_1.setAlignmentX(0.5f);
		btnPesquisar_1_2_1_1_1_1.setBounds(630, 385, 94, 27);
		contentPane.add(btnPesquisar_1_2_1_1_1_1);
		
		JButton btnPesquisar_1_2_1_1_2 = new JButton("Buscar");
		btnPesquisar_1_2_1_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				agendarDados.setCliente(tfCliente.getText());
				ResultSet rs = agendarDao.buscarAlterarAgendamento(agendarDados);
				
				try {
					
				if(rs.next()) {
					tfData.setText(rs.getString("data"));
					tfHora.setText(rs.getString("hora"));
					tfPreco.setText(rs.getString("preco"));
					tfServico.setText(rs.getString("servico"));				
					
					rs.close();
				}
				}catch(Exception e1) {
					
				}
			}
		});
		btnPesquisar_1_2_1_1_2.setForeground(Color.BLACK);
		btnPesquisar_1_2_1_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar_1_2_1_1_2.setAlignmentX(0.5f);
		btnPesquisar_1_2_1_1_2.setBounds(348, 34, 94, 27);
		contentPane.add(btnPesquisar_1_2_1_1_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Agendar.class.getResource("/background/color(731x519).png")));
		lblNewLabel.setBounds(0, 0, 730, 518);
		contentPane.add(lblNewLabel);
		
	
	}
}
