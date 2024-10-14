import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int X,Y;
		
		while(((X = s.nextInt()) != 0) && ((Y = s.nextInt()) != 0)){
		    
		    if(X > 0 && Y > 0){
		        System.out.println("primeiro");
		    }
		    else if (X < 0 && Y > 0){
		        System.out.println("segundo");
		    }
		    else if(X > 0 && Y < 0){
		        System.out.println("quarto");
		    }
		    else{
		        System.out.println("terceiro");
		    }
		}
	}
}
