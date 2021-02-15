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

		System.out.println("Questão 12: ");

		System.out.println("Digite o valor hora do funcionário (EXEMPLO: XX,XX): ");
		valorHora = leia.nextFloat();

		System.out.println("Digite quantas horas o funcionário trabalhou no mês: ");
		horaTrabalhadasMes = leia.nextFloat();

		salario = (horaTrabalhadasMes * valorHora);

		System.out.println("O salário do funcionário é de: " + df.format (salario));

	}

}
