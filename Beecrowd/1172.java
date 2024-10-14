import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int numeros[] = new int[10];
    	
    	
    	for(int i=0; i<10; i++){
    	    numeros[i] = s.nextInt();
    	}
    	
    	for(int i=0; i<10;i++){
    	    int x = numeros[i];
    	   
    	    if(x <= 0){
    	        numeros[i] = 1;
    	    }
    	}
    	
    	for(int i=0; i<10;i++){
    	    System.out.println("X[" + i + "] = "+ numeros[i]);
      }
	}
}
