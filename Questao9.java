import java.util.Scanner;
public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		 int x = 0, y = 0;
		 
		System.out.println("Quest�o 9:");
		
        System.out.println("Pense em dois n�meros");
        
        System.out.println("Digite o valor do segundo n�mero (O maior deles)");
        y = leia.nextInt();
        
       
            for (int j = 2; j < y; j++) {
                if (y % j == 0) {
                	System.out.println("N�mero nao � primo :");
                }	
              
            }
            System.out.println("N�mero � primo :");
        
}
}

