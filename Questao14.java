import java.util.Scanner;
import java.text.DecimalFormat;
public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("US$ #,##0.00");

		float real = 0, dolar = 0, cota�ao = (float) 5.43, valorConvertido;

		System.out.println("EXERC�CIO 14: ");

		System.out.println("Digite o valor em Reais R$ (EXEMPLO 45,50): ");
		real = leia.nextFloat();

		valorConvertido = real/cota�ao;

		System.out.println("O valor convertido � de: " + df.format(valorConvertido));


	}

}
