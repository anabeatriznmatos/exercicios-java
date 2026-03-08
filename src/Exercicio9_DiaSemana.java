import java.util.Scanner;
public class Exercicio9_DiaSemana {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int s = sc.nextInt();
		
		switch(s) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA-FEIRA");
			break;
		case 3:
			System.out.println("TERÇA-FEIRA");
			break;
		case 4:
			System.out.println("QUARTA-FEIRA");
			break;
		case 5:
			System.out.println("QUINTA-FEIRA");
			break;
		case 6: 
			System.out.println("SEXTA-FEIRA");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("Dia da semana INVÁLIDO!");
		}
		
		sc.close();
	}
}
