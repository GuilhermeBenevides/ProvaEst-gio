import java.util.Scanner;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
        int x = 0, y = 0;
        System.out.println("Quest�o 8:");
        System.out.println("Pense em dois n�meros");
            System.out.println("Digite o valor do primeiro n�mero (O menor deles)");
            x = leia.nextInt();
            
            System.out.println("Digite o valor do segundo n�mero (O maior deles)");
            y = leia.nextInt();
            
            while(x <= y){

            	 System.out.println("N�mero encontrado entre os n�meros informados: "+(x));
            	 
                x++;
            }
    }
}
