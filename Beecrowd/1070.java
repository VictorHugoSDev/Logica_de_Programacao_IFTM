import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    // criar o leitor de entrada
	    Scanner s = new Scanner(System.in);
	    // codigos para entrada de dados
	    int n = s.nextInt();
	    int impar = 0;
        
        if(n % 2 == 0){
            for(int i = 0; i < 12; i++){
                n = n + 1;
                if (n % 2 != 0){
                    System.out.println(n);
                }
                
            }
        }
        else{
            for(int j=0; j<6; j++){
                System.out.println(n);
                n = n + 2;
            }
        }
	   
	   
	}
}

