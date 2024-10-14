import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = 0;
		
		    
		if(A >= B){
		    C = (24 - A) + B;
		    System.out.println("O JOGO DUROU " + C + " HORA(S)");
		}
		else{
		    C = B - A;
		    System.out.println("O JOGO DUROU " + C + " HORA(S)");
		}
	}
}
