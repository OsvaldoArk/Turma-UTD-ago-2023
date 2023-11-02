package pradroesdeprojeto.builder;

import java.time.LocalDate;

public class MatriculaBuilder {

	private Matricula instancia;
	
	public MatriculaBuilder() {
		instancia = new Matricula();
	}
	
	public MatriculaBuilder setMatricula(Long cadastro) {
		instancia.setCadastro(cadastro);
		return this;
	}
	
	public MatriculaBuilder setSituacao(Boolean situacao) {
		instancia.setSituacao(situacao);
		return this;
	}
	
	public MatriculaBuilder setAluno(String nome, LocalDate dataAniversario, String serie, String turno) {
		instancia.setAluno(new Aluno(nome,dataAniversario,serie,turno));
		return this;
	}
	
	public MatriculaBuilder setResponsavel(String nome, LocalDate aniversario, String telefone, String endereco) {
		
		ResponsavelFinanceiro f01 = new ResponsavelFinanceiro();
		
		f01.setNome(nome);
		f01.setDataNascimento(aniversario);
		f01.setTelefone(telefone);
		f01.setEndereco(endereco);
	
		instancia.setResponsavel(f01);
		
		return this;
	}
	
	public Matricula build() {
		return instancia;
	}
}
