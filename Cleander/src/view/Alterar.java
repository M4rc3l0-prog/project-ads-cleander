package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import connection.Conexao;
import model.dao.ClienteDAO;
import model.entities.ClienteDados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Alterar extends JFrame {

	private JPanel contentPane;
	private JTextField tfEmail;
	private JTextField tfCidade;
	private JTextField tfEndereco;
	private JTextField tfComplemento;
	private JTextField tfComodos;
	private JTextField tfTelefone;
	private JTextField tfNome;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Alterar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Alterar.class.getResource("/icons/bucket.png")));

		// Instância
		ClienteDAO clienteDao = new ClienteDAO();
		ClienteDados clienteDados = new ClienteDados();
		// Instância
		
		setTitle("Alterar Registro de Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(10, 11, 51, 19);
		contentPane.add(lblNome);
		
		
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(10, 41, 49, 19);
		contentPane.add(lblEmail);
		
		JLabel lblEndereo = new JLabel("Cidade: ");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEndereo.setBounds(10, 71, 61, 19);
		contentPane.add(lblEndereo);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		tfEmail.setColumns(10);
		tfEmail.setBounds(153, 41, 207, 21);
		contentPane.add(tfEmail);
		
		tfCidade = new JTextField();
		tfCidade.setForeground(Color.BLACK);
		tfCidade.setFont(new Font("Arial", Font.PLAIN, 15));
		tfCidade.setColumns(10);
		tfCidade.setBounds(153, 71, 207, 21);
		contentPane.add(tfCidade);
		
		JLabel lblComplemento = new JLabel("Endere\u00E7o: ");
		lblComplemento.setForeground(Color.BLACK);
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblComplemento.setBounds(10, 101, 77, 19);
		contentPane.add(lblComplemento);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(153, 101, 207, 21);
		contentPane.add(tfEndereco);
		
		tfComplemento = new JTextField();
		tfComplemento.setForeground(Color.BLACK);
		tfComplemento.setFont(new Font("Arial", Font.PLAIN, 15));
		tfComplemento.setColumns(10);
		tfComplemento.setBounds(153, 131, 207, 21);
		contentPane.add(tfComplemento);
		
		JLabel lblTelefone = new JLabel("Complemento:");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTelefone.setBounds(10, 131, 103, 19);
		contentPane.add(lblTelefone);
		
		JLabel lblContDeComdos = new JLabel("Telefone: ");
		lblContDeComdos.setForeground(Color.BLACK);
		lblContDeComdos.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContDeComdos.setBounds(10, 161, 69, 19);
		contentPane.add(lblContDeComdos);
		
		JLabel lblContDeComdos_1 = new JLabel("Quant. C\u00F4modos: ");
		lblContDeComdos_1.setForeground(Color.BLACK);
		lblContDeComdos_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContDeComdos_1.setBounds(10, 191, 141, 19);
		contentPane.add(lblContDeComdos_1);
		
		tfComodos = new JTextField();
		tfComodos.setForeground(Color.BLACK);
		tfComodos.setFont(new Font("Arial", Font.PLAIN, 15));
		tfComodos.setColumns(10);
		tfComodos.setBounds(153, 191, 207, 21);
		contentPane.add(tfComodos);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setFont(new Font("Arial", Font.PLAIN, 15));
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(153, 161, 207, 21);
		contentPane.add(tfTelefone);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				clienteDados.setNome(tfNome.getText());
				clienteDados.setEmail(tfEmail.getText());
				clienteDados.setCidade(tfCidade.getText());
				clienteDados.setEndereco(tfEndereco.getText());
				clienteDados.setComplemento(tfComplemento.getText());
				clienteDados.setComodos(tfComodos.getText());
				clienteDados.setTelefone(tfTelefone.getText());
				
				clienteDao.alterarCliente(clienteDados);
				
				tfNome.setText("");
				tfEmail.setText("");
				tfCidade.setText("");
				tfEndereco.setText("");
				tfComplemento.setText("");
				tfComodos.setText("");
				tfTelefone.setText("");
				
				
			}
		});
		btnAlterar.setForeground(Color.BLACK);
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAlterar.setAlignmentX(0.5f);
		btnAlterar.setBounds(207, 223, 104, 27);
		contentPane.add(btnAlterar);
		
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
		btnVoltar.setBounds(386, 223, 88, 27);
		contentPane.add(btnVoltar);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setFont(new Font("Arial", Font.PLAIN, 15));
		tfNome.setColumns(10);
		tfNome.setBounds(153, 11, 207, 21);
		contentPane.add(tfNome);
		
		JButton btnPesquisar = new JButton("Buscar");
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clienteDados.setNome(tfNome.getText());
				
				ResultSet rs = 	clienteDao.listarClientes(clienteDados);
				
								
				try {
					if(rs.next()) {
					tfEmail.setText(rs.getString("email"));
					tfCidade.setText(rs.getString("cidade"));
					tfComodos.setText(rs.getString("comodos"));
					tfComplemento.setText(rs.getString("complemento"));
					tfEndereco.setText(rs.getString("endereco"));
					tfTelefone.setText(rs.getString("telefone"));
					rs.close();
					}
					else {
						JOptionPane.showMessageDialog(null, "Cliente não existe","Atenção",JOptionPane.WARNING_MESSAGE);
					}
					
				}
					
				catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		btnPesquisar.setForeground(Color.BLACK);
		btnPesquisar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar.setAlignmentX(0.5f);
		btnPesquisar.setBounds(386, 11, 83, 27);
		contentPane.add(btnPesquisar);
		
		JLabel lblopcinal = new JLabel("(Opcinal)");
		lblopcinal.setForeground(Color.BLACK);
		lblopcinal.setFont(new Font("Arial", Font.PLAIN, 16));
		lblopcinal.setBounds(371, 131, 65, 19);
		contentPane.add(lblopcinal);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				clienteDados.setNome(tfNome.getText());
				clienteDao.excluirCliente(clienteDados);
				
				tfNome.setText("");
				tfEmail.setText("");
				tfCidade.setText("");
				tfEndereco.setText("");
				tfComplemento.setText("");
				tfComodos.setText("");
				tfTelefone.setText("");
				
			}
		});
		btnExcluir.setForeground(Color.BLACK);
		btnExcluir.setFont(new Font("Arial", Font.PLAIN, 16));
		btnExcluir.setAlignmentX(0.5f);
		btnExcluir.setBounds(10, 223, 104, 27);
		contentPane.add(btnExcluir);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Alterar.class.getResource("/background/color(485x262).png")));
		lblNewLabel.setBounds(0, 0, 484, 261);
		contentPane.add(lblNewLabel);
	
		
	}
	
	
	
	
}
