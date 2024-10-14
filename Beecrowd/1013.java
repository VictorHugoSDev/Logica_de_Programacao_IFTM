import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    int A = s.nextInt();
	    int B = s.nextInt();
	    int C = s.nextInt();
	    
	    
	    int MaiorAB = (A+B+Math.abs(A-B))/2;
	    int MaiorC = (MaiorAB+C+Math.abs(MaiorAB-C))/2;
	   
	    System.out.println(MaiorC + " eh o maior");

	}
}
