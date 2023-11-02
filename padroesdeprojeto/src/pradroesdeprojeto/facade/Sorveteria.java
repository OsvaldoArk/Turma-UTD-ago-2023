package pradroesdeprojeto.facade;

public class Sorveteria {

	public static void main(String[] args) {
		
		MentaChocolate preferido = new MentaChocolate("sorvete de menta com chocolate");

		System.out.println(preferido.getDescricao()+" "+preferido.preco());
		
		CaldaDeMorango cm = new CaldaDeMorango(preferido);
		
		System.out.println(cm.getDescricao()+" "+cm.preco());
		
		CaldaDeChocolate cc = new CaldaDeChocolate(cm);
		
		System.out.println(cc.getDescricao()+" "+cc.preco());
	}

}
