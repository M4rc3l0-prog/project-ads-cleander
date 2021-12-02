package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ModuleLayer.Controller;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
	
		// Sintaxe
		TelaClientes cliente = new TelaClientes();
		TelaAgendar agendar = new TelaAgendar();
		
		TelaServicos servicos = new TelaServicos();
	
		TelaInformacao informacao = new TelaInformacao();
		// Sintaxe
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setBackground(new Color(5, 119, 192));
		menuBar.setForeground(Color.BLACK);
		menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 207, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cliente");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				cliente.setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/icon/users.png")));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Servi\u00E7o");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				servicos.setVisible(true);
								
			}
		});
		mntmNewMenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/icon/broom.png")));
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnCadastro = new JMenu("Opera\u00E7\u00E3o");
		mnCadastro.setBackground(Color.WHITE);
		mnCadastro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnCadastro.setForeground(Color.BLACK);
		mnCadastro.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnCadastro);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Agendar");
		mntmNewMenuItem_1_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			agendar.setVisible(true);
				
				dispose();
			}
		});
		mntmNewMenuItem_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/icon/calendar.png")));
		mntmNewMenuItem_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnCadastro.add(mntmNewMenuItem_1_1);
		
		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		mnOpes.setBackground(Color.WHITE);
		mnOpes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnOpes.setForeground(Color.BLACK);
		mnOpes.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnOpes);
		
		JMenuItem mntmNewMenuItem_1_1_1 = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem_1_1_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				informacao.setVisible(true);
			}
		});
		mntmNewMenuItem_1_1_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1_1_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnOpes.add(mntmNewMenuItem_1_1_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Manual");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnOpes.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Ajuda");
		mntmNewMenuItem_3.setBackground(Color.WHITE);
		mntmNewMenuItem_3.setForeground(Color.BLACK);
		mntmNewMenuItem_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_3.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 14));
		mnOpes.add(mntmNewMenuItem_3);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/background.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

}
