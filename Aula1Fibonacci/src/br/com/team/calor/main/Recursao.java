package br.com.team.calor.main;

import javax.swing.JOptionPane;

import br.com.team.calor.fibonacci.Fibonacci;

public class Recursao {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		
		long valorFibonacci = Fibonacci.fibo(numero);
		
		JOptionPane.showMessageDialog(null, "O valor do Fibonacci "+numero + " é: " + valorFibonacci);
	}

}
