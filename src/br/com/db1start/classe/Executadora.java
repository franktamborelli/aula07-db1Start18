package br.com.db1start.classe;

import java.util.Scanner;

public class Executadora {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		Calculadora operacao = new Calculadora();
		Integer numeroDigitado;
		Integer numeroDigitado1;

		String opcao = new String();

		System.out.println(" +  |  -  |  /  |  * ");
		opcao = leitura.nextLine();

		System.out.println("Digite o numero");
		numeroDigitado = leitura.nextInt();

		System.out.println("Digite outro numero");
		numeroDigitado1 = leitura.nextInt();

		switch (opcao) {
		case "+":
			System.out.println(operacao.somarNumero(numeroDigitado, numeroDigitado1));
			break;

		case "-":
			System.out.println(operacao.subtrairNumero(numeroDigitado, numeroDigitado1));
			break;

		case "/":
			System.out.println(operacao.dividirNumero(numeroDigitado, numeroDigitado1));
			break;

		case "*":
			System.out.println(operacao.multiplicarNumero(numeroDigitado, numeroDigitado1));
			break;
		}

	}

}
