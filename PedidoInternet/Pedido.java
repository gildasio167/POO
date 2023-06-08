public class Pedido {
    ItemDePedido[] items;
    String numeroPedido;
    String cidade;
    String estado;

    Integer cursor;

    public Pedido(String numeroPedido, String cidade, String estado){
        this.numeroPedido = numeroPedido;
        this.cidade = cidade;
        this.estado = estado;
        items = new ItemDePedido[50];
        cursor = 0;
    }
    public void adicionarItem(String codigo, String descricao, Integer quantidade, Double peso, Double valorUnitario){
        this.items[cursor] = new ItemDePedido(codigo, descricao, quantidade, peso, valorUnitario);
        this.cursor++;
       // return this.items[i]; 
    }
    public Double getValorTotal(){

    }
    public Double getValorFrete(){

    }

}
