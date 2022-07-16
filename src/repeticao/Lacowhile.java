package repeticao;
import java.util.Scanner;
public class Lacowhile 
{
	public static void main (String[] args) 
 {
		Scanner ler = new Scanner(System.in);
		int x, soma=0;
		do 
		{
			System.out.println("Digite um numero ou 0 para parar o laço: \n");
			x = ler.nextInt();
			if (x>0) 
			{
				soma+=x;
			}
			
			
		}
		
		while (x>=1);
		
		System.out.printf("A soma dos números digitados foi: "+ soma);
 }
	
}
