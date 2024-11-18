package package001;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un número para calcularle su cuadrado y su cubo: ");
		double numero_ingresado = scanner.nextDouble();
		
		double cuadrado = Math.pow(numero_ingresado, 2);
		
		double cubo = Math.pow(numero_ingresado, 3);
		
		System.out.println("El cuadrado de " + numero_ingresado + " es: " + cuadrado);
		System.out.println("El cubo de " + numero_ingresado + " es: " + cubo);
	}

}
