
public class Conta {

	String agencia;
	int nConta;
	String nomeTitular;
	double saldo;

	public Conta(String agencia, int nConta, String nomeTitular, double saldo) {

		this.agencia = agencia;
		this.nConta = nConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;

	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public double getTarifa() {
		return 0;
	}

}
