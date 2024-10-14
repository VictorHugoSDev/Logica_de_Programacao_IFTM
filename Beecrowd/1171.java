import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int x = s.nextInt();
    	int numeros[] = new int[x];
    	
    	
    	for(int i=0; i<x; i++){
    	    numeros[i] = s.nextInt();
    	}
    	
    	int [] numerosUnicos = new int[x];
    	int [] frequenciaNumeros = new int[x];
    	int unico = 0;
    	
    	for(int i = 0; i < x; i++){
    	    int valor = numeros[i];
    	    boolean encontrado = false;
    	    
    	    for(int j = 0; j < unico; j++){
    	        if(numerosUnicos[j] == valor){
    	            frequenciaNumeros[j]++;
    	            encontrado = true;
    	            break;
    	        }
    	    }
    	    
    	    if(!encontrado){
    	       numerosUnicos[unico] = valor;
    	       frequenciaNumeros[unico] = 1;
    	       unico++;
    	    }

    	 }
    	 
    	 for (int i = 0; i < unico - 1; i++){
    	     for(int j = i + 1; j < unico; j++){
    	         if(numerosUnicos[i] > numerosUnicos[j]){
    	             int auxNumero = numerosUnicos[i];
    	             numerosUnicos[i] = numerosUnicos[j];
                     numerosUnicos[j] = auxNumero;
                     
                     int auxFrequencia = frequenciaNumeros[i];
                     frequenciaNumeros[i] = frequenciaNumeros[j];
                     frequenciaNumeros[j] =  auxFrequencia;
    	         }
    	     }
    	 }
    	 
         for(int i = 0; i < unico; i++){
              System.out.println(numerosUnicos[i] + " aparece " + frequenciaNumeros[i] + " vez(es)");
         }   
	        
	    
	}
}
