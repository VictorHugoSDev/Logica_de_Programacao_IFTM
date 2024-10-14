import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	double numeros[] = new double[100];
    	
    	for(int i=0; i<100; i++){
    	    numeros[i] = s.nextDouble();
    	}
	   
	    for(int i=0; i<100; i++){
	        double valor = numeros[i];
	        
	        if(valor <=10){
	            System.out.println("A[" + i + "] = " + valor);
	        }
	    }
	}
}
