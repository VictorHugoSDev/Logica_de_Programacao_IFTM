import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int cont = 0;
	    int x;
		int n = s.nextInt();
		
		for(int i=0;i<n;i++){
		    x = s.nextInt();
		    
		    if(x < 0){
		        cont++;
		    }
		}
		System.out.println(cont);
	}
}
