package pradroesdeprojeto.facade;

public class CaldaDeMorango extends Acompanhamento{

	public CaldaDeMorango(Sorvete sorvete) {
		super("morango",sorvete);
	}
	
	public String getDescricao() {
		return sorvete.getDescricao()+" com calda de morango";
	}
	
	public double preco() {
		return sorvete.preco() + 3;
	}
	
}
