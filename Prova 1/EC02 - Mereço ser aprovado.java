import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double nota = s.nextDouble();
		
		double x = (nota*100)/22;
		
		if(nota < 0 || nota > 22){
		    System.out.println("Nota invalida.");
		}
		else{
		    System.out.printf("Eu espero tirar %.2f%% da nota.\n", x);
		}
	   
	}
}
