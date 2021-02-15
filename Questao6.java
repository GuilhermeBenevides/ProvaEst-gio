import java.util.Scanner;
public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String palavra, reverso;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Questão 6:");
		
		System.out.println("Digite uma palavra: ");
		palavra = leia.next();
		
	
        for(int i = palavra.length()-1; i >= 0; i--){

        	System.out.print("A palavra invertida é:" + palavra.charAt(i));
            
        }	

	}
}
