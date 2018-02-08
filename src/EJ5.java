import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N'
				,'J','Z','S','Q','V','H','L','C','K','E'};
		
		System.out.println("Introduce tu DNI: ");
		String s = sc.next();
		int dni = Integer.parseInt(s.substring(0, s.length()-1));
		char letradni =  s.substring(s.length()-1).charAt(0);
		int resto = dni % 23;
		if(letradni == letras[resto]) {
			System.out.println("DNI CORRECTO");
		}else {
			System.out.println("DNI INCORRECTO");
		}
		
	}

}
