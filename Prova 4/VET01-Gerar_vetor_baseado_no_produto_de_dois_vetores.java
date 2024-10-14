/******************************************************************************
Faça um programa em Java para ler e preencher dois vetores de inteiros com N posições. Em seguida gere um novo vetor, 
no qual cada posição conterá o resultado da multiplicação dos números presentes nos dois vetores originais na mesma posição.

Entrada
Ler um número inteiro N e então preencher dois vetores com N números inteiros cada um.

Saída
Imprima o novo vetor conforme exemplo, onde cada posição i corresponde ao produto dos números contidos nos dois 
vetores na mesma posição i.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int vetor1 [] = new int[x];
        int vetor2 [] = new int[x];
        int vetorProduto [] = new int[x];
        
        for(int i=0;i<x;i++){
            int y = s.nextInt();
            vetor1[i] = y;
        }
        
        for(int j=0; j<x;j++){
            int y = s.nextInt();
            vetor2[j] = y;
        }
            
        for(int k=0; k<x; k++){
            vetorProduto[k] = vetor1[k] * vetor2[k];
        }
        
        System.out.print("{");
        for(int i=0; i<x-1; i++){
            System.out.print(vetorProduto[i] + ",");
        }
        System.out.print(vetorProduto[x - 1] + "}\n");
    }
}
