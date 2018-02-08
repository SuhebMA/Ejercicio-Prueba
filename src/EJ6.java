
import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El juego ha empezado. ");
		System.out.println("Introduce las palabras: ");
		
		String s = sc.next();
		String [] partes = s.split(" ");
		 
		 if(partes[0].substring(partes[0].length()-2, partes[0].length()).equals(partes[1].substring(0, 2))) {
			 
			 System.out.println("Maracarana ");
		 }else {
			 System.out.println("MACRA ");
		 }
			 
	}

}
