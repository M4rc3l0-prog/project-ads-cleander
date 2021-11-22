package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ViewController.SchedulingController;

public class TelaAgendar extends JFrame {

	private JPanel contentPane;
	private JTextField tfValor;
	private JTextField tfData;
	private JTextField tfHora;
	private JTable table;
	private JComboBox<String>jComboBoxCliente;
	private JComboBox<String>jComboBoxServico;

	/**
	 * Launch the application.
	 */
	
	private final SchedulingController controller;
	
	/**
	 * Create the frame.
	 */
	public TelaAgendar() {
		initComponents();
		controller = new SchedulingController(this);
		iniciar();
		
		
	}
	
	
		
	  @SuppressWarnings("rawtypes")
	private void initComponents() {
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAgendar.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Agendar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 709, 334);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(5, 119, 192));
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Op\u00E7\u00F5es");
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
		
		jComboBoxCliente = new JComboBox();
		jComboBoxCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jComboBoxCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		jComboBoxCliente.setBackground(Color.WHITE);
		jComboBoxCliente.setBounds(129, 39, 200, 22);
		contentPane.add(jComboBoxCliente);
		
		JLabel lblValor = new JLabel("Valor: ");
		lblValor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValor.setBounds(66, 97, 53, 17);
		contentPane.add(lblValor);
		
		jComboBoxServico = new JComboBox();
		jComboBoxServico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jComboBoxServico.setBackground(Color.WHITE);
		jComboBoxServico.setForeground(Color.BLACK);
		jComboBoxServico.setFont(new Font("Arial", Font.PLAIN, 14));
		jComboBoxServico.setBounds(129, 67, 135, 23);
		contentPane.add(jComboBoxServico);
		
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
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(129, 217, 89, 25);
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
		btnSair.setBounds(287, 268, 71, 25);
		contentPane.add(btnSair);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(363, 41, 320, 217);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Cliente", "Servi\u00E7o", "Valor", "Data", "Hora"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(TelaAgendar.class.getResource("/img/background-agenda.png")));
		lblNewLabel.setBounds(0, 0, 693, 295);
		contentPane.add(lblNewLabel);
	
	  
	  
		
	  
	  }

	private void iniciar() {
		controller.atualizarTabela();
		controller.atualizaCliente();
		controller.atualizaServico();
		
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}



	public JComboBox<String> getjComboBoxCliente() {
		return jComboBoxCliente;
	}



	public JComboBox<String> getjComboBoxServico() {
		return jComboBoxServico;
	}



	public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
		this.jComboBoxCliente = jComboBoxCliente;
	}



	public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
		this.jComboBoxServico = jComboBoxServico;
	}
	
	
	
	
}
