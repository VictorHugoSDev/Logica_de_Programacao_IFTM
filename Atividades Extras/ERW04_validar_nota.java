/*
Faça um programa em Java (utilizando while) que peça um número real(double) correspondente a uma nota, entre 0 e 10 ou entre 100 e 200, considerar os limites. 
Mostre a mensagem, "nota invalida", caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

Entrada
Vários números reais(double) fornecidos em sequencias, cada um representando uma possível nota.

Saída
Para cada nota imprima "nota invalida", se a nota não for válida ou imprima a própria nota, se válida, nesse caso finalize o programa.
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		while(true){
		    double x = s.nextDouble();
		    
		    if((x >= 0 && x <= 10) || (x >= 100 && x <= 200)){
		        System.out.println(x);
		        break;
		    }
		    else{
		        System.out.println("nota invalida");
		    }
		}
	}
}
