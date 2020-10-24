package exCondicionais;

import java.util.Scanner;

public class duracao_tempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		System.out.println("Qual a hora inicial?");
		Scanner sc = new Scanner(System.in);

		int horainicial = sc.nextInt();

		System.out.println("Qual a hora final do Jogo?");

		Scanner rc = new Scanner(System.in);

		int horafinal = rc.nextInt();
		int duracao;

		if (horainicial >= 1 && horainicial < horafinal) {
			duracao = horafinal - horainicial;
		} else {
			duracao = 24 - horainicial + horafinal;
		}
		System.out.println(" O jogo durou " + duracao + " Hora(S) ");
		sc.close();
		rc.close();
	}

}
