package aplicacaografica.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Cliente {

	private String nome;
	private LocalDate dataNascimento;
	private String endereco;

	public Cliente() {
		
	}	
	
	public Cliente(String nome, LocalDate dataNascimento, String endereco) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		
		DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		return dataNascimento.format(formatoBR);
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", dataNascimento=" + getDataNascimento() + ", endereco=" + endereco + "]";
	}	
}
