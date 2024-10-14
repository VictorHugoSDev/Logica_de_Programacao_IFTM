import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H1, M1, H2, M2;
		int condicao = 1;
		
		while(condicao != 0){
		    H1 = s.nextInt();
		    M1 = s.nextInt();
		    H2 = s.nextInt();
		    M2 = s.nextInt();
		    
		    if(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0){
		        condicao = 0;
		    }else{
		        int resH1 = 0, resH2 = 0, res = 0;
		    
    		    H1 *= 60;
    		    H2 *= 60;
    		    resH1 = H1 + M1;
    		    resH2 = H2 + M2;
    		    
    		    if(resH2 < resH1){
    		        H2 = 1440 + resH2;
    		        res = H2 - resH1;
    		        System.out.println(res);
    		    }
    		    else{
    		        res = resH2 - resH1;
    		        System.out.println(res);
    		    }
		    }
		  }
	}
}
