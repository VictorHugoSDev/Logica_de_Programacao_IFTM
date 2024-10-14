import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        int par[] = new int[5];
        int impar[] = new int[5];
        int aux1 = 0;
        int aux2 = 0;
        
        for(int i =0; i<15;i++){
            int x = s.nextInt();
            
            if(x % 2 == 0){
                par[aux1] = x;
                aux1++;
                
                if(aux1 == 5){
                    aux1 = 0;
                    for(int j = 0; j<5; j++){
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                }
            }
            else{
                impar[aux2] = x;
                aux2 ++;
                if(aux2 == 5){
                    aux2 = 0;
                    for(int j = 0; j<5; j++){
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                }
            }
            
        }
        
        for(int j = 0; j < aux2; j++){
            System.out.println("impar[" + j + "] = " + impar[j]);
        }
        for(int j = 0; j < aux1; j++){
            System.out.println("par[" + j + "] = " + par[j]);
        }
        
	}
}
