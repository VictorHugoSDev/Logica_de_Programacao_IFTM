/* Faça um programa em Java para ler um número indeterminado de votos, contendo cada um, o número do candidato. O último dado, que não entrará nos cálculos, contém um valor negativo. 
Computar os votos da eleição. As opções de voto são:

1. Candidato 1;
2. Candidato 2;
3. Candidato 3;
4. Voto Nulo;
5. Voto em branco.

Ao final, imprimir a quantidade de votos de cada candidato bem como o número de votos em branco e nulo.

obs: considere que só serão entrado dados negativos ou entre 1 e 5. 

Entrada
A entrada conterá vários números inteiros. Caso o valor informado seja menor que zero, o programa deve parar. 

Saída
Imprima a quantidade de votos de cada candidato bem como o número de votos em branco e nulo.
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int X;
		int cand1 = 0, cand2 = 0, cand3 = 0, nulos = 0, brancos = 0;
		
		while((X = s.nextInt()) > 0){
		    
		    if(X == 1){
		        cand1++;
		    }
		    else if(X == 2){
		        cand2++;
		    }
		    else if(X == 3){
		        cand3++;
		    }
		    else if(X == 4){
		        nulos++;
		    }
		    else{
		        brancos++;
		    }
		    
		}
		System.out.println("Candidato 1 : "+ cand1 + " voto(s)");
		System.out.println("Candidato 2 : "+ cand2 + " voto(s)");
		System.out.println("Candidato 3 : "+ cand3 + " voto(s)");
		System.out.println("Nulos : "+ nulos + " voto(s)");
		System.out.println("Brancos : "+ brancos + " voto(s)");
	}
}
