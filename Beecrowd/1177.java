import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int x = s.nextInt();
    	long numeros[] = new long[1000];
    	int aux = 0;
    	
	    for(int i = 0; i<1000; i++){
	        System.out.println("N[" + i + "] = " + aux);
	        aux++;
	        if(aux == x){
	            aux = 0;
	        }
	    }
	}
}
