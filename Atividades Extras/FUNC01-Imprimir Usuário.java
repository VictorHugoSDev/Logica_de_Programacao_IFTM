/* Crie um programa em java que leia o nome (apenas uma palavra) e idade de dois usuários e uma função para receber tais informações como parâmetros e imprimir na tela.
(Obrigatório a utilização de funções)

Entrada
Um texto que deverá ser armazenado em uma String nome (utilize o .next() para ler) e um inteiro que corresponde a idade do primeiro usuário e as mesmas entradas para o segundo usuário.

Saída
Uma linha apresentando o nome do usuário e a idade, conforme exemplo abaixo. 

Obs.: A impressão do nome e da idade deverá ser feita usando a função imprimeUsuario(parâmetros). A função deverá receber o nome e idade de cada aluno.*/

import java.util.Scanner;

public class Main
{  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
        
        processarEntradas(s);
        
        s.close();
    }
    
    private static void processarEntradas(Scanner s){
        int contador = 0;
        
        while(contador!=2){
            String entrada = lerEntrada(s);
            processarEntrada(entrada);
            contador++;
            }
    }
    
    private static String lerEntrada(Scanner s){
        return s.nextLine();
    }
    
    private static void processarEntrada(String entrada){
        String partes [] = entrada.split(" ");
            if(partes.length >= 2){
                String nome = partes[0];
                int idade = Integer.parseInt(partes[1]);
                exibirResultado(nome, idade);
            }
    }
    
    private static void exibirResultado(String nome, int idade){
        System.out.println("Usuario: " + nome + ", Idade: " + idade + " anos");
    }
}
