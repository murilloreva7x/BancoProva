
public class Salario extends Conta {

	int numeroSaques;
	double tarifa = 0;

	public Salario(String agencia, int nConta, String nomeTitular, double saldo) {
		super(agencia, nConta, nomeTitular, saldo);
	}

	public void sacar(double valor) {
		super.sacar(valor);
		this.numeroSaques += 1;

		if (this.numeroSaques > 1) {
			this.tarifa = 50.00;
		}
	}

	public double getTarifa() {
		return this.tarifa;
	}

}
