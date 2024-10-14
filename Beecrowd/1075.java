import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    
	    int x = s.nextInt();
	    
	    for(int i = 0; i<=10000; i++){
	        
	        if(i % x == 2){
	            System.out.println(i);
	        }
	        
	    }
	  
	}
}

