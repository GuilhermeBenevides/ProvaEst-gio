import java.util.Scanner;
public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		 int x = 0, y = 0;
		 
		System.out.println("Questão 9:");
		
        System.out.println("Pense em dois números");
        
        System.out.println("Digite o valor do segundo número (O maior deles)");
        y = leia.nextInt();
        
       
            for (int j = 2; j < y; j++) {
                if (y % j == 0) {
                	System.out.println("Número nao é primo :");
                }	
              
            }
            System.out.println("Número é primo :");
        
}
}

