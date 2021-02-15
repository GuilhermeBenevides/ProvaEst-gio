import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int fatorial, auxiliar=1;
		
		System.out.println("Questão 10: ");
		
		System.out.println("Digite um número inteiro positivo: ");
		fatorial = leia.nextInt();
		
		for (int i = 1; i <= fatorial; i++) {
			auxiliar = auxiliar * i;
		}
		System.out.println("O fatorial do numero é: " + auxiliar);
	}

}
