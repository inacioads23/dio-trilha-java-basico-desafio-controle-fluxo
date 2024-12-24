package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int parametroUm = 0, parametroDois = 0;

		try {
			System.out.print("Digite o primeiro valor: ");
			parametroUm = ler.nextInt();

			System.out.print("Digite o segundo valor: ");
			parametroDois = ler.nextInt();

			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("\nO primero valor não pode ser maior que o segundo valor");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = parametroDois - parametroUm;
			int contagem1 = parametroDois - parametroUm;

			System.out.println("\nOpção 1");
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + (contagem + i));
			}

			System.out.println("\nOpção 2");
			for (int i = 1; i <= contagem1; i++) {
				System.out.println("Imprimindo o índice " + i);
			}
		}
	}
}
