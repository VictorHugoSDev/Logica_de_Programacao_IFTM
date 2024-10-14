import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    
	    int lampA = 0;
	    int lampB = 0;
	    int x = s.nextInt();
	    
	    for(int i = 0; i<x; i++){
	        int y = s.nextInt();
	        
	        if(y == 1 && lampA == 0){
	            lampA = 1;
	        }
	        else if(y == 1 && lampA == 1){
	            lampA = 0;
	        }
	        else if(y == 2 && lampA == 0 && lampB == 0){
	            lampA = 1;
	            lampB = 1;
	        }
	        else if(y == 2 && lampA == 1 && lampB == 1){
	            lampA = 0;
	            lampB = 0;
	        }
	        else if(y == 2 && lampA == 0 && lampB == 1){
	            lampA = 1;
	            lampB = 0;
	        }
	         else if(y == 2 && lampA == 1 && lampB == 0){
	            lampA = 0;
	            lampB = 1;
	        }
	    }
	    System.out.println(lampA);
	    System.out.println(lampB);
	}
}
