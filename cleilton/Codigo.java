public class Conta{
    int codigo;
    double saldo;
    double limite = 100;

public Conta(int codigo, double saldo){
    this.codigo = codigo;
    this.saldo = saldo;
}

public double emitirSaldo(){
    return saldo;
}

public boolean sacar(double saldosacar){
    if (saldosacar <= this.saldo){
        this.saldo = saldo - saldosacar;
        return true;
    } else {
        return false;
    }
}

public void depositar(double valordep){
    this.saldo = saldo + valordep;
}
}
