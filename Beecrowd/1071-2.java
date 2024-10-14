import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);

	    int x = s.nextInt();
	    int y = s.nextInt();
	    int inicio = 0;
	    int fim = 0;
	    int calc = 0;
	    
        if(x < y){
            inicio = x;
            fim = y;
        }
        else{
            inicio = y;
            fim = x;
        }
        
        for(int i=(inicio + 1); i < fim;i++ ){
            if(i % 2 != 0){
                calc+= i;
            }
        }
	    System.out.println(calc);
	}
}

