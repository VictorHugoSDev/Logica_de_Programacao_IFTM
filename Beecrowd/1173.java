import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int numeros[] = new int[10];
    	numeros[0] = s.nextInt();
    	int valor = numeros[0];
    	
    	for(int i=0; i<10; i++){
    	    System.out.println("N[" + i + "] = "+ valor);
    	    valor *=2 ;
    	}
	        
	}
}
