
public class Programa {

	int numeroSaques;

	public static void main(String[] args) {

		Conta c1 = new Corrente("Itau", 111111, "Mauricio Meireles", 3000.00);
		Conta c2 = new Corrente("Bradesco", 2222222, "Raul Gentil", 5700.00);

		Conta p1 = new Poupanca("Nu Conta", 33333333, "Jose Augusto", 22080.00);
		Conta p2 = new Poupanca("Caixa", 4444444, "Marcos Aurelio", 55130.00);

		Conta s1 = new Salario("Santander", 555555555, "Cleide Augusta", 5000.00);
		Conta s2 = new Salario("Sicredi", 66666666, "Ricardo Amorim", 4100.00);

		c1.sacar(300);
		c1.sacar(150);
		c1.sacar(510);
		c1.sacar(40);

		c2.sacar(534);
		c2.sacar(231);
		c2.sacar(335);
		c2.sacar(782);
		c2.sacar(354);
		c2.sacar(374);
		c2.sacar(789);
		c2.sacar(954089);
		c2.sacar(744);
		c2.sacar(691);
		c2.sacar(45);

		p1.sacar(4600);
		p1.sacar(7500);

		p2.sacar(7500);
		p2.sacar(500);
		p2.sacar(1400);
		p2.sacar(450);

		s1.sacar(500);
		s1.sacar(900);

		s2.sacar(1200);

		Relatorio tarifas = new Relatorio();
		tarifas.contas.add(c1);
		tarifas.contas.add(c2);
		tarifas.contas.add(p1);
		tarifas.contas.add(p2);
		tarifas.contas.add(s1);
		tarifas.contas.add(s2);

		tarifas.totalArrecadado();
	}

}
