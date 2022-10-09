package application;

import java.util.Locale;
import java.util.Scanner;

import utils.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String titular = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit: ");
			double deposito = sc.nextDouble();
			conta = new ContaBancaria(numero, titular, deposito);
		} else {
			conta = new ContaBancaria(numero, titular);
		}


		System.out.printf("\nAccount data:\n%s", conta);

		System.out.print("\n\nEnter a deposit value: ");
		double valor = sc.nextDouble();
		conta.realizarDeposito(valor);

		System.out.printf("Updated account data:\n%s", conta);

		System.out.print("\n\nEnter a withdraw value: ");
		valor = sc.nextDouble();
		conta.realizarSaque(valor);

		System.out.printf("Updated account data:\n%s", conta);
		sc.close();
	}

}
