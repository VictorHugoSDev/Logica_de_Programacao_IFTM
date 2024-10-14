import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contador = 0;
		float soma = 0;
		float x;
		
		while((x = s.nextFloat()) > 0){
		    soma+=x;
		    contador ++;
		}
		
		System.out.printf("Soma = %.2f\n", soma);
		System.out.println("Quantidade = " + contador);
	}
}
