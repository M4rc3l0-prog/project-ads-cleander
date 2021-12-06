package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Window.Type;

public class TelaServicos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaServicos() {
		setType(Type.UTILITY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaServicos.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Servi\u00E7os");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(5, 119, 192));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setIcon(new ImageIcon(TelaServicos.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaServicos.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaServicos.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel = new JLabel("Limpeza B\u00E1sica: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 50, 117, 17);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnConsisteEmRetirar = new JTextPane();
		txtpnConsisteEmRetirar.setEditable(false);
		txtpnConsisteEmRetirar.setForeground(Color.BLACK);
		txtpnConsisteEmRetirar.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnConsisteEmRetirar.setText("Consiste em retirar p\u00F3 e outros res\u00EDduos com produtos de higieniza\u00E7\u00E3o mais acess\u00EDveis.");
		txtpnConsisteEmRetirar.setBounds(137, 47, 287, 57);
		contentPane.add(txtpnConsisteEmRetirar);
		
		JLabel lblLimpezaLeve = new JLabel("Limpeza Leve: ");
		lblLimpezaLeve.setForeground(Color.BLACK);
		lblLimpezaLeve.setFont(new Font("Arial", Font.BOLD, 14));
		lblLimpezaLeve.setBounds(10, 125, 106, 17);
		contentPane.add(lblLimpezaLeve);
		
		JTextPane txtpnEssaLimpezaEst = new JTextPane();
		txtpnEssaLimpezaEst.setText("J\u00E1 demanda a utiliza\u00E7\u00E3o de materiais qu\u00EDmicos mais espec\u00EDficos e pesados, tais como \u00E1gua sanit\u00E1ria e solventes.");
		txtpnEssaLimpezaEst.setForeground(Color.BLACK);
		txtpnEssaLimpezaEst.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnEssaLimpezaEst.setEditable(false);
		txtpnEssaLimpezaEst.setBounds(137, 125, 287, 57);
		contentPane.add(txtpnEssaLimpezaEst);
		
		JLabel lblLimpezaLeve_1 = new JLabel("Limpeza Leve: ");
		lblLimpezaLeve_1.setForeground(Color.BLACK);
		lblLimpezaLeve_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblLimpezaLeve_1.setBounds(10, 199, 106, 17);
		contentPane.add(lblLimpezaLeve_1);
		
		JTextPane txtpnSeuFoco = new JTextPane();
		txtpnSeuFoco.setText("Seu foco \u00E9 eliminar qualquer risco apresentado por agentes contaminantes, como v\u00EDrus e bact\u00E9rias.");
		txtpnSeuFoco.setForeground(Color.BLACK);
		txtpnSeuFoco.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnSeuFoco.setEditable(false);
		txtpnSeuFoco.setBounds(137, 199, 287, 57);
		contentPane.add(txtpnSeuFoco);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaServicos.class.getResource("/img/background.png")));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
	}
}
