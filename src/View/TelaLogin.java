package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ModuleLayer.Controller;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DAO.Banco;
import ViewController.LoginController;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	
	private final LoginController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		
		// Sintaxe 
		TelaPrincipal principal = new TelaPrincipal();
		TelaInformacao informacao = new TelaInformacao();
		TelaCadastro cadastro = new TelaCadastro();
		
		controller	= new LoginController(this);
		
		Banco.inicia();
		
		// Sintaxe
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/img/LogoCleander.jpg")));
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setBackground(new Color(5, 119, 192));
		menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				informacao.setVisible(true);
				
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sess\u00E3o");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(163, 22, 107, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeDoUsurio = new JLabel("Nome do usu\u00E1rio: ");
		lblNomeDoUsurio.setForeground(Color.BLACK);
		lblNomeDoUsurio.setFont(new Font("Arial", Font.BOLD, 14));
		lblNomeDoUsurio.setBounds(116, 52, 129, 17);
		contentPane.add(lblNomeDoUsurio);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		tfUsuario.setBounds(116, 80, 204, 31);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(116, 122, 50, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.loginSystem();
				dispose();
			}
		});
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntrar.setBounds(181, 192, 73, 25);
		contentPane.add(btnEntrar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCadastrar.setBounds(170, 228, 97, 25);
		contentPane.add(btnCadastrar);
		
		pfSenha = new JPasswordField();
		pfSenha.setEchoChar('*');
		pfSenha.setBounds(116, 150, 204, 31);
		contentPane.add(pfSenha);
		
		JButton btnBancoDeDados = new JButton("Banco de dados");
		btnBancoDeDados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBancoDeDados.setBackground(Color.WHITE);
		btnBancoDeDados.setForeground(Color.BLACK);
		btnBancoDeDados.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBancoDeDados.setBounds(151, 264, 137, 25);
		contentPane.add(btnBancoDeDados);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/background.png")));
		lblNewLabel_2.setBounds(0, 0, 434, 300);
		contentPane.add(lblNewLabel_2);
	}

	public void exibeMensagem(String mensagem  ) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public JTextField getTfUsuario() {
		return tfUsuario;
	}

	public void setTfUsuario(JTextField tfUsuario) {
		this.tfUsuario = tfUsuario;
	}

	public JPasswordField getPfSenha() {
		return pfSenha;
	}

	public void setPfSenha(JPasswordField pfSenha) {
		this.pfSenha = pfSenha;
	}
	
	
}
