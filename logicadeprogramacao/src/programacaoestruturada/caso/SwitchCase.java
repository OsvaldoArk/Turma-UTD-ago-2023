package programacaoestruturada.caso;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int opcao = 10;
		
		switch(opcao) {
			
			case 1: System.out.println("novo jogo");
					break;
			
			case 2: System.out.println("carregar gravação");
					break;
			
			case 3: System.out.println("apagar a gravação");
					break;
					
			case 4: System.out.println("sair do jogo");
					break;
					
			default: System.out.println("opção inválida");
		}
		
		System.out.println("chegou até aqui");
	}
}
