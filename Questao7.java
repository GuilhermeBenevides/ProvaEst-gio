import java.util.Scanner;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
        int x = 0, y = 0;
        System.out.println("Questão 8:");
        System.out.println("Pense em dois números");
            System.out.println("Digite o valor do primeiro número (O menor deles)");
            x = leia.nextInt();
            
            System.out.println("Digite o valor do segundo número (O maior deles)");
            y = leia.nextInt();
            
            while(x <= y){

            	 System.out.println("Número encontrado entre os números informados: "+(x));
            	 
                x++;
            }
    }
}
