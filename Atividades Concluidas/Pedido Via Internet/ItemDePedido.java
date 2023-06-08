
public class ItemDePedido {
	String codigo;
	String descricao;
	int quantidade;
	Double peso;
	Double valorUnitario;
	
	ItemDePedido(String codigo, String descricao, int quantidade, Double peso, Double valorUnitario) {
		codigo = codigo;
		descricao = descricao;
		quantidade = quantidade;
		peso = peso;
		valorUnitario = valorUnitario;
	}
	public String getCodigo(){
		return this.codigo;
	}
	public String getDescricao(){
		return this.descricao;
	}
	public Integer getQuantidade(){
		return this.quantidade;
	}
	public Double getPeso(){
		return this.peso;
	}
	public Double getValorUnitario(){
		return this.valorUnitario;
	}
	
	public Double getValorTotal() {
		//Double quant = getQuantidade();
		//Double valorun = getValorUnitario();
		//return (quant * valorun);
		return (getValorUnitario()*getQuantidade());
	}
	
	public Double getPesoTotal() {
		return (getPeso()*getQuantidade());
	}
}
