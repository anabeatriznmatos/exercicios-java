import java.util.Scanner;

public class Exercicio6_ParImpar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Seu numero é PAR!");
		}
		else {
			System.out.println("Seu numero é NEGATIVO!");
		}
		
		sc.close();
	}
}
