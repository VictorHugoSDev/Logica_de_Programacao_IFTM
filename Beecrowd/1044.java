import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = 0;
		
		if(A < B){
		    C = A;
		    A = B;
		    B = C;
		}
		    
		if(A % B == 0){
		    System.out.println("Sao Multiplos");
		}
		else{
		    System.out.println("Nao sao Multiplos");
		}
	}
}
