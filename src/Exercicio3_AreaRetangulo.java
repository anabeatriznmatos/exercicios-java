import java.util.Scanner;

public class Exercicio3_AreaRetangulo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura: ");
		double largura = sc.nextDouble();
		
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		double area = largura * altura;
		
		System.out.println("Área do retângulo é: " + area);
		
		sc.close();
		
}
}
