public class ItemDeVenda{
    String codigo;
    String descricao;
    Double quantidade;
    String unidade;
    Double valorUnitario;

    public ItemDeVenda(String codigo, String descricao, Double quantidade, String unidade, Double valorUnitario){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public Double getQuantidade(){
        return this.quantidade;
    }
    public String getUnidade(){
        return this.unidade;
    }
    public Double getValorUnitario(){
        return this.valorUnitario;
    }

    public String imprimir(){
        return "\n"+ getCodigo()+" "+getDescricao()+" "+getQuantidade()+" "+getUnidade()+" "+getValorUnitario()+" "+getValorTotal()+"\n";
    }
    public Double getValorTotal(){
        Double quant = getQuantidade();
        Double valorun = getValorUnitario();
        return (quant * valorun);
    }
}