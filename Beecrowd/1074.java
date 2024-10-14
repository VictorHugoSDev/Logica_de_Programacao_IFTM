import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    
	    int x = s.nextInt();
	    
	    for(int i = 0; i<x; i++){
	        
	       int valor = s.nextInt();
	       
	       if (valor == 0){
	           System.out.println("NULL");
	       }
	       else if(valor < 0 && valor % 2 == 0){
	           System.out.println("EVEN NEGATIVE");
	       }
	        else if(valor > 0 && valor % 2 == 0){
	           System.out.println("EVEN POSITIVE");
	       }
	        else if(valor > 0 && valor % 2 != 0){
	           System.out.println("ODD POSITIVE");
	       }
	       else{
	           System.out.println("ODD NEGATIVE");
	       }
	    }
	}
}

