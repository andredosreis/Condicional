package exCondicionais;

import java.util.Scanner;

public class indentificando_par_impa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite um número?");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N % 2 ==0) {
			
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
