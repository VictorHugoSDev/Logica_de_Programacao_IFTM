import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int M, N;
		
		while(((M = s.nextInt()) > 0) && ((N = s.nextInt()) > 0)){
		    int soma = 0;
		    
		    if(M>N){
		        for(int i = N;i<=M;i++){
		            soma += i;
		            System.out.print(i+" ");
		        }  
		        System.out.println("Sum=" + soma);
		    }
		    else{
		        for(int j = M;j<=N;j++){
		            soma+=j;
		            System.out.print(j+" ");
		        }
		        System.out.println("Sum=" + soma);
		    }
		}
		
	}
}
