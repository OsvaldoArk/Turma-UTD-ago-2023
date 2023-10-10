package orientacaoaobjeto.intefaces;

public class FuncaoDeAltaOrdem {

	public static void main(String[] args) {
		
		Operacao soma = (x,y)-> x + y;
		Operacao subtracao = (x,y)-> x - y;
		Operacao multiplicacao = (x,y)-> x * y;
		Operacao divisao = (x,y)-> x / y;		
		
		//System.out.println(soma.calcula(25,43));
		//System.out.println(subtracao.calcula(25,43));
		//System.out.println(multiplicacao.calcula(25,43));
		//System.out.println(divisao.calcula(25,43));
		//System.out.println(executar(calcula,25,43);
		
		System.out.println(executar((x,y)-> x % y,43,25));
	}
	
	public static int executar(Operacao op,int x, int y) {
		return op.calcula(x, y);
	}
}
