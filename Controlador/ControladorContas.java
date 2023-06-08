import java.util.ArrayList;

public class ControladorDeContas {

    private ArrayList<ContaComExtrato> contas = new ArrayList<ContaComExtrato>();

    public boolean criarConta(String codigo, double saldo) {
        if (buscarConta(codigo) == null) {
            ContaComExtrato novaConta = new ContaComExtrato(codigo, saldo);
            contas.add(novaConta);
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(String codigo, double valor) {
        ContaComExtrato conta = buscarConta(codigo);
        if (conta != null && conta.sacar(valor)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(String codigo, double valor) {
        ContaComExtrato conta = buscarConta(codigo);
        if (conta != null) {
            conta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(String codigoOrigem, String codigoDestino, double valor) {
        ContaComExtrato contaOrigem = buscarConta(codigoOrigem);
        ContaComExtrato contaDestino = buscarConta(codigoDestino);

        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double emitirSaldo(String codigo) {
        ContaComExtrato conta = buscarConta(codigo);
        if (conta != null) {
            return conta.emitirSaldo();
        } else {
            return -1.0;
        }
    }

    private ContaComExtrato buscarConta(String codigo) {
        for (ContaComExtrato conta : contas) {
            if (conta.getCodigo().equals(codigo)) {
                return conta;
            }
        }
        return null;
    }

}
