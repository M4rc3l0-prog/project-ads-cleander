package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	private JPasswordField pfSenhacon;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastro.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Cadastro\r\n");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(43, 65, 110, 17);
		contentPane.add(lblNewLabel);
		
		tfUsuario = new JTextField();
		tfUsuario.setForeground(Color.BLACK);
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(180, 64, 214, 20);
		contentPane.add(tfUsuario);
		
		JLabel lblEndereo_1_1_1_1_1 = new JLabel("Senha: ");
		lblEndereo_1_1_1_1_1.setForeground(Color.BLACK);
		lblEndereo_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo_1_1_1_1_1.setBounds(43, 95, 51, 17);
		contentPane.add(lblEndereo_1_1_1_1_1);
		
		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setEchoChar('*');
		pfSenha.setBounds(180, 94, 214, 20);
		contentPane.add(pfSenha);
		
		JLabel lblEndereo_1_1_1_1_1_1 = new JLabel("Confirmar Senha: ");
		lblEndereo_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblEndereo_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo_1_1_1_1_1_1.setBounds(43, 123, 117, 17);
		contentPane.add(lblEndereo_1_1_1_1_1_1);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setFont(new Font("Arial", Font.PLAIN, 14));
		pfSenhacon.setEchoChar('*');
		pfSenhacon.setBounds(180, 122, 214, 20);
		contentPane.add(pfSenhacon);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(5, 119, 192));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setIcon(new ImageIcon(TelaCadastro.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaCadastro.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaCadastro.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnRegistrar.setBounds(248, 153, 93, 25);
		contentPane.add(btnRegistrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.setBounds(355, 225, 71, 25);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCadastro.class.getResource("/img/background.png")));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
	}

}
