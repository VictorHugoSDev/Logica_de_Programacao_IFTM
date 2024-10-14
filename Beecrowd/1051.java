import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float salario = s.nextFloat();
		float imposto;
		
		if(salario >= 0.00 && salario <= 2000.00){
		    System.out.println("Isento");
		}
		else if(salario <= 3000.00){
		    imposto = (salario - 2000.00f) * 0.08f;
		    System.out.printf("R$ %.2f\n", imposto);
		}
		else if(salario <= 4500.00){
		    imposto = (1000.00f * 0.08f) + ((salario - 3000.00f) * 0.18f);
		    System.out.printf("R$ %.2f\n", imposto);
		}
		else{
		    imposto = (1000.00f * 0.08f) + (1500.00f * 0.18f) + ((salario - 4500.00f) * 0.28f);
		    System.out.printf("R$ %.2f\n", imposto);
		}
	
	}
}
