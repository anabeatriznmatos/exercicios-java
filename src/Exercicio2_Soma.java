import java.util.Scanner;

public class Exercicio2_Soma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o primeiro numero inteiro: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o segundo numero inteiro: ");
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("A soma dos seus numero é: " + soma);
		
		sc.close();
	}
}
