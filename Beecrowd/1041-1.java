import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	  
	    float X = s.nextFloat();
	    float Y = s.nextFloat();
	    
	    if(X > 0.0 && Y < 0.0){
	        System.out.println("Q4");
	    }
	    else if(X > 0.0 && Y > 0.0){
	        System.out.println("Q1");
	    }
	    else if(X < 0.0 && Y > 0.0){
	        System.out.println("Q2");
	    }
	    else if(X < 0.0 && Y < 0.0){
	        System.out.println("Q3");
	    }
	    else if(X != 0 && Y == 0.0){
	        System.out.println("Eixo X");
	    }
	    else if(X == 0.0 && Y != 0.0){
	        System.out.println("Eixo Y");
	    }
	    else{
	        System.out.println("Origem");
	    }
	    
	    
	    
	}
}
