/*Faça um programa em Java (utilizando For) que recebe inicialmente um número inteiro **n**, que representa a quantidade de números a serem fornecidos pelo usuário. Após a inserção desses **n** números, o programa deverá apresentar o maior dos números inseridos. 

Entrada
A entrada conterá um número inteiro **n** e **n** números inteiro.

Saída
Imprima o maior dos números informados.*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int m;
		int n = s.nextInt();
		int maior = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
		    m = s.nextInt();
		    
		    if(m > maior){
		        maior = m;
		    }
		}
		System.out.println("Maior = " + maior);
	}
}
