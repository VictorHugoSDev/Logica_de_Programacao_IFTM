import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int x = s.nextInt();
    	long numeros[] = new long[61];
    	numeros[0] = 0;
    	numeros[1] = 1;
    	
    	for(int i=2; i<61; i++){
    	    numeros[i] = numeros[i-2] + numeros[i-1];
    	}
	    
	    for(int i = 0; i<x; i++){
	        int n = s.nextInt();
	        System.out.println("Fib(" + n + ") = " + numeros[n]);
	    }
	}
}
