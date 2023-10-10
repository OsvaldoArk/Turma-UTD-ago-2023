package programacaoestruturada.caso;

public class SwitchCaseExercicio {
	
	public static void main(String[] args) {
		
		//tipo de desconto de acordo com a tipo de cliente.
		char tipoCliente = 'c';
		double descontoProduto = 0,precoProduto = 0;
		
		switch(tipoCliente) {
			
			case 'a' : descontoProduto = precoProduto * 0.15; break;
			case 'b' : descontoProduto = precoProduto * 0.10; break;
			case 'c' : descontoProduto = precoProduto * 0.05; break;
			case 'd' : descontoProduto = precoProduto * 0.02; break;
			default : System.out.println("tipo de cliente não reconhecido");
		}	
	}
}
