/******************************************************************************
Faça um programa em java que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
- a quantidade de números pares
- todos os números pares

Entrada
Ler um número inteiro(n), depois n números inteiros.

Saída
Imprima a quantidade de números pares informado, bem como todos os números pares do vetor.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int aux = 0;
        int x = s.nextInt();
        int vetor [] = new int[x];
        int vetorPar [] = new int[x];
        
        for(int i=0;i<x;i++){
            int l = s.nextInt();
            vetor[i] = l;
        }
        
        for(int i=0;i<x;i++){
            if(vetor[i] % 2 == 0){
                vetorPar[aux] = vetor[i];
                aux++;
            }
        }
        
        System.out.println(aux);
        System.out.print("{");
        
        for(int i=0; i<aux; i++){
            System.out.print(vetorPar[i]);
            
            if(i< aux-1){
                System.out.print(";");
                }
            
            }
        
        System.out.print("}\n");
    }
}
