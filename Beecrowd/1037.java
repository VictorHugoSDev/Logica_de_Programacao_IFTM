import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    double ent = s.nextDouble();
	    
	    if(ent >= 0 && ent <=25){
	        System.out.println("Intervalo [0,25]");
	    }
	    else if(ent > 25 && ent <= 50){
	        System.out.println("Intervalo (25,50]");
	    }
	    else if(ent > 75 && ent <= 100){
	        System.out.println("Intervalo (75,100]");
	    }
	    else{
	        System.out.println("Fora de intervalo");
	    }
	   
	}
}
