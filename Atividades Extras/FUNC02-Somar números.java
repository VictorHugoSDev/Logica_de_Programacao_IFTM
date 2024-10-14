/*Faça uma função que irá retornar a soma de dois valores inteiros e um programa em java que irá utilizar/consumir a função. 
O programa deverá receber dois valores inteiros, chamar a função passando esses valores como parâmetro e então imprimir o retorno da função.
(Obrigatório a utilização de funções)

Entrada:

Dois números inteiros.

Saída:

Um número inteiro correspondente a soma dos números da entrada.*/
import java.util.Scanner;

public class Main
{  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
        processarSoma(s);
        
        s.close();
    }
    
    private static void processarSoma(Scanner s){
        int entrada1 = lerEntradas(s);
        int entrada2 = lerEntradas(s);
        
        int soma  = entrada1+entrada2;
        
        exibirResultado(soma);
    }
    
    private static int lerEntradas(Scanner s){
        return s.nextInt();
    }
    
    private static void exibirResultado(int soma){
        System.out.println(soma);
    }
}
