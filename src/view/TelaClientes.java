package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.dao.ClienteDAO;
import model.entities.Cliente;

import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaClientes extends JFrame {

	private JPanel contentPane;
	private JTextField tfTelefone;
	private JTextField tfCidade;
	private JTextField tfEndereco;
	private JTextField tfEmail;
	private JTextField tfNome;
	private JTextField tfSexo;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaClientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaClientes.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfSexo = new JTextField();
		tfSexo.setBounds(193, 176, 86, 20);
		contentPane.add(tfSexo);
		tfSexo.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setBackground(new Color(5, 119, 192));
		menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem.setIcon(new ImageIcon(TelaClientes.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaClientes.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaClientes.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel = new JLabel("Nome Completo: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(56, 46, 110, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Email: ");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(56, 71, 44, 17);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo.setBounds(56, 96, 71, 17);
		contentPane.add(lblEndereo);
		
		JLabel lblEndereo_1_1 = new JLabel("Cidade: ");
		lblEndereo_1_1.setForeground(Color.BLACK);
		lblEndereo_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo_1_1.setBounds(56, 124, 55, 17);
		contentPane.add(lblEndereo_1_1);
		
		JLabel lblEndereo_1_1_1 = new JLabel("Telefone: ");
		lblEndereo_1_1_1.setForeground(Color.BLACK);
		lblEndereo_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo_1_1_1.setBounds(56, 152, 66, 17);
		contentPane.add(lblEndereo_1_1_1);
		
		JLabel lblEndereo_1_1_1_1 = new JLabel("Sexo: ");
		lblEndereo_1_1_1_1.setForeground(Color.BLACK);
		lblEndereo_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo_1_1_1_1.setBounds(56, 180, 41, 17);
		contentPane.add(lblEndereo_1_1_1_1);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(193, 151, 214, 20);
		contentPane.add(tfTelefone);
		
		tfCidade = new JTextField();
		tfCidade.setForeground(Color.BLACK);
		tfCidade.setFont(new Font("Arial", Font.PLAIN, 14));
		tfCidade.setColumns(10);
		tfCidade.setBounds(193, 123, 214, 20);
		contentPane.add(tfCidade);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(193, 95, 214, 20);
		contentPane.add(tfEndereco);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		tfEmail.setColumns(10);
		tfEmail.setBounds(193, 70, 214, 20);
		contentPane.add(tfEmail);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setFont(new Font("Arial", Font.PLAIN, 14));
		tfNome.setColumns(10);
		tfNome.setBounds(193, 45, 214, 20);
		contentPane.add(tfNome);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				ClienteDAO clienteDAO = new ClienteDAO();
				cliente.setNome(tfNome.getText());
				cliente.setEmail(tfEmail.getText());
				cliente.setEndereco(tfEndereco.getText());
				cliente.setCidade(tfCidade.getText());
				cliente.setTelefone(tfTelefone.getText());
				cliente.setSexo( tfSexo.getText());
				
				clienteDAO.creat(cliente);
			
			}
		});
		btnRegistrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnRegistrar.setBounds(183, 293, 93, 25);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(" ");
				cliente.setEmail(" ");
				cliente.setEndereco(" ");
				cliente.setCidade(" ");
				cliente.setTelefone(" ");
				cliente.setSexo(" ");
				
			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setAlignmentX(0.5f);
		btnLimpar.setBounds(10, 329, 93, 25);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal principal = new TelaPrincipal();
				principal.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBackground(Color.WHITE);
		btnSair.setAlignmentX(0.5f);
		btnSair.setBounds(331, 331, 93, 25);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaClientes.class.getResource("/img/background-clientes.png")));
		lblNewLabel_1.setBounds(10, 0, 434, 365);
		contentPane.add(lblNewLabel_1);
	}
}
