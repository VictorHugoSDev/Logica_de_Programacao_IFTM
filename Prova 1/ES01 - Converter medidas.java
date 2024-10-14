/*Faça um programa em Java que tem como entrada um valor em metros e imprima na tela o valor correspondente em centímetros, milímetros, quilômetro e milha. Como calcular:

Centímetro : multiplique o valor em metros por 100.
Milímetro : multiplique o valor em metros por 1000.
Quilômetro : divida o valor de comprimento por 1000.00.
Milha : para um resultado aproximado, divida o valor de comprimento por 1609.00.
Obs.: Passar nos testes não significa estar correto, os testes não são completos.

Entrada
Um número inteiro contendo o valor em metros.

Saída
Imprimir os valores conforme exemplos abaixo. Quilômetro e Milha precisam de precisão de 4 casas decimais após o ponto (Utilize o System.out.printf).*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int c = x * 100;
		int m = x * 1000;
		float q = x / 1000.00f;
		float ma = x / 1609.00f;
		
		System.out.println(x + " metros");
		System.out.println(c + " centímetros");
		System.out.println(m + " milímetros");
		System.out.printf("%.4f quilômetros\n", q);
		System.out.printf("%.4f milhas\n", ma);
		
	}
}
