/*
Faça um programa em java que leia n números inteiros. Então imprima a quantidade de números negativos informados.

Entrada
 Um número inteiro n, então n números inteiros.

Saída
Imprimir a quantidade de números negativos informados.*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int cont = 0;
	    int x;
		int n = s.nextInt();
		
		for(int i=0;i<n;i++){
		    x = s.nextInt();
		    
		    if(x < 0){
		        cont++;
		    }
		}
		System.out.println(cont);
	}
}
