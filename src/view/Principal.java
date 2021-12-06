package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.ParseException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Desktop;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icons/bucket.png")));
		
		setResizable(false);
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setFont(new Font("Consolas", Font.PLAIN, 16));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 207, 24);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cliente\r\n");
		mnNewMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mntmRegistrar.setIcon(new ImageIcon(Principal.class.getResource("/icons/adicionar-usuario.png")));
		mntmRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			Cliente cliente = new Cliente();
				cliente.setVisible(true);
					dispose();
			}
		});
		mntmRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmRegistrar.setForeground(Color.BLACK);
		mntmRegistrar.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNewMenu.add(mntmRegistrar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar\r\n");
		mntmAlterar.setIcon(new ImageIcon(Principal.class.getResource("/icons/atualizar.png")));
		mntmAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Alterar alterar = new Alterar();
					alterar.setVisible(true);
						dispose();
			}
		});
		mntmAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmAlterar.setForeground(Color.BLACK);
		mntmAlterar.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNewMenu.add(mntmAlterar);
		
		JMenu mnNewMenu_1 = new JMenu("Opera\u00E7\u00F5es");
		mnNewMenu_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAgendar = new JMenuItem("Agendar\r\n");
		mntmAgendar.setIcon(new ImageIcon(Principal.class.getResource("/icons/calendario.png")));
		mntmAgendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Agendar agendar = new Agendar();
					agendar.setVisible(true);
						dispose();
			}
		});
		mntmAgendar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmAgendar.setForeground(Color.BLACK);
		mntmAgendar.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNewMenu_1.add(mntmAgendar);
		
		JMenu mnNewMenu_2 = new JMenu("Op\u00E7\u00F5es\r\n");
		mnNewMenu_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu_2.setForeground(Color.BLACK);
		mnNewMenu_2.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmInformacoes = new JMenuItem("Informa\u00E7\u00F5es");
		mntmInformacoes.setIcon(new ImageIcon(Principal.class.getResource("/icons/cracha-de-identificacao.png")));
		mntmInformacoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Informacoes informacoes = new Informacoes();
					informacoes.setVisible(true);
			}
		});
		mntmInformacoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmInformacoes.setForeground(Color.BLACK);
		mntmInformacoes.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNewMenu_2.add(mntmInformacoes);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				try {
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Joao\\Desktop\\Manual.pdf");
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Erro","Error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmAjuda.setIcon(new ImageIcon(Principal.class.getResource("/icons/interrogatorio.png")));
		mntmAjuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				try {
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Joao\\Desktop\\Manual.pdf");
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Erro","Error",JOptionPane.ERROR_MESSAGE);
				}
				
				
			
			}
		});
		mntmAjuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmAjuda.setForeground(Color.BLACK);
		mntmAjuda.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNewMenu_2.add(mntmAjuda);
		
		JButton btnSair = new JButton("Encerrar sess\u00E3o\r\n");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login login = new Login();
				login.setVisible(true);
				
				dispose();
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSair.setAlignmentX(0.5f);
		btnSair.setBounds(272, 223, 154, 27);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/background/color(435x262).png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
