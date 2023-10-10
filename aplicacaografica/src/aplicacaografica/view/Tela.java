package aplicacaografica.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import aplicacaografica.model.Cliente;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoEndereco;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Clinica Veterinária");
		titulo.setForeground(new Color(0, 0, 153));
		titulo.setFont(new Font("FreeSans", Font.BOLD, 18));
		titulo.setBounds(319, 23, 177, 15);
		contentPane.add(titulo);
		
		JLabel lblNome = new JLabel("nome:");
		lblNome.setBounds(12, 69, 70, 15);
		contentPane.add(lblNome);

		JLabel lblDataDeNascimento = new JLabel("data de nascimento: ");
		lblDataDeNascimento.setBounds(12, 111, 167, 15);
		contentPane.add(lblDataDeNascimento);

		JLabel lblEndereo = new JLabel("endereço:");
		lblEndereo.setBounds(12, 162, 99, 15);
		contentPane.add(lblEndereo);
		
		campoNome = new JTextField();
		campoNome.setBounds(169, 67, 177, 19);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoEndereco = new JTextField();
		campoEndereco.setBounds(169, 160, 177, 19);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(169, 111, 142, 19);
		contentPane.add(dateChooser);
		
		JButton btnExecurar = new JButton("execurar");
		btnExecurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente c01 = new Cliente();
				
				c01.setNome(campoNome.getText());
				
				c01.setEndereco(campoEndereco.getText());
				
				c01.setDataNascimento(dateChooser.getDate());
				
				System.out.println(c01);
			}
		});
		btnExecurar.setForeground(Color.WHITE);
		btnExecurar.setBackground(new Color(0, 51, 255));
		btnExecurar.setBounds(12, 239, 117, 25);
		contentPane.add(btnExecurar);
	}
}
