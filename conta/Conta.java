public class Conta {
    int codigo;
    double saldo;
    double limite;

    public Conta(int codigo, double saldo){
        this.codigo = codigo;
        this.saldo = saldo;
        this.limite = 200.00;
    }

    public int ContaBancaria(int numero){
        return this.saldo += numero;
    }

    public void alterarLimite(double novoLimite){
        this.limite = novoLimite;
    }

    public double emitirSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
	if(valor > 0){
        this.saldo += valor;
	}
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <=(this.saldo + this.limite)){
        this.saldo -=valor;
        return true;
    	} else {
    		return false;
    	}	
    }
}
