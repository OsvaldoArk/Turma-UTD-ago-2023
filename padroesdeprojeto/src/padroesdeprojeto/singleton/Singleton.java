package padroesdeprojeto.singleton;

public class Singleton {

	private static Singleton singleton;
	
	private String nome;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) singleton = new Singleton();
		
		return singleton;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
