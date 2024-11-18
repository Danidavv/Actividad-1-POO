package package002;

public class Main {

	public static void main(String[] args) {
		
		double SUMA = 0;
		double X = 20;
		SUMA = SUMA + X;
		double Y = 40;
		X = X + (int)Math.pow(Y, 2);
		SUMA = SUMA + (X / Y);
		
		System.out.println("El valor de la suma es: " + SUMA);
		
		
	}

}