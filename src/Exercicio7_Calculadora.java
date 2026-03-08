import java.util.Scanner;

public class Exercicio7_Calculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int y = sc.nextInt();
		
		System.out.println("Escolha uma operação (+ , -, *, /): ");
		char op = sc.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println("Resultado: " + (x + y));
			break;
		case '-':
			System.out.println("Resultado: " + (x - y));
			break;
		case '*':
			System.out.println("Resultado: " + (x * y));
			break;
		case '/':
			System.out.println("resultado: " + (x / y));
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		sc.close();
	}
}
