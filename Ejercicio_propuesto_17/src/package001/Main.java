package package001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner	scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el radio de un circulo: ");
		double radio = scanner.nextDouble();
		
			double area_del_circulo = Math.PI * Math.pow(radio, 2);

			double perimetro_del_circulo = (2 * Math.PI) * radio;
		
		System.out.println("El área del círculo con radio "+radio+" es: "+area_del_circulo);
		System.out.println("El perímetro del círculo con radio "+radio+" es: "+perimetro_del_circulo);
	}

}
