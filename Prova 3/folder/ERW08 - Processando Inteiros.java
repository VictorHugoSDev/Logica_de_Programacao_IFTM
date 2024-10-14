import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contadorPar = 0;
		int contadorImpar = 0;
		float media;
		int soma = 0;
		
		int alvo = s.nextInt();
		
		while(true){
		    int x = s.nextInt();
		    soma+=x;
		    
		    if(x % 2 == 0){
		        contadorPar++;
		    }
		    else if(x % 2 != 0){
		        contadorImpar++;
		    }
		    
		    if(soma >= alvo){
		        break;
		    }
		}
		
		media = (float) soma/(contadorPar+contadorImpar);
		
		System.out.println("Pares = " + contadorPar);
		System.out.println("Impares = " + contadorImpar);
		System.out.printf("Média = %.2f\n", media);
	}
}
