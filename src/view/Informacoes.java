package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Informacoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Informacoes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Informacoes.class.getResource("/icons/bucket.png")));
		setTitle("Informa\u00E7\u00F5es");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCleander = new JLabel("Cleander");
		lblCleander.setForeground(Color.BLACK);
		lblCleander.setFont(new Font("Arial", Font.PLAIN, 50));
		lblCleander.setBounds(113, 11, 205, 59);
		contentPane.add(lblCleander);
		
		JLabel lblVerso = new JLabel("Vers\u00E3o 1.0");
		lblVerso.setForeground(Color.BLACK);
		lblVerso.setFont(new Font("Arial", Font.PLAIN, 16));
		lblVerso.setBounds(173, 108, 82, 19);
		contentPane.add(lblVerso);
		
		JLabel lblCopyright = new JLabel("\u00A9 Copyright - ADS 2\u00BA Fatec Cruzeiro\r\n");
		lblCopyright.setForeground(Color.BLACK);
		lblCopyright.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCopyright.setBounds(85, 179, 259, 19);
		contentPane.add(lblCopyright);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnVoltar.setAlignmentX(0.5f);
		btnVoltar.setBounds(173, 223, 88, 27);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Informacoes.class.getResource("/background/color(435x262).png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

}
