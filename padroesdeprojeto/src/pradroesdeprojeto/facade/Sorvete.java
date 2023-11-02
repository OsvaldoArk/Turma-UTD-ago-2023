package pradroesdeprojeto.facade;

public abstract class Sorvete {

	private String descricao;
	
	public Sorvete(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double preco();
}
