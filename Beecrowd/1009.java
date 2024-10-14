import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    String nome = s.next();
	    double salario = s.nextDouble();
	    double comissao = s.nextDouble();
	    
	    double salary = (salario + comissao * 0.15);
	    
	    System.out.printf("TOTAL = R$ %.2f\n", salary);
	}
}
