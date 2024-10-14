import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		int N1 = n1;
		int N2 = n2;
		int N3 = n3;
		
		if(n1 < n2 && n1 < n3){
		    if(n2 < n3){
		        System.out.println(n1);
		        System.out.println(n2);
		        System.out.println(n3);
		    }
		    else{
		        System.out.println(n1);
		        System.out.println(n3);
		        System.out.println(n2);
		    }
		}
		
		else if(n2 < n1 && n2 < n3){
		    if(n1 < n3){
		        System.out.println(n2);
		        System.out.println(n1);
		        System.out.println(n3);
		    }
		    else{
		        System.out.println(n2);
		        System.out.println(n3);
		        System.out.println(n1);
		    }
		}
		
		else if(n3 < n1 && n3 < n2){
		    if(n1 < n2){
		        System.out.println(n3);
		        System.out.println(n1);
		        System.out.println(n2);
		    }
		    else{
		        System.out.println(n3);
		        System.out.println(n2);
		        System.out.println(n1);
		    }
		}
		
		System.out.println();
		System.out.println(N1);
	    System.out.println(N2);
	    System.out.println(N3);
	
	}
}
