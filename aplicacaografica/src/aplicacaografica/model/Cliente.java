package aplicacaografica.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Cliente {

	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String endereco;
	private String status;
	private String telefone;
	private List<Animal> animais;

	public Cliente() {
		this.status = "ATIVO";
	}	
	
	public Cliente(String nome, LocalDate dataNascimento, String endereco,String telefone) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.status = "ATIVO";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate geDate() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		
		LocalDate localDate = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(dataNascimento));
		
		//System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dataNascimento));
		
		this.dataNascimento = localDate;
		
		//this.dataNascimento = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public int getIdade() {
		
		return (int) this.dataNascimento.until(LocalDate.now(),ChronoUnit.YEARS);
	}
	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
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
		return "Cliente [nome=" + nome + ", dataNascimento=" + getDataNascimento() +" idade: "+getIdade()+ ", endereco=" + endereco + ", telefone="+telefone+"]";
	}	
}
