package orientacaoaobjeto.classes.enums;

public enum StatusEnum {

	ATIVO(1,"ativo"),SUSPENSO(2,"suspenso"),DESLIGADO(3,"desligado"),EM_ANALISE(4,"em análise");
	
	private int codigo;
	private String descricao;
		
	private StatusEnum(int codigo,String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getcodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
