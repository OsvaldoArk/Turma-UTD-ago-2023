package orientacaoaobjeto.classes;

import java.time.LocalDate;

public class Veterinario extends Pessoa implements Salario{

	private String crm;
	private String especialidade;
	
	public Veterinario(String crm, String nome,LocalDate dataDeNascimento,
										String endereco,String especialidade) {
		super(nome,dataDeNascimento,endereco);
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "Veterinário : { crm:"+crm+", nome: "+getNome()+", data de nascimento: "+getDataDeNascimento()+
				", idade: "+getIdade()+", endereço: "+getEndereco()+", especialidade: "+especialidade+"}";
	}

	@Override
	public double descontoAlimentacao(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double descontoTransporte(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ganhoProducao(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double participacaoLucros(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}
}
