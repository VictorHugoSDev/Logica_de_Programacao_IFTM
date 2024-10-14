import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    
	    int n = 0;
	    int maior = 0;
        int contador = 0;
	    
	    for(int i = 1; i<=100; i++){
	       n = s.nextInt();
	       
	       if(n > maior){
	           maior = n;
	           contador = i;
	       }
	    }
	    System.out.println(maior);
	    System.out.println(contador);
	  
	}
}

