import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cadena ");
		String s = sc.next();
	
		StringBuilder aux = new StringBuilder (s);
		aux.reverse();
		
		System.out.println(aux);
	}

}
