package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.dao.CheckLoginDAO;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/icons/bucket.png")));
		// Instância
		
		CheckLoginDAO checklogin = new CheckLoginDAO();
		
		// Instância
		
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 43));
		setTitle("Iniciar Sess\u00E3o");
		setBackground(new Color(0, 0, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSair.setAlignmentX(0.5f);
		btnSair.setBounds(336, 223, 88, 27);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(113, 35, 82, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSenha.setBounds(113, 102, 82, 19);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setForeground(Color.BLACK);
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 15));
		tfUsuario.setBounds(113, 65, 207, 25);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setEchoChar('*');
		pfSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setBounds(113, 132, 207, 25);
		contentPane.add(pfSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				checklogin.fazLogin(tfUsuario.getText(),new String(pfSenha.getPassword()));
				dispose();
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(173, 187, 88, 27);
		contentPane.add(btnNewButton);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro cadastro = new Cadastro();
				cadastro.setVisible(true);
				
				dispose();
			}
		});
		btnCadastrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCadastrar.setBounds(165, 223, 104, 27);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/background/color(435x262).png")));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
	}
}
