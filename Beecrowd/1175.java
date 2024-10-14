import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int numeros[] = new int[20];
    	int aux;
    	
    	for(int i=0; i<20; i++){
    	    numeros[i] = s.nextInt();
    	}
	   
	    for(int i=0; i<10; i++){
	        aux = numeros[i];
	        numeros[i] = numeros[19-i];
	        numeros[19-i] = aux;
	    }
	    
	    for(int i = 0; i<20; i++){
	        System.out.println("N[" + i + "] = " + numeros[i]);
	    }
	}
}
