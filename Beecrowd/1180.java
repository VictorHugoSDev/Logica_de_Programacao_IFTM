import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int numeros[] =  new int[x];
		int menor = Integer.MAX_VALUE; 
		int posicao = 0;
		
		for(int i = 0; i < x; i++){
		    int y = s.nextInt();
		    numeros[i] = y;
		    
		    if(y < menor){
		        posicao = i;
		        menor = y;
		    }
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
	}
}
