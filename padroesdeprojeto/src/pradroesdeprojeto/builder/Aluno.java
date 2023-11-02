package pradroesdeprojeto.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno {

	private String nome;
	private LocalDate dataNascimento;
	private String serie;
	private String turno;
	
	public Aluno(String nome, LocalDate dataNascimento, String serie, String turno) {
	
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.serie = serie;
		this.turno = turno;
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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
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
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNascimento=" + dataNascimento + ", serie=" + serie + ", turno=" + turno
				+ "]";
	}
}
