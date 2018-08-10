package br.com.team.calor.fibonacci;

public class Fibonacci {

	public static long fibo(int valor) {
        if (valor < 2) {
            return valor;
        } else {
            return fibo(valor - 1) + fibo(valor - 2);
        }
    }
}
