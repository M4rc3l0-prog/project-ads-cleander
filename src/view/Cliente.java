package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.dao.ClienteDAO;
import model.entities.ClienteDados;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfCidade;
	private JTextField tfEndereco;
	private JTextField tfComplemento;
	private JTextField tfComodos;
	
	
	
	private JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Cliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cliente.class.getResource("/icons/bucket.png")));
		
		
		setTitle("Cadastrar Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuasrio = new JLabel("Nome:");
		lblUsuasrio.setForeground(Color.BLACK);
		lblUsuasrio.setFont(new Font("Arial", Font.PLAIN, 16));
		lblUsuasrio.setBounds(33, 23, 123, 19);
		contentPane.add(lblUsuasrio);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setFont(new Font("Arial", Font.PLAIN, 15));
		tfNome.setColumns(10);
		tfNome.setBounds(176, 23, 207, 21);
		contentPane.add(tfNome);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(33, 53, 49, 19);
		contentPane.add(lblEmail);
		
		JLabel lblEndereo = new JLabel("Cidade: ");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEndereo.setBounds(33, 83, 61, 19);
		contentPane.add(lblEndereo);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		tfEmail.setColumns(10);
		tfEmail.setBounds(176, 53, 207, 21);
		contentPane.add(tfEmail);
		
		tfCidade = new JTextField();
		tfCidade.setForeground(Color.BLACK);
		tfCidade.setFont(new Font("Arial", Font.PLAIN, 15));
		tfCidade.setColumns(10);
		tfCidade.setBounds(176, 83, 207, 21);
		contentPane.add(tfCidade);
		
		JLabel lblComplemento = new JLabel("Endere\u00E7o: ");
		lblComplemento.setForeground(Color.BLACK);
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblComplemento.setBounds(33, 113, 77, 19);
		contentPane.add(lblComplemento);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(176, 113, 207, 21);
		contentPane.add(tfEndereco);
		
		tfComplemento = new JTextField();
		tfComplemento.setForeground(Color.BLACK);
		tfComplemento.setFont(new Font("Arial", Font.PLAIN, 15));
		tfComplemento.setColumns(10);
		tfComplemento.setBounds(176, 143, 207, 21);
		contentPane.add(tfComplemento);
		
		JLabel lblTelefone = new JLabel("Complemento:");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTelefone.setBounds(33, 143, 103, 19);
		contentPane.add(lblTelefone);
		
		JLabel lblContDeComdos = new JLabel("Telefone: ");
		lblContDeComdos.setForeground(Color.BLACK);
		lblContDeComdos.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContDeComdos.setBounds(33, 173, 140, 19);
		contentPane.add(lblContDeComdos);
		
		JLabel lblContDeComdos_1 = new JLabel("Quant. C\u00F4modos: ");
		lblContDeComdos_1.setForeground(Color.BLACK);
		lblContDeComdos_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContDeComdos_1.setBounds(33, 203, 140, 19);
		contentPane.add(lblContDeComdos_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				ClienteDAO clienteDao = new ClienteDAO();
				ClienteDados clienteDados = new ClienteDados();
				
				clienteDados.setNome(tfNome.getText());
				clienteDados.setEmail(tfEmail.getText());
				clienteDados.setCidade(tfCidade.getText());
				clienteDados.setEndereco(tfEndereco.getText());
				clienteDados.setComplemento(tfComplemento.getText());
				clienteDados.setComodos(tfComodos.getText());
				clienteDados.setTelefone(tfTelefone.getText());
				
					
				clienteDao.registrarCliente(clienteDados);
				
				tfNome.setText("");
				tfEmail.setText("");
				tfCidade.setText("");
				tfEndereco.setText("");
				tfComplemento.setText("");
				tfComodos.setText("");
				tfTelefone.setText("");
			
			}
		});
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCadastrar.setAlignmentX(0.5f);
		btnCadastrar.setBounds(158, 230, 104, 27);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal = new Principal();
				principal.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnVoltar.setAlignmentX(0.5f);
		btnVoltar.setBounds(337, 230, 88, 27);
		contentPane.add(btnVoltar);
		
		tfComodos = new JTextField();
		tfComodos.setForeground(Color.BLACK);
		tfComodos.setFont(new Font("Arial", Font.PLAIN, 15));
		tfComodos.setColumns(10);
		tfComodos.setBounds(176, 201, 207, 21);
		contentPane.add(tfComodos);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setFont(new Font("Arial", Font.PLAIN, 15));
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(176, 175, 207, 21);
		contentPane.add(tfTelefone);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Cliente.class.getResource("/background/color(435x262).png")));
		lblNewLabel.setBounds(0, 0, 435, 261);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		}
	}

