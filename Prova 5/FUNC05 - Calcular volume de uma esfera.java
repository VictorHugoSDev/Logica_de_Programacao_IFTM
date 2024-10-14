/*Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume V = (4 * Pi * r³)/3, onde  Pi = 3.1416. Faça o programa que utilize a função, ele deverá receber o raio da esfera, utilizar a função e retornar a resposta, conforme a tabela acima.

(Obrigatório a utilização de funções)
Entrada
Um número real correspondente ao raio de uma esfera.

Saída
Uma linha apresentando o volume da esfera, conforme exemplo abaixo.*/
import java.lang.Math;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		
		/*variavel que chama a funcao e passa o raio par calculo do volume */
		double calculado = calculo(r);
		
		System.out.printf("Volume : %.2f\n", calculado);
		
		s.close();
	}
	
	/* funcao para calcular o volume */
	static double calculo(double r){
	    double volume = (4 * 3.1416 * Math.pow(r,3))/3;
	    
	    return volume;
	}
}
