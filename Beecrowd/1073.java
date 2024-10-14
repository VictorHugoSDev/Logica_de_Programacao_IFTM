import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    
	    int n = s.nextInt();
	    
	    for(int i = 1; i<=n; i++){
	        
	        int quadrado = i * i;
	        
	        if(quadrado % 2 == 0){
	            System.out.println(i+"^2 = " + quadrado);
	        }

	    }
	  
	}
}

