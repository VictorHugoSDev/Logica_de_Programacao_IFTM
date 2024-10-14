/* Faça uma função que recebe a idade de um nadador por parâmetro e retorna a categoria desse nadador de acordo com a tabela abaixo:
Idade	Categoria
3 a 5 anos	Infantil A
6 a 8 anos	Infantil B
9 a 10 anos	Infantil C
11 a 12 anos	Juvenil A
13 a 15 anos	Juvenil B
16 a 17 anos	Juvenil C
18 a 59 anos	Adulto
Maiores de 60 anos (Inclusive)	Idoso
Faça o programa (static void main) em java que utilize a função criada. Esse programa deverá ler a idade do nadador, utilizar a função e imprimir a resposta, conforme a tabela acima.
(Obrigatório a utilização de funções)

Entrada
Um número inteiro correspondente à idade.

Saída
Uma linha apresentando a categoria, conforme exemplo abaixo
*/
import java.util.Scanner;

public class Main
{  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
        
        int idade = s.nextInt();
        String categoria = retornaCategoria(idade);
        System.out.println(categoria);
        
        s.close();
    }
    
    static String retornaCategoria(int idade){
        if (idade >= 3 && idade <= 5){return "Infantil A";}
        else if(idade >= 6 && idade <= 8){return "Infantil B";}
        else if(idade >= 9 && idade <= 10){return "Infantil C";}
        else if(idade >= 11 && idade <= 12){return "Juvenil A";}
        else if(idade >= 13 && idade <= 15){return "Juvenil B";}
        else if(idade >= 16 && idade <= 17){return "Juvenil C";}
        else if(idade >= 18 && idade <= 59){return "Adulto";}
        else if(idade >= 60){return "Idoso";}
        else{return "Idade invalida";}
    }
}
