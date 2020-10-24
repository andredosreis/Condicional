package exCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Initervalo_entre_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um numero?");
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor < 0 || valor >100) {
			System.out.println(" Fora do intervalo");
		}
		
		else if (valor >= 0 && valor <= 25) {
			System.out.println("intervalo 0, 25");
			
		} else if (valor >25 && valor <= 50) {
			System.out.println("intervalo 25,50");
			
		}else if (valor > 50 && valor <= 75) {
			System.err.println("intervalo 50,75");
			
		} else {
			System.out.println(" intervalo de 75, 100");
			
		}{

		}
		sc.close();

	}

}
