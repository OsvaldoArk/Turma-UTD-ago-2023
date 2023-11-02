package aplicacaografica.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import aplicacaografica.model.Cliente;
import aplicacaografica.model.ClienteDao;


public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoEndereco;
	private JTextField campoTelefone;
	private JTable table;
	ClienteDao dao = new ClienteDao();
	
	List<Cliente> clientes = new ArrayList<>();
	private JTextField campoId;
	
	
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
		setBounds(100, 100, 981, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Clinica Veterinária");
		titulo.setForeground(new Color(0, 0, 153));
		titulo.setFont(new Font("FreeSans", Font.BOLD, 18));
		titulo.setBounds(589, 23, 177, 15);
		contentPane.add(titulo);

		
		JLabel lblId = new JLabel("id:");
		lblId.setBounds(12, 23, 70, 15);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("nome:");
		lblNome.setBounds(12, 69, 70, 15);
		contentPane.add(lblNome);

		JLabel lblDataDeNascimento = new JLabel("data de nascimento: ");
		lblDataDeNascimento.setBounds(12, 111, 167, 15);
		contentPane.add(lblDataDeNascimento);

		JLabel lblEndereo = new JLabel("endereço:");
		lblEndereo.setBounds(12, 162, 99, 15);
		contentPane.add(lblEndereo);

		JLabel lblTelefone = new JLabel("telefone:");
		lblTelefone.setBounds(12, 212, 70, 15);
		contentPane.add(lblTelefone);
		
		campoId = new JTextField();
		campoId.setBounds(169, 21, 114, 19);
		contentPane.add(campoId);
		campoId.setColumns(10);
		
		campoNome = new JTextField();
		campoNome.setBounds(169, 67, 177, 19);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoEndereco = new JTextField();
		campoEndereco.setBounds(169, 160, 177, 19);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);

		campoTelefone = new JTextField();
		campoTelefone.setBounds(169, 210, 177, 19);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(169, 111, 142, 19);
		contentPane.add(dateChooser);
		
		JButton btnSalvar = new JButton("salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adicionarCliente(campoId,campoNome,dateChooser,campoEndereco,campoTelefone,dao);
				
				limparTabela(table);
				
				carregarTabela(table,dao);
			}
		});
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setBackground(new Color(0, 51, 255));
		btnSalvar.setBounds(12, 239, 117, 25);
		contentPane.add(btnSalvar);
		
		JButton btnListar = new JButton("listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				listarCliente(table, campoId, campoNome, dateChooser, campoEndereco, campoTelefone);
			
			}
		});
		btnListar.setForeground(Color.WHITE);
		btnListar.setBackground(new Color(0, 51, 255));
		btnListar.setBounds(12, 276, 117, 25);
		contentPane.add(btnListar);
		
		JButton btnApagar = new JButton("apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Long id = Long.parseLong(campoId.getText());
				
				Cliente c = dao.encontrarClientePeloId(id);
				
				c.setStatus("INATIVO");
				
				dao.atualizarCliente(c);
				
				//dao.deletarCliente(id);
				
				limparTabela(table);
				
				limparCampos(campoId, campoNome, dateChooser, campoEndereco, campoTelefone);
				
				carregarTabela(table,dao);
			}
		});
		btnApagar.setForeground(Color.WHITE);
		btnApagar.setBackground(new Color(0, 51, 255));
		btnApagar.setBounds(12, 311, 117, 25);
		contentPane.add(btnApagar);
		
		JButton btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				editarCliente(campoId, campoNome, dateChooser, campoEndereco, campoTelefone, dao);
		
				limparTabela(table);
				
				carregarTabela(table, dao);
			}
		});
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setBackground(new Color(0, 51, 255));
		btnEditar.setBounds(12, 348, 117, 25);
		contentPane.add(btnEditar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(365, 50, 582, 303);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "Nome", "Aniversario", "Idade", "Endereco", "Telefone"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(41);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(54);
		table.getColumnModel().getColumn(4).setPreferredWidth(96);
		table.getColumnModel().getColumn(5).setPreferredWidth(88);
		scrollPane.setViewportView(table);
		

		carregarTabela(table,dao);
		
	}
	
	public static void adicionarCliente(JTextField id,JTextField nome, JDateChooser aniversario,JTextField endereco,JTextField telefone,ClienteDao dao) {
		
		Cliente c01 = new Cliente();
		
		c01.setNome(nome.getText());
		
		c01.setEndereco(endereco.getText());
		
		c01.setDataNascimento(aniversario.getDate());
		
		c01.setTelefone(telefone.getText());
		
		dao.salvarCliente(c01);
		
		limparCampos(id,nome,aniversario,endereco,telefone);
	}
	
	public static void editarCliente(JTextField id,JTextField nome, JDateChooser aniversario,JTextField endereco,JTextField telefone,ClienteDao dao) {
		
		Cliente c01 = new Cliente();
		
		c01.setId(Long.parseLong(id.getText()));
		
		c01.setNome(nome.getText());
		
		c01.setEndereco(endereco.getText());
		
		c01.setDataNascimento(aniversario.getDate());
		
		c01.setTelefone(telefone.getText());
		
		dao.atualizarCliente(c01);
		
		limparCampos(id,nome,aniversario,endereco,telefone);
	}
		
	public static void listarCliente(JTable table,JTextField id,JTextField nome,JDateChooser aniversario , JTextField endereco, JTextField telefone) {
		
		int indice = table.getSelectedRow();
		
		String sDate1= table.getValueAt(indice, 2).toString();  
	    Date date1 = null;
	    
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	    System.out.println(sDate1+"\t"+date1);  
		
		
		id.setText(table.getValueAt(indice, 0).toString());
		nome.setText(table.getValueAt(indice, 1).toString());
		aniversario.setDate(date1);
		endereco.setText(table.getValueAt(indice, 4).toString());
		telefone.setText(table.getValueAt(indice, 5).toString());
		
	}
	
	public static void carregarTabela(JTable table, ClienteDao dao) {
		
		List<Cliente> lista = dao.retornarClientes();
		
		for(Cliente c : lista) {
			
			LocalDate nascimento = c.geDate();
						
			Integer idade = (int) nascimento.until(LocalDate.now(), ChronoUnit.YEARS);
			
			Object[] linha = {c.getId(),c.getNome(),c.getDataNascimento(),
											idade,c.getEndereco(),c.getTelefone()};
			
			((DefaultTableModel) table.getModel()).addRow(linha);
		}
	}
	
	public static void limparCampos(JTextField id, JTextField nome, JDateChooser aniversario,JTextField endereco,JTextField telefone) {
		
		id.setText("");
		nome.setText("");
		aniversario.setDate(null);
		endereco.setText("");
		telefone.setText("");
	}
	
	public static void limparTabela(JTable table) {
		
		((DefaultTableModel) table.getModel()).setRowCount(0);
	}
}
