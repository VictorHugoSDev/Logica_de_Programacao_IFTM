import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int hi = s.nextInt();
		int mi = s.nextInt();
		int hf = s.nextInt();
		int mf = s.nextInt();
		
		int temp_h = hf - hi;
		int temp_m = mf - mi;
		
		if(temp_m < 0){
		    temp_m += 60;
		    temp_h --;
		}
		
		if(temp_h < 0){
		    temp_h += 24;
		}
		
		if(hi == mi && hf == mf){
		    System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else{
		    System.out.println("O JOGO DUROU " + temp_h + " HORA(S) E " + temp_m + " MINUTO(S)");
		}
	
	
	}
}
