package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaInformacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaInformacao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInformacao.class.getResource("/img/LogoCleander.jpg")));
		setTitle("Informa\u00E7\u00E3o");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBackground(Color.WHITE);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(171, 222, 71, 25);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u00A9 Copyright - ADS 2\u00BA Fatec Cruzeiro");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(89, 190, 274, 21);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Cleander");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 50));
		lblNewLabel_1.setBounds(112, 24, 214, 59);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Version 1.0");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(171, 131, 86, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInformacao.class.getResource("/img/background.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

}
