import java.util.ArrayList;

public class Relatorio {

	ArrayList<Conta> contas = new ArrayList<>();

	void totalArrecadado() {

		double valorArrecadado = 0;

		for (Conta conta : contas) {
			valorArrecadado += conta.getTarifa();
		}

		System.out.println("O valor total arrecadado pelo banco foi de R$" + valorArrecadado);
	}
}
