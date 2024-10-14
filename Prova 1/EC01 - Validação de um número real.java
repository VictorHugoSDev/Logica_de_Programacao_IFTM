import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x = s.nextDouble();
		
	    if(x >= 0 && x <=200){
	        System.out.println("Valido");
	    }
	    else{
	        System.out.println("Invalido");
	    }
		
	}
}
