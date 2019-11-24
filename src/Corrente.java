
public class Corrente extends Conta {

	int numeroSaques;
	double tarifa = 0;

	public Corrente(String agencia, int nConta, String nomeTitular, double saldo) {
		super(agencia, nConta, nomeTitular, saldo);
	}

	public void sacar(double valor) {
		super.sacar(valor);
		this.numeroSaques += 1;

		if (this.numeroSaques >= 1 && this.numeroSaques <= 5) {
			this.tarifa = 28.00;
		} else if (this.numeroSaques >= 6 && this.numeroSaques <= 10) {
			this.tarifa = 45.00;
		} else if (this.numeroSaques > 10) {
			this.tarifa = 60.00;
		}
	}

	public double getTarifa() {
		return this.tarifa;
	}
}
