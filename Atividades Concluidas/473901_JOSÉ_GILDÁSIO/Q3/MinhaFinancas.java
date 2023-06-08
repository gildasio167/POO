public class MinhaFinancas {

    MinhasFinancas[] financas;
    Integer cursor;
    String nome;

    public MinhasFinancas(String nome){
        this.nome = nome;
        cursor = 0;
        financas = new MinhasFinancas[50];
    }
    public Boolean adicionarReceita(String desc, Double valor, boolean tipo){
        MinhasFinancas i = new MinhasFinancas(desc, valor);

        if(i.getDesc() == "" || i.getValor() <= 0.0){
            return false;
        }
        financas[cursor] = i;
        cursor++;
        return true;
    }
    public Boolean adicionarDespesa(String desc, Double valor){
        MinhasFinancas i = new MinhasFinancas(desc, valor);

        if(i.getDesc() == "" || i.getValor() <= 0.0){
            return false;
        }
        financas[cursor] = i;
        cursor++;
        return true;
    }
    public getTotalReceitas(){
        double total = 0.0;
        for(int i = 0; i < this.cursor; i++){
            total += this.financas[i].getValor();

        }
        return total;
    }
    public getTotalDespesas(){
        double total = 0.0;
        for(int i = 0; i < this.cursor; i++){
            if(desc )
            total += this.financas[i].getValor();

        }
        return total;
    }
    public Double getSaldoGeral(){

    }
}
