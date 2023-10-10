package programacaoestruturada.se;

public class SeSenao {

	public static void main(String[] args) {

		int nota = 3;
		boolean ehComportado = false, fazTarefas = true;
		
		if(nota>=7 && nota <= 10) 
			System.out.println("aprovado");
		
		else if(nota >= 4 && nota < 7)
			System.out.println("recuperação");
		
		else if(nota >= 0 && nota < 4) {
			//if else aninhado.
			if(ehComportado && fazTarefas) {

				System.out.println("ré ré");
			}else {
				
				System.out.println("reprovado");
			}
		}
		
		else
			System.out.println("nota inválida");
	}
}
