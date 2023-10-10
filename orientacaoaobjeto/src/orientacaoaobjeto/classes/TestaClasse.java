package orientacaoaobjeto.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import orientacaoaobjeto.classes.enums.StatusEnum;

public class TestaClasse {

	public static void main(String[] args) {
		
		//Pessoa p01 = new Pessoa("Claúdia",LocalDate.of(1995, Month.FEBRUARY, 28),"Parquelândia");

		Veterinario v01 = new Veterinario("123456","Lua",LocalDate.of(1991, Month.JANUARY, 10)
															,"Presidente Kennedy","Clinica Geral");
		//System.out.println(v01);
		
		Animal animal = new Animal("Bolota","gato","sem raça",18);
		
		Animal animal02 = new Animal("Bixano","gato","sem raça",10);
				
		List<Animal> animais = new ArrayList<>();
		
		animais.add(animal);
		
		animais.add(animal02);
		
		Cliente c01 = new Cliente("Luciana",LocalDate.of(2000, Month.APRIL, 1),"Eusébio");
		
		c01.setStatus(StatusEnum.EM_ANALISE);
		
		System.out.println(c01.getStatus().getDescricao());
		
		//System.out.println(p01);
		
		/*
		p01.nome = "Hanna";
		
		System.out.println(p01.nome);
		System.out.println(p01.idade);
		System.out.println(p01.dataDeNascimento);
		System.out.println(p01.endereco);
		
		Pessoa p02 = new Pessoa();
		p02.nome = "Lúcia";
		p02.dataDeNascimento = LocalDate.of(1995, Month.FEBRUARY, 10);
		p02.endereco = "Aldeota";
				

		
		System.out.println(p02.nome);
		System.out.println(p02.idade);
		System.out.println(p02.dataDeNascimento);
		System.out.println(p02.endereco);
		*/
		try {
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "insert into clientes (nome,data_nascimento,endereco) values('alessandra','2005-11-03','varjota')";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.execute();
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
