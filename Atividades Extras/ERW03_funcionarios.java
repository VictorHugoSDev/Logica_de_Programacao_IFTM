/*Faça um programa em Java (utilizando while) para ler um número indeterminado de entrevistados. Para cada entrevistado será fornecido a idade, sexo e valor de salário. O programa deve calcular:

a média de salário do grupo;
maior e menor idade do grupo;
quantidade de mulheres com salário acima de R$ 3000,00.
Após a inclusão de cada funcionário, será informado a letra 's' para a inclusão de um novo funcionário ou letra 'n' para terminar a pesquisa.

Dica 1: Como ler um caractere:
char sexo = s.next().charAt(0);

para maiores explicações consulte a aula sobre estrutura sequenciais.

Dica 2: Para encontrar o maior ou menor elemento de um conjunto de inteiros(como a idade), utilize variáveis de controle que utilizam limites de valores, exemplo:
int maior = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;

Entrada
A entrada corresponde vários casos de teste. Cada caso contém um valor inteiro correspondente à idade, um caractere correspondente ao sexo('f' ou 'm'), 
um número real(double) correspondente ao salário e um caractere correspondente a continuidade ou termino da pesquisa. Caso esse último caractere tenha o valor 'n' o algoritmo irá terminar.

Saída
Imprima uma linha contendo a média salarial do grupo, uma linha contendo a maior e menor idade do grupo e uma linha contendo a quantidade de mulheres com salário acima de 3000.00. Siga o formato dos exemplos abaixo.
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int entrevistados = 0;
		double somaSalarios = 0.0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int mulheres = 0;
		
		char continuar = 's';
		
		while(continuar == 's'){
		    int idade = s.nextInt();
		    char sexo = s.next().charAt(0);
		    double salario = s.nextDouble();
		    
		    entrevistados++;
		    somaSalarios+=salario;
		    
		    if(idade > maior){
		        maior = idade;
		    }
		    
		    if(idade < menor){
		        menor = idade;
		    }
		    
		    if(sexo == 'f' && salario > 3000){
		        mulheres++;
		    }
		    
		    continuar = s.next().charAt(0);
		}
	    
	 double mediaSalarios = somaSalarios/entrevistados;
	 
	 System.out.printf("Media salarios = R$ %.2f%n",mediaSalarios);
	 System.out.println("Menor e maior idade = " + menor + " e " + maior);
	 System.out.println("Salarios de mulheres acima de R$ 3000.00 = " + mulheres);
	}
}

