
public class Poupanca extends Conta {

	int numeroSaques;
	double tarifa = 0;

	public Poupanca(String agencia, int nConta, String nomeTitular, double saldo) {
		super(agencia, nConta, nomeTitular, saldo);
	}

	public void sacar(double valor) {
		super.sacar(valor);
		this.numeroSaques += 1;

		if (this.numeroSaques >= 1 && this.numeroSaques <= 3) {
			this.tarifa = 12.00;
		} else if (this.numeroSaques > 3) {
			this.tarifa = 20.00;
		}

	}

	public double getTarifa() {
		return this.tarifa;
	}

}
