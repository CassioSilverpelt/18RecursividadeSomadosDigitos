package view;

import javax.swing.JOptionPane;

import controller.SomaDosDigitosController;

public class SomaDosDigitosPrincipal {
	public static void main (String[] args) {
		SomaDosDigitosController somaCon = new SomaDosDigitosController();
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número aí: "));
		System.out.println("A soma dos dígitos desse número é: " + somaCon.somadosDigitos(num));
	}
}
