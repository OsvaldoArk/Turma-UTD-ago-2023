package orientacaoaobjeto.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private String endereco;
	
	{
		
	}
	
	public Pessoa() {
	}
	
	public Pessoa(String nome,LocalDate dataDeNascimento, String endereco) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return (int) dataDeNascimento.until(LocalDate.now(),ChronoUnit.YEARS);
	}
	
	public String getDataDeNascimento() {
		
		DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/uu");
						
		return dataDeNascimento.format(formatoBr); 
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		
		DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		this.dataDeNascimento = this.dataDeNascimento.parse(dataDeNascimento, formatoBr);
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public abstract String toString();
}