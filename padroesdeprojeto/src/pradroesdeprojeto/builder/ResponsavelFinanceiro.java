package pradroesdeprojeto.builder;

import java.time.LocalDate;
import java.util.Objects;

public class ResponsavelFinanceiro {

	private String nome;
	private LocalDate dataNascimento;
	private String telefone;
	private String endereco;
	
	public ResponsavelFinanceiro() {};
	
	public ResponsavelFinanceiro(String nome, LocalDate dataNascimento, String telefone, String endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		ResponsavelFinanceiro other = (ResponsavelFinanceiro) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "ResponsavelFinanceiro [nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone
				+ ", endereco=" + endereco + "]";
	}
}
