package conexao.con;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class TesteConexao {
	//CRUD
	public static void main(String[] args) {

		Cliente c = new Cliente("Isaura",LocalDate.of(1920, Month.OCTOBER, 17),"MonteCastelo","(85)33418547");
		
		ClienteDao dao = new ClienteDao();
		
		//dao.salvarCliente(c);
		
		//Cliente c2 = dao.encontrarClientePeloId(1l);
		
		//System.out.println(c2);
		/*
		List<Cliente> clientes = dao.retornarClientes();
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
		Cliente c02 = dao.encontrarClientePeloId(3L);
		
		c02.setNome("Luan");
		c02.setTelefone("(85)999884415");
		
		dao.atualizarCliente(c02);
		 */
		
		dao.deletarCliente(4l);
		
	}
}


/*
  		List<Cliente> clientes = new ArrayList<>();
		
		List<Animal> animais = new ArrayList<>();
		
		try {
		
			Connection con = ConnectionFactory.createConnection();
			//jpql
			String sql = "select * from clientes where id = 2";
			
		PreparedStatement pst = con.prepareStatement(sql);
		
		ResultSet resultado = pst.executeQuery();
		
		while(resultado.next()) {
			Cliente cliente = new Cliente();
			
			cliente.setNome(resultado.getString("nome"));
			
			cliente.setDataNascimento(resultado.getDate("data_nascimento"));
			
			cliente.setEndereco(resultado.getString("endereco"));
			
			cliente.setStatus(resultado.getString("status"));
			
			cliente.setTelefone(resultado.getString("telefone"));
			
			clientes.add(cliente);
		}
			
			String sql2 = "select * from pets where cliente_id = 2";

			pst = con.prepareStatement(sql2);
			
			resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Animal pet = new Animal();
				
				pet.setNome(resultado.getString("nome"));
				pet.setIdade(resultado.getInt("idade"));
				pet.setEspecie(resultado.getString("especie"));
				pet.setRaça(resultado.getString("raca"));
				
				animais.add(pet);
			}
			
			clientes.get(0).setAnimais(animais);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Cliente c : clientes) {
			System.out.println(c.getNome()+" "+c.getDataNascimento()+" "+c.getEndereco()+" "+c.getStatus()+" "+c.getTelefone());
		}
		
		for(Animal pet : clientes.get(0).getAnimais()) {
			System.out.println(pet);
		} 
 */