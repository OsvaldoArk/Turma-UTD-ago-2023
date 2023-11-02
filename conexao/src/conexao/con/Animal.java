package conexao.con;

import java.util.Objects;

public class Animal {

	private String nome;
	private String especie;
	private String raça;
	private Integer idade;
	
	public Animal() {
		
	}
	
	public Animal(String nome, String especie, String raça, Integer idade) {
	
		this.nome = nome;
		this.especie = especie;
		this.raça = raça;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(especie, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(especie, other.especie) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", especie=" + especie + ", raça=" + raça + ", idade=" + idade + "]";
	}
}
