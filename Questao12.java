import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");

		Float valorHora, horaTrabalhadasMes, salario;

		System.out.println("Quest�o 12: ");

		System.out.println("Digite o valor hora do funcion�rio (EXEMPLO: XX,XX): ");
		valorHora = leia.nextFloat();

		System.out.println("Digite quantas horas o funcion�rio trabalhou no m�s: ");
		horaTrabalhadasMes = leia.nextFloat();

		salario = (horaTrabalhadasMes * valorHora);

		System.out.println("O sal�rio do funcion�rio � de: " + df.format (salario));

	}

}
