import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    
	    int valor = s.nextInt();
	    int contadorDentro = 0;
	    int contadorFora = 0;
	    
	    for(int i = 0;i<valor;i++){
	        int digitar = s.nextInt();
	        
	        if(digitar >= 10 && digitar <= 20){
	            contadorDentro++;
	        }
	        else{
	            contadorFora++;
	        }
	    }
        
        System.out.println(contadorDentro + " in");
        System.out.println(contadorFora + " out");
	}
}

