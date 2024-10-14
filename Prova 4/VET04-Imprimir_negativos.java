/******************************************************************************
Faça um programa em java que leia N números inteiros e armazene-os em um vetor. 
Em seguida, mostrar na tela todos os números negativos lidos, na ordem do último (posição N-1) ao primeiro (posição 0).
Obrigatório o uso de vetores.

Entrada
Ler um número inteiro(n) e depois n números inteiros.

Saída
Imprima os números negativos lidos, na ordem do último ao primeiro.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int aux = 0;
        int x = s.nextInt();
        int vetor [] = new int[x];
        int vetorNegativo [] = new int[x];
        
        for(int i=0;i<x;i++){
            int l = s.nextInt();
            vetor[i] = l;
        }
        
        for(int i=0;i<x;i++){
            if(vetor[i] < 0){
                vetorNegativo[aux] = vetor[i];
                aux++;
            }
        }
        
        for(int i=aux-1;i>=0;i--){
            System.out.println(vetorNegativo[i]);
        }
    }
}
