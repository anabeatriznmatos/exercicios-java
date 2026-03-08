import java.util.Scanner;
public class Exercicio8_Nota {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua nota de 0 a 10: ");
		double n = sc.nextDouble();
		
		if(n < 5) {
			System.out.println("Você está REPROVADO!");
		}
		else if (n > 7) {
			System.out.println("Você está APROVADO!");
		}
		else {
			System.out.println("Você está de RECUPERAÇÃO!");
		}
		
		sc.close();
	}
}
