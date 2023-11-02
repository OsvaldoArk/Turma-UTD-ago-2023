package aplicacaografica.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import aplicacaografica.conexao.ConnectionFactory;

public class ClienteDao {

	private static Connection con;
	
	public ClienteDao(){
			con = ConnectionFactory.createConnection();
	}
	
	public void salvarCliente(Cliente c) {
		
		String sql = "insert into clientes (nome,data_nascimento,endereco,status,telefone) values(?,?,?,?,?)";
		
		try {
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
			
			String data = c.geDate().format(df);
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, c.getNome());
			
			pst.setString(2, data);
			
			pst.setString(3, c.getEndereco());
			
			pst.setString(4,c.getStatus());
			
			pst.setString(5,c.getTelefone());
			
			pst.execute();
			
			System.out.println("inserção realizada com sucesso!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public Cliente encontrarClientePeloId(Long id) {
		
		String sql = "select * from clientes where id = ?";
		
		try {
		
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setLong(1,id);
			
			ResultSet rs = pst.executeQuery();
			
			Cliente c = new Cliente();

			while(rs.next()) {
				
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setDataNascimento(rs.getDate("data_nascimento"));
				c.setEndereco(rs.getString("endereco"));
				c.setStatus(rs.getString("status"));
				c.setTelefone(rs.getString("telefone"));
			}
		
			return c;
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			
			return null;
		}
	}
	
		public List<Cliente> retornarClientes() {

			List<Cliente> clientes = new ArrayList<>();
			
			String sql = "select * from clientes where status <> 'INATIVO'";
			
			try {
			
				PreparedStatement pst = con.prepareStatement(sql);
				
				ResultSet rs = pst.executeQuery();

				while(rs.next()) {
					
					Cliente c = new Cliente();
					
					c.setId(rs.getLong("id"));
					c.setNome(rs.getString("nome"));
					c.setDataNascimento(rs.getDate("data_nascimento"));
					c.setEndereco(rs.getString("endereco"));
					c.setStatus(rs.getString("status"));
					c.setTelefone(rs.getString("telefone"));
					
					clientes.add(c);
				}
			
				return clientes;
				
			} catch (SQLException e) {
			
				e.printStackTrace();
				
				return null;
			}
			
		} 
		
		public void atualizarCliente(Cliente c) {
			
			String sql = "update clientes set nome=?,data_nascimento=?,endereco=?,status=?,telefone=? where id = ?";
			
			try {
				
				DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
				
				String data = c.geDate().format(df);
				
				PreparedStatement pst = con.prepareStatement(sql);
				
				pst.setString(1, c.getNome());
				
				pst.setString(2, data);
				
				pst.setString(3, c.getEndereco());
				
				pst.setString(4,c.getStatus());
				
				pst.setString(5,c.getTelefone());
				
				pst.setLong(6, c.getId());
				
				pst.execute();
				
				System.out.println("atualização realizada com sucesso!");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
		public void deletarCliente(Long id) {
		
			String sql = "delete from clientes where id = ?";
			
			try {
				
				PreparedStatement pst = con.prepareStatement(sql);
				
				pst.setLong(1, id);
				
				pst.execute();
				
				System.out.println("registro deletado com sucesso!");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
