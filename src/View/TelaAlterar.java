package View;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Component;

public class TelaAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaAlterar() {
		setResizable(false);
		setTitle("Alterar\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAlterar.class.getResource("/img/LogoCleander.jpg")));
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
		mntmNewMenuItem.setIcon(new ImageIcon(TelaAlterar.class.getResource("/img/icon/file.png")));
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setIcon(new ImageIcon(TelaAlterar.class.getResource("/img/icon/manual.png")));
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setIcon(new ImageIcon(TelaAlterar.class.getResource("/img/icon/question.png")));
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JLabel lblLimpezaBsica = new JLabel("Antigo: ");
		lblLimpezaBsica.setForeground(Color.BLACK);
		lblLimpezaBsica.setFont(new Font("Arial", Font.BOLD, 14));
		lblLimpezaBsica.setBounds(64, 82, 55, 17);
		contentPane.add(lblLimpezaBsica);
		
		JLabel lblAntigo = new JLabel("Informa\u00E7\u00F5es");
		lblAntigo.setForeground(Color.BLACK);
		lblAntigo.setFont(new Font("Arial", Font.BOLD, 16));
		lblAntigo.setBounds(161, 50, 95, 19);
		contentPane.add(lblAntigo);
		
		JLabel lblNovo = new JLabel("Novo: ");
		lblNovo.setForeground(Color.BLACK);
		lblNovo.setFont(new Font("Arial", Font.BOLD, 14));
		lblNovo.setBounds(64, 129, 47, 17);
		contentPane.add(lblNovo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nome", "Email", "Endere\u00E7o", "Cidade", "Telefone", "Quant. de C\u00F4modos", "Senha"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setBounds(129, 80, 158, 23);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(129, 127, 158, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(169, 161, 77, 25);
		contentPane.add(btnNewButton);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.setBackground(Color.WHITE);
		btnSair.setAlignmentX(Component.CENTER_ALIGNMENT);
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
		btnSair.setBounds(169, 225, 71, 25);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaAlterar.class.getResource("/img/background.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

}
