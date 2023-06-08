public class Conta {
    int codigo;
    double saldo;
    double limite;

    public Conta(int codigo, double saldo){
        this.codigo = codigo;
        this.saldo = saldo;
        this.limite = 100.00;
    }

    public void alterarLimite(double novoLimite){
        this.limite = novoLimite;
    }

    public double emitirSaldo(){
        return this.saldo += limite;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= (this.saldo + this.limite)){
            if(valor > this.saldo){
                this.saldo -= limite;
                return false;
            }
            this.saldo -= valor;
            this.saldo -= limite;
            return true;
        } else {
            return false;
        }   
    }
}
