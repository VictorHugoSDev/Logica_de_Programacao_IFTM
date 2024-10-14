import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double salario = s.nextDouble();
		double reajuste = 0.00;
		double novosalario = 0.00;
		
		    
		if(salario >= 0.00 && salario <= 400.00){
		    reajuste = salario * 0.15;
		    novosalario = salario + reajuste;
		    
		    System.out.printf("Novo salario: %.2f\n",novosalario);
		    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		    System.out.println("Em percentual: 15 %");
		}
		else if(salario <= 800.00){
		    reajuste = salario * 0.12;
		    novosalario = salario + reajuste;
		    
		    System.out.printf("Novo salario: %.2f\n",novosalario);
		    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		    System.out.println("Em percentual: 12 %");
		}
		else if(salario <= 1200.00){
		    reajuste = salario * 0.10;
		    novosalario = salario + reajuste;
		    
		    System.out.printf("Novo salario: %.2f\n",novosalario);
		    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		    System.out.println("Em percentual: 10 %");
		}
		else if(salario <= 2000.00){
		    reajuste = salario * 0.07;
		    novosalario = salario + reajuste;
		    
		    System.out.printf("Novo salario: %.2f\n",novosalario);
		    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		    System.out.println("Em percentual: 7 %");
		}
		else{
		    reajuste = salario * 0.04;
		    novosalario = salario + reajuste;
		    
		    System.out.printf("Novo salario: %.2f\n",novosalario);
		    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		    System.out.println("Em percentual: 4 %");
		}
	}
}
