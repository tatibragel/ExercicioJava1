package exercicio;

import java.util.Scanner;
import java.util.Locale;

public class resolucao {

	public static void main(String[] args) {
		// Crie um programa que exiba a tabuada de um número informado pelo usuário.

		Locale.setDefault(new Locale("pt", "BR"));
		
		int n = 0;
		int i = 0;
				
		String valorLido = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Programa que exibe a tabuada de um numero");
		System.out.println("");
		System.out.print("Informe um número: ");
		valorLido = sc.nextLine();
		n = Integer.parseInt(valorLido);
		
		for (i = 0; i < 11; i++) {
			int resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
			
		}
        
		sc.close();

	}

}
