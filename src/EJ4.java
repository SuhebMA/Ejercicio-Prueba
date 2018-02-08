import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cadena ");
		String s = sc.next();
	
		StringBuilder aux = new StringBuilder (s);
		aux.reverse();
		
		
		System.out.print(s);
		for(int i=1; i<aux.length(); i++) {
			System.out.print(aux.charAt(i));
		}
	}

}
