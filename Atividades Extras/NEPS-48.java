import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int dias = s.nextInt();
		int total = 0;
		int i = 0;
		
		for(i = 0; i < dias && total < 1000000;i++){
		    int visu = s.nextInt();
		    
		    if(total < 1000000){
		        total += visu;
		    }
		}
		System.out.println(i);
	}
}
