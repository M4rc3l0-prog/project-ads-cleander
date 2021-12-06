package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.dao.UsuarioDAO;
import model.entities.UsuarioDados;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;




public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	private JPasswordField pfSenhacon;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JLabel lblNewLabel_1;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cadastro.class.getResource("/icons/bucket.png")));
		// Instância
		UsuarioDAO usuarioDao = new UsuarioDAO();
		UsuarioDados usuarioDados = new UsuarioDados();
		// Instância
		
		setTitle("Cadastrar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(113, 21, 82, 19);
		contentPane.add(lblNewLabel);
		
		tfUsuario = new JTextField();
		tfUsuario.setForeground(Color.BLACK);
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 15));
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(113, 51, 207, 25);
		contentPane.add(tfUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSenha.setBounds(113, 88, 82, 19);
		contentPane.add(lblSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		pfSenha.setEchoChar('*');
		pfSenha.setBounds(113, 118, 207, 25);
		contentPane.add(pfSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha: ");
		lblConfirmarSenha.setForeground(Color.BLACK);
		lblConfirmarSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblConfirmarSenha.setBounds(113, 154, 127, 19);
		contentPane.add(lblConfirmarSenha);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setForeground(Color.BLACK);
		pfSenhacon.setFont(new Font("Arial", Font.PLAIN, 15));
		pfSenhacon.setEchoChar('*');
		pfSenhacon.setBounds(113, 184, 207, 25);
		contentPane.add(pfSenhacon);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(new String(pfSenha.getPassword()).equals(new String(pfSenhacon.getPassword()))) {
					
					usuarioDados.setSenha(new String(pfSenha.getPassword()));
					usuarioDados.setUsuario(tfUsuario.getText());
					usuarioDados.setSenhacon(new String(pfSenhacon.getPassword()));
					
						usuarioDao.registrarUsuario(usuarioDados);
						
						tfUsuario.setText("");
						pfSenha.setText("");
						pfSenhacon.setText("");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Senhas não conferem!", "Atenção", JOptionPane.WARNING_MESSAGE);
				}
				
				
												
						
			}

			
		});
		btnCadastrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCadastrar.setBounds(165, 223, 104, 27);
		contentPane.add(btnCadastrar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login login = new Login();
				login.setVisible(true);
				
				dispose();
			}
		});
		btnVoltar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnVoltar.setBounds(336, 223, 88, 27);
		contentPane.add(btnVoltar);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Cadastro.class.getResource("/background/color(435x262).png")));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
	}

}
