import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    double r = s.nextDouble();
	    double n = 3.14159;
	    
	    double A = n * (Math.pow(r,2));
	    
	    
		System.out.printf("A=%.4f\n", A);
	}
}
