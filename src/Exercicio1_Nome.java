import java.util.Scanner;

public class Exercicio1_Nome {
	public static void main(String[] args) {
		
		System.out.println("Qual é o seu nome? ");
		Scanner sc = new Scanner(System.in);
		
		String n;
		n = sc.nextLine();
		System.out.println("Olá " + n + ", Seja bem vinda ao java!");
		
		sc.close();
	}
	
}
