public class CartaoRU {
    String idCartao;
    String siapeDiscente;
    Boolean isencao;
    Double saldo = 0.00;

    public CartaoRU(String _idCartao, String _siapeDiscente, Boolean _isencao){
        this.idCartao = _idCartao;
        this.siapeDiscente = _siapeDiscente;
        this.isencao = _isencao;
    }

    public void recarregar(Double valor){
        if(valor > 0){
        this.saldo += valor;
        } else {
            System.out.println("Erro ao recarregar");
        }
    }

    public boolean fazerRefeicao(){
        if(this.isencao == true){
            return true;
        } else {
            if(this.saldo >= 1.10){
                saldo -= 1.10;
                return true;
            } else {
                return false;
            }
        }
    }

    public double emitirSaldo(){
        return this.saldo;
    }
    void alterarIsencao(Boolean ye){
        this.isencao = ye;
    }


}
