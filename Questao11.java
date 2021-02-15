import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(" #,##0.00");

		int dia, mes, ano, anoAno = 1, anoAtual = 2021;
		float diaAno = (float) 0.002,  mesAno = (float) 0.08, somaDiaMesAno, multiplicaçaoDia, MultiplicaçaoMes, multiplicaçaoAno, somaTotal;

		System.out.println("Questao 11: ");

		System.out.println("Insira o dia do seu nascimento: ");
		dia = leia.nextInt();

		System.out.println("Insira o mes do seu nascimento: ");
		mes = leia.nextInt();

		System.out.println("Insira o ano do seu nascimento: ");
		ano = leia.nextInt();

		multiplicaçaoDia = dia*diaAno;

		MultiplicaçaoMes = mes*mesAno;

		multiplicaçaoAno = ano*anoAno;

		somaDiaMesAno =  multiplicaçaoDia + MultiplicaçaoMes + multiplicaçaoAno;

		somaTotal = anoAtual - somaDiaMesAno;

		System.out.println("A idade exata da pessoa em anos é de: " + df.format (somaTotal));


	}

}
