package package001;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("¿Qué edad tiene Juan?");
			
			int EDJUAN = scanner.nextInt();
			
			int EDALBER = 2 * EDJUAN / 3;
			
			int EDANA = 4 * EDJUAN / 3;
			
			int EDMAMA = EDJUAN + EDALBER + EDANA;
			
			
			System.out.println("LAS EDADES SON: ALBERTO = " + EDALBER + ", JUAN = " + EDJUAN + ", ANA = " + EDANA + ", MAMÁ = " + EDMAMA);
			

		
	}

}
