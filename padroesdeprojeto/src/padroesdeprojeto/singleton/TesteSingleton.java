package padroesdeprojeto.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
	
		Singleton ton = Singleton.getInstance();
		
		Singleton ton2 = Singleton.getInstance();
		
		ton.setNome("Paulo");
		
		System.out.println(ton);
		
		System.out.println(ton2.getNome());
	}
}
