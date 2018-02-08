import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cadena ");
		String s = sc.nextLine();
		String [] partes = s.split(" ");
		
		for(int i=0; i<partes.length; i++) {
			System.out.println(partes[i]);
		}
	}

}
