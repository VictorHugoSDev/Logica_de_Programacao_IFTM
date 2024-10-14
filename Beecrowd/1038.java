import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	  
	    int cod = s.nextInt();
	    int qtd = s.nextInt();
	    
	    if(cod == 1){
	        double total = qtd * 4.00;
	        
	        System.out.printf("Total: R$ %.2f\n", total);
	    }
	    else if(cod == 2){
	        double total = qtd * 4.50;
	        System.out.printf("Total: R$ %.2f\n", total);
	    }
	     else if(cod == 3){
	        double total = qtd * 5.00;
	        System.out.printf("Total: R$ %.2f\n", total);
	    }
	     else if(cod == 4){
	        double total = qtd * 2.00;
	        System.out.printf("Total: R$ %.2f\n", total);
	    }
	     else if(cod == 5){
	        double total = qtd * 1.50;
	        System.out.printf("Total: R$ %.2f\n", total);
	    }
	    else{
	        System.out.println("Invalido");
	    }
	}
}
