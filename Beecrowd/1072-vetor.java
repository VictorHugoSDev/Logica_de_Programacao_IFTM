import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int in = 0;
		int out = 0;
		int numeros[] = new int[x];
		
		
		for(int i=0; i<x; i++){
		    numeros[i] = s.nextInt();
		}
		
		for(int i=0; i<x;i++){
		    int valor = numeros[i];
		    
		    if(10 <= valor && valor <=20){
		        in++;
		    }
		    else{
		        out++;
		    }
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}
