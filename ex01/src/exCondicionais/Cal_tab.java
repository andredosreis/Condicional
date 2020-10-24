package exCondicionais;

import java.util.Scanner;

public class Cal_tab {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		System.out.println(" Qual o Codigo deseja?");
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();

		System.out.println("Quantidade ?");

		Scanner rc = new Scanner(System.in);

		int quantidade = rc.nextInt();

		double total=0;

		switch (codigo) {
		case 1:
			total = quantidade * 4.0;
			break;

		case 2:

			total = quantidade * 4.5;

			break;
		case 3:

			total = quantidade * 5.0;

			break;
		case 4:
			total = quantidade * 2.0;

			break;

		case 5:

			total = quantidade * 1.50;
			break;

		default:

			System.out.printf("Valor invalido");
			break;
		}
		System.out.println(" O valor é:" + total);
	}

}
