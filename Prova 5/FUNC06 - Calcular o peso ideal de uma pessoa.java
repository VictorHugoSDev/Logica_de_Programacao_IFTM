/*Faça uma função que recebe, por parâmetro, a altura (double) e o sexo (char) de uma pessoa e retorna o seu peso ideal. 
Para homens, o cálculo do peso ideal utiliza a fórmula : peso ideal = (72.7 x altura) - 58 e, para mulheres, peso ideal = (62.1 x altura) - 44.7.
Faça o programa que utilize a função, ele deverá receber a altura e o peso, utilizar a função e retornar a resposta, conforme a tabela acima.

(Obrigatório a utilização de funções)

dica : comando para ler um char : s.next().charAt(0);

Entrada
Um número real que correspondente a altura e um caractere que representa o sexo de uma pessoa.

Saída
Uma linha apresentando o peso ideal, conforme exemplo abaixo*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double altura = s.nextDouble();
		char sexo = s.next().charAt(0);
		
		/* função sendo chamada apos a inserir as informações*/
		double pesoIdeal = calculoPesoIdeal(altura, sexo);
		
		/* teste para garantir que é um caracter valido */
		if(pesoIdeal == -1){
		    System.out.println("Caracter invalido");
		}else{
		    System.out.printf("%.2f\n",pesoIdeal);
		}
		
		s.close();
	}
	
	/* nesse caso a função está calucando o peso ideal baseado nas informações passadas como altura e sexo*/
	static double calculoPesoIdeal(double altura, char sexo){
	    double pesoIdeal;
	    
	    if(sexo == 'M'){
		    pesoIdeal = (72.7 * altura) - 58.0;
		}
		else if(sexo == 'F'){
		    pesoIdeal = (62.1 * altura) - 44.7;
		}
		else{
		    pesoIdeal = -1;
		}
	    
	    return pesoIdeal;
	}
}
