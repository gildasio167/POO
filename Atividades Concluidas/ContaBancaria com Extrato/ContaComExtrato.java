
public class ContaComExtrato{
	int codigo;
	Double saldo;
	Double limite = 100.00;
	Double[] extrato;
	int transacoes = 0;

	public ContaComExtrato(int codigo, Double saldo){
		this.codigo = codigo;
		this.saldo = saldo;
		this.extrato = new Double[20];
		guardarExtrato(saldo);
	}

	
	public void alterarLimite(Double novoLimite){
		this.limite = novoLimite;
	}

	public Double emitirSaldo(){
		return this.saldo += this.limite;
	}

	public void depositar(Double valor){
		if(valor > 0){
			this.saldo += valor;
			guardarExtrato(valor);
		}
	}

	public Boolean sacar(Double valor){
		if(valor > 0 && valor <= (this.saldo + this.limite)){
			//if(valor > this.limite){
			//	this.saldo -= limite;
			//	guardarExtrato(-limite);
			//	return true;
			//}

			if(valor > this.saldo){
				this.saldo -= limite;
				return false;
			}
			this.saldo -= valor;
			this.saldo -= limite;
			guardarExtrato(-valor);			
			return true;
		} else {
			return false;
		}
	}

	//public void saldo(Double valor){
	//	this.saldo = valor;
	//	guardarExtrato(valor);
	//}

	public void guardarExtrato(Double valor){
			this.extrato[transacoes] = valor;
			this.transacoes += 1;
	}

	public Double[] emitirExtrato(){
		//Corrigir essa função
			return this.extrato;

	} 
}