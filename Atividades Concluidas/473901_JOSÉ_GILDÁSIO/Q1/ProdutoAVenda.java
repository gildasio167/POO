public class ProdutoAVenda {
    String nome;
    Integer estoque;
    Double preco;

    public ProdutoAVenda(String nome, Integer estoque, Double preco){
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Integer getEstoque(){
        return this.estoque;
    }
    public Double getPreco(){
        return this.preco;
    }
    public Double getValorDoEstoque(){
        return (getEstoque()*getPreco());
    }
    public Boolean removerEstoque(){
        int valor = 1;
        if(this.estoque >= valor){
            this.estoque -= valor;
            return true;
        }
        return false;
    }
    public void setPreco(Double preco){
        if(preco > 0.0){
            this.preco += preco;
        }
    }
    public void adicionarEstoque(Integer estoque){
        if(estoque > 0){
            this.estoque += estoque;
        }
    }
}
