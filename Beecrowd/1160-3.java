import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int A, B, j;
		double ga, gb;
		
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++){
		    
		    A = s.nextInt();
    		B = s.nextInt();
    		ga = s.nextDouble();
    		gb = s.nextDouble();
    		
        	for(j = 0;A <= B && j <= 100;j++){
        	    A += ((A * ga) / 100);
        	    B += ((B * gb) / 100);
        	}
        	if(j > 100){
        	   System.out.println("Mais de 1 seculo.");
        	}
        	 else{
        	   System.out.println(j + " anos.");
        	}
    		
		}
	}
}
