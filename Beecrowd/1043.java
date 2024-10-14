import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double A = s.nextDouble();
		double B = s.nextDouble();
		double C = s.nextDouble();
		
		if(A < (B+C) && B < (A+C) && C < (B+A)){
		    double p = A + B + C;
		    System.out.printf("Perimetro = %.1f\n", p);
		}
		else{
		    double a = ((A+B) * C) / 2;
		     System.out.printf("Area = %.1f\n", a);
		}
	
	}
}
