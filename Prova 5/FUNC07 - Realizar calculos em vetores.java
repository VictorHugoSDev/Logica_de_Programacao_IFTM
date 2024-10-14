/*Leia dois vetores de inteiros x e y, cada um com n elementos. Calcule e mostre os vetores resultantes em cada caso abaixo:
  * Soma entre x e y : soma de cada elemento de x com o elemento da mesma posição em y. Gerará o vetor soma e o imprimirá através da função imprimirVetor.
  * Produto entre x e y : multiplicação de cada elemento de x com o elemento da mesma posição em y. Gerará o vetor produto e o imprimirá através da função imprimirVetor.

Obs: No programa em java deverão ser criadas no mínimo 3 funções. Sugestões de funções preencherVetor, imprimirVetor, somaVetor e multiplicaVetor. 
Ao final, utilize a função imprimeVetor para imprimir o vetor soma e o vetor produto.

(Obrigatório a utilização de funções)

Entrada
Um número inteiro n correspondente ao tamanho dos vetores e então n números inteiros que irão preencher o vetor cada um dos vetores.

Saída
Uma linha apresentando os novos vetores soma e produto, conforme exemplo abaixo*/
/******************************************************************************
Leia dois vetores de inteiros x e y, cada um com n elementos. Calcule e mostre os vetores resultantes em cada caso abaixo:

Soma entre x e y : soma de cada elemento de x com o elemento da mesma posição em y. Gerará o vetor soma e o imprimirá através da função imprimirVetor.
Produto entre x e y : multiplicação de cada elemento de x com o elemento da mesma posição em y. Gerará o vetor produto e o imprimirá através da função imprimirVetor.
Obs: No programa em java deverão ser criadas no mínimo 3 funções. 
Sugestões de funções preencherVetor, imprimirVetor, somaVetor e multiplicaVetor. Ao final, utilize a função imprimeVetor para imprimir o vetor soma e o vetor produto.
(Obrigatório a utilização de funções)

Entrada
Um número inteiro n correspondente ao tamanho dos vetores e então n números inteiros que irão preencher o vetor cada um dos vetores.

Saída
Uma linha apresentando os novos vetores soma e produto, conforme exemplo abaixo
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int qtde = s.nextInt();
		int vetor1[] = new int[qtde];
		int vetor2[] = new int[qtde];
		
		for(int i=0; i<qtde;i++){
		    vetor1[i] = s.nextInt();
		}
		
		for(int i=0; i<qtde;i++){
		    vetor2[i] = s.nextInt();
		}
		
		/* parte do codigo para chamar a funcao que soma dos valores contidos vetores e printar os valores somados */
		int[] vetorSomado = somaVetor(vetor1, vetor2);
		imprimirVetorSomado(vetorSomado);
	
		/* parte do codigo para chamar a funcao de produto dos dos valores contidos e printar os valores multiplicados */
		int[] vetorMultiplicado = produtoVetor(vetor1, vetor2);
		imprimirVetorMultiplicado(vetorMultiplicado);
	
		s.close();
	}
	
	/* funcao para calcular a soma*/
	static int[] somaVetor(int vetor1[], int vetor2[]){
	    int soma[] = new int[vetor1.length];
	    
	    for(int i=0; i < vetor1.length;i++){
	        soma[i] = vetor1[i] + vetor2[i];
	    }
	    
	    return soma;
	}
	
		/*funcao para imprimir o vetor somado, nessa funcao através da quantidade de numeros que possui o vetor
	    é realizado o print*/
	static void imprimirVetorSomado(int vetor[]){
	    System.out.print("Soma : {");
	    for(int i = 0; i < vetor.length; i++){
	        System.out.print(vetor[i]);
	        if(i < vetor.length - 1){
	            System.out.print(", ");
	        }
	    }
	    System.out.println("}");
	}
	
	/* funcao para calcular o produto*/
	static int[] produtoVetor(int vetor1[], int vetor2[]){
	    int produto[] = new int[vetor1.length];
	    
	    for(int i=0; i < vetor1.length;i++){
	        produto[i] = vetor1[i] * vetor2[i];
	    }
	    
	    return produto;
	}
	
	/*funcao para imprimir o vetor multiplicado, nessa funcao através da quantidade de numeros que possui o vetor
	é realizado o print*/
	static void imprimirVetorMultiplicado(int vetor[]){
	    System.out.print("Produto : {");
	    for(int i = 0; i < vetor.length; i++){
	        System.out.print(vetor[i]);
	        if(i < vetor.length - 1){
	            System.out.print(", ");
	        }
	    }
	    System.out.println("}");
	}
	
}
