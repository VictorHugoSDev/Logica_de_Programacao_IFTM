/******************************************************************************
Faça um programa em java que leia um número inteiro X e N números inteiros e armazene-os em um vetor. Em seguida,
mostrar na tela todos os números do vetor nas posições {0, X, 2X, 3X, 4X,...}. 
Primeiro entre com o valor N, então com os N números inteiros do vetor, por fim com o valor de X.

Obrigatório o uso de vetores.

Entrada
Ler um número inteiro(n), depois n números inteiros e por fim, um número inteiro(x).

Saída
Imprima todos os números do vetor nas posições {0, X, 2X, 3X, 4X,...}.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int vetor [] = new int[x];
        
        for(int i=0; i<x; i++){
            int y = s.nextInt();
            vetor[i] = y;
        }
        
        int z = s.nextInt();
        
        
        for(int j=0; j<x; j+=z){
           System.out.println("Pos[" + j + "] = " + vetor[j]);
                
        }
        
    }
}
