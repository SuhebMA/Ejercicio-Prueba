import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cadena ");
		String s = sc.nextLine();
		String [] partes = s.split(" ");
		
		System.out.println("Introduce la segunda cadena ");
		String a = sc.nextLine();
		
		int cont = 0;
		
		for(int i=0; i<partes.length; i++) {
			if(a.equals(partes[i])) {
				cont++;
			}
		}
		System.out.println("la segunda cadena se repite " + cont + " veces.");
	}

}
