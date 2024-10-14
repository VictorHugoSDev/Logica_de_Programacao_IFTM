import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    int peca1 = s.nextInt();
	    int qtd1 = s.nextInt();
	    double valor1 = s.nextDouble();
	    
	    double total1 = qtd1 * valor1;
	    
	    int peca2 = s.nextInt();
	    int qtd2 = s.nextInt();
	    double valor2 = s.nextDouble();
	    
	    double total2 = qtd2 * valor2;
	    
	    double total = total1 + total2;
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
	}
}
