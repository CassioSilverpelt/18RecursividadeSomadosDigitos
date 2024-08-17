package controller;

public class SomaDosDigitosController {
	public SomaDosDigitosController() {
		super();
	}
	
	public int somadosDigitos(int n) {
		if (n < 1){return 0;}
		//Ao dividir o N por 10, em algum momento chegará a um número menor do que 1, pois qlqr algarismo unitário dividido por 10 é menor que 1 e não tem resto unitário.
		else {
			return n%10 + somadosDigitos(n/10);
			//Soma-se a sobra da divisão e continua a sequência com o número dividido por 10, para se encontrar os outros inteiros.
		}
	}
	
}
