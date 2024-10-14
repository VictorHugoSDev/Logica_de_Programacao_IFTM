import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double A = s.nextDouble();
		double B = s.nextDouble();
		double C = s.nextDouble();
		double temp;
		
		if(B > A){
		    temp = A;
		    A = B;
		    B = temp;
		}
		
		if(C > A){
		    temp = A;
		    A = C;
		    C = temp;
		}
		
		if(A >= B + C){
		   System.out.println("NAO FORMA TRIANGULO");
		}
		
		else{
	        if((A * A) > (B * B) + (C * C)){
		    System.out.println("TRIANGULO OBTUSANGULO");
		    }
		    
		    else if((A * A) < (B * B) + (C * C)){
		    System.out.println("TRIANGULO ACUTANGULO");
		    }
		    
		    else{
		    System.out.println("TRIANGULO RETANGULO");
		    }
		    
		    if(A == B && B == C){
		    System.out.println("TRIANGULO EQUILATERO");
		    }
		    
		    else if((A == B) || (A == C) || (C == B)){
		    System.out.println("TRIANGULO ISOSCELES");
		    }
		}
	
	
	}
}
