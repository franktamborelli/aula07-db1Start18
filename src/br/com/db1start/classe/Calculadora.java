package br.com.db1start.classe;

public class Calculadora {
	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer somarNumero(Integer numero1, Integer numero2) {
		Integer soma;
		soma = numero1 + numero2;

		return soma;
	}

	public Integer subtrairNumero(Integer numero1, Integer numero2) {
		Integer subtracao;
		subtracao = numero1 - numero2;

		return subtracao;
	}

	public Integer dividirNumero(Integer numero1, Integer numero2) {
		Integer dividir;
		dividir = numero1 / numero2;

		return dividir;
	}

	public Integer multiplicarNumero(Integer numero1, Integer numero2) {
		Integer multiplicar;
		multiplicar = numero1*numero2;
		
		return multiplicar;
	}
}
