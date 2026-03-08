import java.util.Scanner;

public class Exercicio4_PositivoNegativo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu numero? ");
		int n = sc.nextInt();
		
		if (n == 0) {
			System.out.println("Seu numero é IGUAL a Zero");
		}
		else{
			if (n < 0) {
				System.out.println("Seu numero é NEGATIVO");
			}
			else {
				System.out.println("Seu numero é POSITIVO");
			}
		}
		
		sc.close();
	}
}
