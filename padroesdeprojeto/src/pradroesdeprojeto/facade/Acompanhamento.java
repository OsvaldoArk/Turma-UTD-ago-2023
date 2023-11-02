package pradroesdeprojeto.facade;

public abstract class Acompanhamento extends Sorvete{

	protected Sorvete sorvete;
	
	public Acompanhamento(String descricao,Sorvete sorvete) {
		super(descricao);
		
		this.sorvete = sorvete;
	}
	
	public abstract String getDescricao();
	
}
