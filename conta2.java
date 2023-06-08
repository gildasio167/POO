public class Conta {
    private int id;           // número de identificação da conta
    private double saldo;     // saldo atual da conta
    private double limite;    // limite da conta
    
    // construtor da classe Conta
    /**
     * @param id
     * @param saldoInicial
     */
    public Conta(int id, double saldoInicial) {
        this.id = id;
        this.saldo = saldoInicial;
        this.limite = 100.00;  // valor inicial do limite
    }
    
    // método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    
    // método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
        }
    }
    
    // método para alterar o limite da conta
    public void alterarLimite(double novoLimite) {
        this.limite = novoLimite;
    }
    
    // método para obter o saldo atual da conta
    public double getSaldo() {
        return this.saldo + this.limite;
    }
}


