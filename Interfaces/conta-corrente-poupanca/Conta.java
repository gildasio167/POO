import java.util.List;

public interface Conta {
    public void alterarLimite(Double novoLimite);
    public Double emitirSaldo();
    public void depositar(Double valor);
    public Boolean sacar(Double valor);
    public List<Double> emitirExtrato();
    public String getCodigo();
}
