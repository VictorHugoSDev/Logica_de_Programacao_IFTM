import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		s.nextLine();
		
		for(int i = 1; i <= x; i++){
		    String[] escolhas = s.nextLine().split(" ");
		    String sheldon = escolhas[0];
		    String raj = escolhas[1];
		    String reacao;
		    
		    if(sheldon.equals(raj)){
		        reacao = " De novo!";
		    }
		    else if(
		        (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) ||
            (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) ||
            (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) ||
            (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) ||
            (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))))
            {
              reacao = " Bazinga!";}      
        else{
              reacao = " Raj trapaceou!";}
            
            System.out.println("Caso #" + i + ":" + reacao);
		}
	}
}
