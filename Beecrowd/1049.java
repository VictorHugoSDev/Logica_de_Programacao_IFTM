import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String tipo1 = s.next();
		String tipo2 = s.next();
		String tipo3 = s.next();
		
		if(tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnivoro")){
		            System.out.println("aguia");
		        }
		else if(tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")){
		            System.out.println("pomba");
		        }
		else if(tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")){
		            System.out.println("homem");
		        }
		else if(tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")){
		            System.out.println("vaca");
		        }
		        
		
		else if(tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")){
		            System.out.println("pulga");
		        }
		else if(tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro")){
		            System.out.println("lagarta");
		        }
		else if(tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")){
		            System.out.println("sanguessuga");
		        }
		else if(tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")){
		            System.out.println("minhoca");
		        }
		else{
		    System.out.println("opcao invalida");
		}

	}
}
