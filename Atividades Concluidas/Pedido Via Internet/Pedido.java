public class Pedido {
	ItemDePedido[] itens;
	String numeroPedido;
	String cidade;
	String estado;
	int cursor;
	
	public Pedido(String numeroPedido, String cidade, String estado) {
		cursor = 0;
		itens = new ItemDePedido[50];
		this.numeroPedido = numeroPedido;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void adicionarItem(String codigo, String descricao, int quantidade, Double peso, Double valorUnitario) {
		ItemDePedido i = new ItemDePedido(codigo, descricao, quantidade, peso, valorUnitario);

		if(i.getQuantidade() <= 0) {
			return;
		}
		if(i.getValorUnitario() <= 0.0) {
			return;
		}
		if(i.getPeso() <= 0.0) {
			return;
		}
		if(i.getCodigo() == "" || i.getDescricao() == "") {
			return;
		}
		
		itens[cursor] = i;
		cursor++;
	}
	
	Double getValorTotal() {
		Double total = 0.0;
		for(int i = 0; i < cursor; i++) {
			total += itens[i].getValorTotal();
		}
		
		return total;
	}
	
	Double getValorFrete() {
		Double frete = 0.0;
		if(getValorTotal() > 1000) {
			return frete;
		} 
		for(int i = 0; i < cursor; i++) {
			if(estado == "TO" || estado == "PA") {
				frete = 20.0*itens[i].getPeso();
			}
			if(estado == "Centro-Oeste" || estado == "Sudeste") {
				frete = 25.0*itens[i].getPeso();
			}
			if(estado == "Sul") {
				frete = 30.0*itens[i].getPeso();
			}
		}
		return frete;
	}
}



























