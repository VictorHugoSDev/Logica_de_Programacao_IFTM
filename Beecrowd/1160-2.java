import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int A, B, anos;
		double ga, gb;
		
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++){
		    
		    anos = 0;
		    A = s.nextInt();
    		B = s.nextInt();
    		ga = s.nextDouble();
    		gb = s.nextDouble();
    		
        	while(A <= B && anos <= 100){
        	    
        	    A += ((A * ga) / 100);
        	    B += ((B * gb) / 100);
        	    anos++;
        
        	}
        	if(anos > 100){
        	   System.out.println("Mais de 1 seculo.");
        	}
        	 else{
        	   System.out.println(anos + " anos.");
        	}
    		
		}
	}
}
