package pradroesdeprojeto.facade;

public class CaldaDeChocolate extends Acompanhamento{

	public CaldaDeChocolate(Sorvete sorvete) {
		super("chocolate",sorvete);
	}
	
	public String getDescricao() {
		return sorvete.getDescricao()+" com calda de chocolate";
	}
	
	public double preco() {
		return sorvete.preco() + 5;
	}
	
}
