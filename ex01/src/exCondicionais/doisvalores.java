package exCondicionais;

import java.util.Scanner;

public class doisvalores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/
		
		System.out.println("Digite um numero x ?");
		Scanner  sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("Digite um numero y");
		Scanner rc = new Scanner(System.in);
		int y=rc.nextInt();
		
		
		
		if (x % y == 0 || y % x == 0) {
		System.out.println("Ele mutitplo");
			
		}else {
			System.out.println("Não Sao Multiplos");
		}
	}

}
