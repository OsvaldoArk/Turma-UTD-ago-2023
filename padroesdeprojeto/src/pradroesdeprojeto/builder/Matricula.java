package pradroesdeprojeto.builder;

import java.util.Objects;

public class Matricula {

	private Long cadastro;
	private Aluno aluno;
	private ResponsavelFinanceiro responsavel;
	private Boolean situacao;
	
	public Matricula(){}

	public Matricula(Long cadastro, Aluno aluno, ResponsavelFinanceiro responsavel) {
		super();
		this.cadastro = cadastro;
		this.aluno = aluno;
		this.responsavel = responsavel;
	}

	public Long getCadastro() {
		return cadastro;
	}

	public void setCadastro(Long cadastro) {
		this.cadastro = cadastro;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ResponsavelFinanceiro getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(ResponsavelFinanceiro responsavel) {
		this.responsavel = responsavel;
	}

	public Boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cadastro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return Objects.equals(cadastro, other.cadastro);
	}

	@Override
	public String toString() {
		return "Matricula [cadastro=" + cadastro + ", aluno=" + aluno + ", responsavel=" + responsavel + "]";
	};
}
