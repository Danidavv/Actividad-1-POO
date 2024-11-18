package package001;

public class Main {

	public static void main(String[] args) {
		
		int horas_trabajadas = 48;
		
		int valor_por_hora = 5000;
		
		int salario_bruto = horas_trabajadas * valor_por_hora;
		
		double retencion_de_la_fuente = salario_bruto * (12.5/100);
		
		double salario_neto = salario_bruto - retencion_de_la_fuente;
		
		System.out.println("Salario bruto: " + salario_bruto + " COP");
		System.out.println("Retención de la fuente: " + retencion_de_la_fuente + " COP");
		System.out.println("Salario neto: " + salario_neto + " COP");
		
		

	}

}
