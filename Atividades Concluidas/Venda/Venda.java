public class Venda {
    ItemDeVenda[] items;
    String numeroNotaFiscal;
    int cursor;

    public Venda(String numeroNotaFiscal){
        this.numeroNotaFiscal = numeroNotaFiscal;
        cursor = 0;
        items = new ItemDeVenda[50];
        }

    public void adicionarItem(String codigo, String descricao, Double quantidade, String unidade, Double valorUnitario){
        ItemDeVenda i = new ItemDeVenda(codigo, descricao, quantidade, unidade, valorUnitario);
        
        if(i.getQuantidade() <= 0.0){
            return;    
        }
        if(i.getValorUnitario() <= 0.0){
            return;
        }
        if(i.getCodigo() == "" || i.getDescricao() == "" || i.getUnidade() == ""){
            return;
        }

        items[cursor] = i;
        cursor++;

    }
    public Double getValorTotal(){
        double total = 0.0;
		for(int i = 0; i < cursor; i++) {
			total += items[i].getValorUnitario() * items[i].getQuantidade();
		}
		return total;
    }
    public String imprimir(){
        String notaF = "";
		for(int i = 0; i < cursor; i++) {
			notaF += items[i].imprimir();
		}
		
		notaF += "Valor total " + getValorTotal() + "\n";
		notaF += "Nota fiscal " + numeroNotaFiscal + "\n";

        return notaF;
    }
}
