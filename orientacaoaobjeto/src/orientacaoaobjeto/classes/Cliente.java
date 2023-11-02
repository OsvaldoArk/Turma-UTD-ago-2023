package orientacaoaobjeto.classes;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import orientacaoaobjeto.classes.enums.StatusEnum;



public class Cliente extends Pessoa{

	private String codigo;
	//um pra muitos
	private List<Animal> pets;
	private StatusEnum status;
	
	public Cliente() {
		
	}
	
	public Cliente(String codigo,String nome, LocalDate dataDeNascimento, 
												String endereco, List<Animal> pets) {
		super(nome, dataDeNascimento, endereco);
		this.codigo = codigo;
		this.pets = pets;
		this.status = StatusEnum.ATIVO;
	}
	
	public Cliente(String nome, LocalDate dataDeNascimento, 
			String endereco) {
		super(nome, dataDeNascimento, endereco);
		this.status = StatusEnum.ATIVO;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public List<Animal> getPets() {
		return pets;
	}
	
	public String getPetsString() {
		
		String animais = "";
		
		for(Animal pet : getPets()) {
			
			animais = animais.concat(pet.getNome()+", ");
		}
		
		return animais.substring(0, animais.length()-2);
	}
	
	public void setPets(List<Animal> pets) {
		this.pets = pets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(codigo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + getNome() + ", idade="
				+ getIdade() + ", data de nascimento=" + getDataDeNascimento() + ", endereco=" + getEndereco()
				+", pets=" + getPetsString()+"]";
	}
}
