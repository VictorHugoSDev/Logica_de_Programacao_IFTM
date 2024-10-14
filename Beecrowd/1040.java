import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	  
	    float n1 = s.nextFloat();
	    float n2 = s.nextFloat();
	    float n3 = s.nextFloat();
	    float n4 = s.nextFloat();
	    
	    float media = ((n1*2) + (n2*3) + (n3*4) + (n4*1))/10;
	    
	    if(media >= 7.0){
	        System.out.printf("Media: %.1f\n", media);
	        System.out.println("Aluno aprovado.");
	    }
	    else if(media < 5.0){
	        System.out.printf("Media: %.1f\n", media);
	        System.out.println("Aluno reprovado.");
	    }
	    else{
	        System.out.printf("Media: %.1f\n", media);
	        System.out.println("Aluno em exame.");
	        float n5 = s.nextFloat();
	        System.out.println("Nota do exame: " + n5);
	        float nmedia = (media + n5)/2;
	        
	        if(nmedia > 5.0){
	            System.out.println("Aluno aprovado.");
	            System.out.printf("Media final: %.1f\n", nmedia);
	        }
	        else{
	            System.out.println("Aluno reprovado.");
	        }
	    }
	    
	}
}
